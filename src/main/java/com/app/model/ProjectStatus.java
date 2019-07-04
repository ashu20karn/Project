package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="projstatus")
@Data
public class ProjectStatus {
	
	@Id
	@GeneratedValue
	private int psId;
	private String status;
	public ProjectStatus() {
		super();
	}
	
	public ProjectStatus(String status) {
		super();
		this.status = status;
	}

	public ProjectStatus(int psId, String status) {
		super();
		this.psId = psId;
		this.status = status;
	}
	

	public int getPsId() {
		return psId;
	}

	public void setPsId(int psId) {
		this.psId = psId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProjectStatus [psId=" + psId + ", status=" + status + "]";
	}
	
	

}
