package com.app.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.model.Location;

@Component
public interface ILocationDao {

	public Integer saveLocation(Location loc);
	public List<Location> getLocation();
}
