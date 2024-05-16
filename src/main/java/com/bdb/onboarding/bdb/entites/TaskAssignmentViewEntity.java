package com.bdb.onboarding.bdb.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "vwtbltasksassignment")
@Entity
public class TaskAssignmentViewEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameAssignee;
	private String nameCandidateUser;
	private String nameCandidateGroup;
    public String getNameAssignee() {
		return nameAssignee;
	}
	public void setNameAssignee(String nameAssignee) {
		this.nameAssignee = nameAssignee;
	}
	public String getNameCandidateUser() {
		return nameCandidateUser;
	}
	public void setNameCandidateUser(String nameCandidateUser) {
		this.nameCandidateUser = nameCandidateUser;
	}
	public String getNameCandidateGroup() {
		return nameCandidateGroup;
	}
	public void setNameCandidateGroup(String nameCandidateGroup) {
		this.nameCandidateGroup = nameCandidateGroup;
	}
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getFKTasks() {
		return FKTasks;
	}
	public void setFKTasks(Integer fKTasks) {
		FKTasks = fKTasks;
	}
	private Integer FKTasks;
}
