package com.bdb.onboarding.bdb.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdb.onboarding.bdb.entites.EntidadeEntity;
import com.bdb.onboarding.bdb.entites.TaskAssignmentViewEntity;
import com.bdb.onboarding.bdb.entites.TasksAssignmentEntity;
import com.bdb.onboarding.bdb.entites.TasksEntity;
import com.bdb.onboarding.bdb.repositores.TaskRepository;
import com.bdb.onboarding.bdb.requests.AssignmentRequest;
import com.bdb.onboarding.bdb.requests.CreateEntiteRequest;
import com.bdb.onboarding.bdb.services.CreateEntityService;
import com.bdb.onboarding.bdb.services.TasksService;

@RestController
public class CreateEntityController {
    public CreateEntityService createEntityService;
    private final TaskRepository taskRepository;
    private final TasksService tasksService;

    public CreateEntityController(CreateEntityService createEntityService, TaskRepository taskRepository, TasksService tasksService) {
        this.createEntityService = createEntityService;
        this.taskRepository = taskRepository;
        this.tasksService = tasksService;
    }

    @PostMapping("config/entidadecreated")
    public ResponseEntity<EntidadeEntity> createEntite(@RequestBody CreateEntiteRequest createEntiteRequest) {
        EntidadeEntity entiteCreated = createEntityService.create(createEntiteRequest.toEntite());
        return new ResponseEntity<>(entiteCreated, HttpStatus.CREATED);
    }
    
    @GetMapping("config/tasks")
    public List<TasksEntity> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("config/task/assignment/real/{FKTasks}")
    public ResponseEntity<TasksAssignmentEntity> getTasksByForeignKey(@PathVariable int FKTasks) {
        List<TasksAssignmentEntity> tasks = tasksService.findByFkTask(FKTasks);
        if (tasks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        TasksAssignmentEntity task = tasks.get(0);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }
    
    @GetMapping("config/task/assignment/{FKTasks}")
    public ResponseEntity<TaskAssignmentViewEntity> tasksByForeignKey(@PathVariable int FKTasks) {
        List<TaskAssignmentViewEntity> tasks = tasksService.findByFkTaskView(FKTasks);
        if (tasks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        TaskAssignmentViewEntity task = tasks.get(0);
        return new ResponseEntity<>(task, HttpStatus.OK);
        /*
        if (tasks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tasks, HttpStatus.OK); */
    }
    
    @GetMapping("config/task/assignment/dd/{FKTasks}")
    public ResponseEntity<TaskAssignmentViewEntity> _tasksByForeignKey(@PathVariable int FKTasks) {
        List<TaskAssignmentViewEntity> tasks = tasksService.findByFkTaskView(FKTasks);
        if (tasks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        TaskAssignmentViewEntity task = tasks.get(0);
        
        String[] candidateUsers = task.getNameCandidateUser().split(", ");
        for (int i = 0; i < candidateUsers.length; i++) {
            candidateUsers[i] = candidateUsers[i].replaceAll("\"", "");
        }
        task.setNameCandidateUser(String.join(", ", candidateUsers));

        return new ResponseEntity<>(task, HttpStatus.OK);
    }


    @PostMapping("config/newrole/task")
    public ResponseEntity<TasksAssignmentEntity> createRoleForTask(@RequestBody AssignmentRequest assignmentRequest) {
        int FKTask = assignmentRequest.FKTasks();
        String nameCandidateGroup = assignmentRequest.nameCandidateGroup();
        String nameCandidateUser = assignmentRequest.nameCandidateUser();
        String nameAssignee = assignmentRequest.nameAssignee();

        TasksAssignmentEntity task = new TasksAssignmentEntity();
        task.setFkTask(FKTask);
        task.setNameAssignee(nameAssignee);
        task.setNameCandidateUser(nameCandidateUser);
        task.setNameCandidateGroup(nameCandidateGroup);

        TasksAssignmentEntity savedTask = tasksService.save(task);
        System.out.println("Nova role para task salva na BDB");
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    @DeleteMapping("config/deleteTaskAssignment/{id}")
    public ResponseEntity<String> deleteTaskAssignment(@PathVariable Long id) {
    	tasksService.deleteById(id);
        return ResponseEntity.ok("Task assignment with ID " + id + " has been deleted successfully.");
    }
    
    @GetMapping("camunda")
	@ResponseBody
    public String camundateste() throws Exception {
		System.out.println("CAMUNDA BPMN CONSOLE");
		return "CAMUNDA BPMN";
    }
}
