package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ShelterRequest;

@Service
public interface ShelterRequestService {

	ShelterRequest  addShelterRequest(ShelterRequest  shelterRequests);
	
	public List<ShelterRequest> getShelterRequest ();  
	
	
}
