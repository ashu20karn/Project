package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.ProjectStatus;
import com.app.repo.ProjectStatusRepository;
import com.app.service.IProjectStatusService;

@Repository
public class ProjectStatusDaoImpl implements IProjectStatusService{

	@Autowired 
	private ProjectStatusRepository repo;
	
	public Integer saveProjectStatus(ProjectStatus p) {
		p = repo.save(p);
		return p.getPsId();
	}

	@Transactional(readOnly= true)
	public List<ProjectStatus> getStatus() {
		return repo.findAll();
	}
	

}
