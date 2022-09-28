package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ShelterRequestService;
import com.example.demo.model.ShelterRequest;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ShelterRequestController {
	
	@Autowired               //making obj of interface which is not allowedd
	private ShelterRequestService shelterRequestService;
	
	@PostMapping("/ShelterRequests")  //post method mapping for url request (/volunteers)
	public ShelterRequest addShelterRequest(@RequestBody ShelterRequest shelterRequests) {
		return this.shelterRequestService.addShelterRequest(shelterRequests);
	}
	
	@GetMapping("/ShelterRequests")
	public List<ShelterRequest> getShelterRequestRequest(){	
	    return this.shelterRequestService.getShelterRequest();
	}


}
