package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.LocationDaoImpl;
import com.app.model.Location;
import com.app.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService{

	@Autowired
	private LocationDaoImpl dao;
	
	public Integer saveLocation(Location loc) {
		return dao.saveLocation(loc);
	}
	
	public List<Location> getLocation(){
		return dao.getLocation();
	}

}
