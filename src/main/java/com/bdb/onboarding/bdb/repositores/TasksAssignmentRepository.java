package com.bdb.onboarding.bdb.repositores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdb.onboarding.bdb.entites.TasksAssignmentEntity;

public interface TasksAssignmentRepository extends JpaRepository<TasksAssignmentEntity, Long> {
	List<TasksAssignmentEntity> findByFkTask(int FKTasks);
}