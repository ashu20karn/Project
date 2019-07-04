package com.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import com.app.model.Location;
@Qualifier(value = "iLocationService")
public interface ILocationService {

	public Integer saveLocation(Location p);
	public List<Location> getLocation();
}
