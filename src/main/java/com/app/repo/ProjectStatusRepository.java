package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Location;
import com.app.model.ProjectStatus;

public interface ProjectStatusRepository extends JpaRepository<ProjectStatus, Integer>
{
	
}