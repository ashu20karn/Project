package com.app.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.model.ProjectStatus;

@Component
public interface IProjectStatusDao {
	public Integer saveProjectStatus(ProjectStatus p);
	public List<String> getStatus();
}
