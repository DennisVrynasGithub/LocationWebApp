package com.dennis.location.service;

import java.util.List;


import com.dennis.location.entities.Location;

public interface LocationServices {

	Location saveLocation(Location location);
	
	Location updateLocation(Location location);
	
	void deleteLocation(Location location);
	
	Location getLocationById(int id);
	
	List<Location> getAllLocations();
}

