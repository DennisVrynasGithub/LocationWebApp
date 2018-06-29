package com.dennis.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dennis.location.entities.Location;
import com.dennis.location.service.LocationServices;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LocationController {

	@Autowired
	LocationServices locationService;

	// To annotation einia gia to ti url tha grapsoume
	// gia an to vroume sto internet
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation"; // Einai to jsparxeio pou exoume
	}

	
	@RequestMapping("/saveLoc")
	//@ModelAttribute einai gia otan exoume na perasoume olokliro object i pinaka dld List
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationService.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		modelMap.addAttribute("msg", msg); // To modelMap einai response gia to jsp arxeio
		return "createLocation";
	}

	@RequestMapping("/displayLocation")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}

	@RequestMapping("/deleteLocation")
	//@RequestParam gia parametro sto url
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		// Location location = locationService.getLocationById(id);
		Location location = new Location();  // diaforetikos tropos tis panw grammis
		location.setId(id);
		locationService.deleteLocation(location);
		// afou diagrapsei ksanafortwnei ta antikeimena
		List<Location> locations = locationService.getAllLocations(); 
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}

	@RequestMapping("/showLocation")
	public String showLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location locations = locationService.getLocationById(id);
		modelMap.addAttribute("location", locations);
		return "updateLocation";
	}

	@RequestMapping("/updateLoc")
	public String showLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		locationService.updateLocation(location);
		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}

}
