package com.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.model.ProjectStatus;
@Qualifier(value = "iProjectStatusService")
public interface IProjectStatusService {

	public Integer saveProjectStatus(ProjectStatus p);
	public List<ProjectStatus> getStatus();
}
