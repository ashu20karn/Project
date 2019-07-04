package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Location;
import com.app.repo.LocationRepository;
import com.app.service.ILocationService;

@Repository
public class LocationDaoImpl implements ILocationService{

	@Autowired
	private LocationRepository repo;
	
	@Transactional
	public Integer saveLocation(Location loc) {
		loc = repo.save(loc);
		return loc.getlId();
	}
	public List<Location> getLocation(){
		return repo.findAll();
	}

}
