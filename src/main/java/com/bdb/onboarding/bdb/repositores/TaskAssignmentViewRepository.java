package com.bdb.onboarding.bdb.repositores;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.bdb.onboarding.bdb.entites.TaskAssignmentViewEntity;

public interface TaskAssignmentViewRepository extends JpaRepository<TaskAssignmentViewEntity, Long> {
	 @Query("SELECT t FROM TaskAssignmentViewEntity t WHERE t.FKTasks = :FKTasks")
    List<TaskAssignmentViewEntity> findByFkTasks(int FKTasks);
}