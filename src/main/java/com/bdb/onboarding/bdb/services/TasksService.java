package com.bdb.onboarding.bdb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bdb.onboarding.bdb.entites.TaskAssignmentViewEntity;
import com.bdb.onboarding.bdb.entites.TasksAssignmentEntity;
import com.bdb.onboarding.bdb.repositores.TaskAssignmentViewRepository;
import com.bdb.onboarding.bdb.repositores.TasksAssignmentRepository;

@Service
public class TasksService {
    private final TasksAssignmentRepository taskRepository;
    private final TaskAssignmentViewRepository taskAssignmentViewRepository;

    public TasksService(
    		TasksAssignmentRepository taskRepository,
    		TaskAssignmentViewRepository taskAssignmentViewRepository
    		) {
        this.taskRepository = taskRepository;
        this.taskAssignmentViewRepository = taskAssignmentViewRepository;
    }

    public TasksAssignmentEntity findById(Long id) {
        Optional<TasksAssignmentEntity> getTaskId = taskRepository.findById(id);
        return getTaskId.orElse(null);
    }
    
    public List<TasksAssignmentEntity> findByFkTask(int FKTasks) {
        return taskRepository.findByFkTask(FKTasks);
    }

    public TasksAssignmentEntity save(TasksAssignmentEntity tasksAssignmentEntity) {
        return taskRepository.save(tasksAssignmentEntity);
    }

    public void deleteById(Long id) {
    	taskRepository.deleteById(id);
    }

    public List<TaskAssignmentViewEntity> findByFkTaskView(int FKTasks) {
        return taskAssignmentViewRepository.findByFkTasks(FKTasks);
    }
}
