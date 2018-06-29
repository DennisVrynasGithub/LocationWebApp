package com.dennis.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennis.location.entities.Location;
import com.dennis.location.repos.Locationepository;


@Service
public class LocationServiceImpl implements LocationServices {

	@Autowired
	private Locationepository repo;
	
	public Locationepository getRepo() {
		return repo;
	}

	public void setRepo(Locationepository repo) {
		this.repo = repo;
	}

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return repo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return repo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
        repo.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null); 
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
