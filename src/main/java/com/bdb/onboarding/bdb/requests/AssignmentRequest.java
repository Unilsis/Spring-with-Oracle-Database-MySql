package com.bdb.onboarding.bdb.requests;

import com.bdb.onboarding.bdb.entites.TasksAssignmentEntity;

public record AssignmentRequest(
		int FKTasks,
		String nameAssignee,
		String nameCandidateUser,
		String nameCandidateGroup
		) {
	public TasksAssignmentEntity toEntity() {
		TasksAssignmentEntity assignment = new TasksAssignmentEntity();

		assignment.setFkTask(FKTasks);
		assignment.setNameAssignee(nameAssignee);
		assignment.setNameCandidateUser(nameCandidateUser);
		assignment.setNameCandidateGroup(nameCandidateGroup);;

        return assignment;
	}
}