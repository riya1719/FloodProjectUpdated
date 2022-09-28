package com.example.demo.controller;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ShelterService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Shelter;
import com.example.demo.repository.ShelterRepository;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ShelterController {
	
	@Autowired               //making obj of interface which is not allowedd
	private ShelterService shelterService;
	
	@PostMapping("/shelters")  //post method mapping for url request (/Shelter)
	public Shelter addShelter(@RequestBody Shelter shelters) {
		return this.shelterService.addShelter(shelters);
	}
	
	@GetMapping("/shelters")
	public List<Shelter> getShelter(){	
	    return this.shelterService.getShelter();
	}
	

	

}
