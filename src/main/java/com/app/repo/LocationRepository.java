package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>
{
	
}