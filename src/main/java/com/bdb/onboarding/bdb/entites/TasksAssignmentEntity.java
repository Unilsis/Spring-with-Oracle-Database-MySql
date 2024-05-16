package com.bdb.onboarding.bdb.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tbltasksassignment")
@Entity
public class TasksAssignmentEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String nameCandidateUser;
    private String nameAssignee;
	private String nameCandidateGroup;
    
    @Column(length = 20, name = "created_at")
    private Date createdAt;
    private Date updatedAt;

    public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Column(name = "FKTasks")
    private Integer fkTask;
    
    public Integer getFkTask() {
		return fkTask;
	}
	public void setFkTask(Integer fkTask) {
		this.fkTask = fkTask;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameCandidateUser() {
		return nameCandidateUser;
	}
	public void setNameCandidateUser(String nameCandidateUser) {
		this.nameCandidateUser = nameCandidateUser;
	}
	public String getNameAssignee() {
		return nameAssignee;
	}
	public void setNameAssignee(String nameAssignee) {
		this.nameAssignee = nameAssignee;
	}
	public String getNameCandidateGroup() {
		return nameCandidateGroup;
	}
	public void setNameCandidateGroup(String nameCandidateGroup) {
		this.nameCandidateGroup = nameCandidateGroup;
	}
}
