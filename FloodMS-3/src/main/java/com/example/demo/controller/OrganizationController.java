package com.example.demo.controller;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Organization;
import com.example.demo.model.Victim;
import com.example.demo.Services.OrganizationService;
import com.example.demo.Services.VictimService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.OrganizationRepository;

import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/v1")
@CrossOrigin
@Service
public class OrganizationController {
	@Autowired               //making obj of interface which is not allowedd
	private OrganizationService organizationService;
	
	@PostMapping("/organizations")  //post method mapping for url request (/victims)
	public Organization addOrganization(@RequestBody Organization organizations) {
		return this.organizationService.addOrganization(organizations);
	}
	
	@GetMapping("/organizations")
	public List<Organization> getOrganization(){	
	    return this.organizationService.getOrganization();
	}
	
	

		
}

