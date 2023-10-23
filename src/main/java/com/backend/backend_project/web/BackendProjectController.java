package com.backend.backend_project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.backend_project.domain.ApartmentRepository;
import com.backend.backend_project.domain.BuildingRepository;

@Controller
public class BackendProjectController {
	@Autowired
	private BuildingRepository brepository;
	@Autowired
	private ApartmentRepository arepository;
	
	// Login page
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	// Show all buildings
	@RequestMapping("/buildings")
	public String buildingList(Model model) {
		model.addAttribute("buildings", brepository.findAll());
		return "buildings";
	}
}
