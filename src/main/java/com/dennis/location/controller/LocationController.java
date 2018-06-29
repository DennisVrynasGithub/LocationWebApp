package com.dennis.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennis.location.entities.Location;
import com.dennis.location.service.LocationServices;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LocationController {

	@Autowired
	LocationServices locationService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationService.saveLocation(location);
		String msg = "Location saved with id: "+locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
}
