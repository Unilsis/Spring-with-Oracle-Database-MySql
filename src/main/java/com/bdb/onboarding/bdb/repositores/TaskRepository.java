package com.bdb.onboarding.bdb.repositores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdb.onboarding.bdb.entites.TasksEntity;

public interface TaskRepository extends JpaRepository<TasksEntity, Long> {
	List<TasksEntity> findByNameTask(String nameTask);
}
