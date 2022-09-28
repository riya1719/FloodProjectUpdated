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
import com.example.demo.Services.VictimService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.VictimRepository;
import com.example.demo.model.Victim;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class VictimController {
	
	@Autowired               //making obj of interface which is not allowedd
	private VictimService victimService;
	
	@PostMapping("/victims")  //post method mapping for url request (/victims)
	public Victim addVictim(@RequestBody Victim victims) {
		return this.victimService.addVictim(victims);
	}
	
	@GetMapping("/victims")
	public List<Victim> getVictim(){	
	    return this.victimService.getVictim();
	}


}