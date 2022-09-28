package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ShelterRequest;
import com.example.demo.repository.ShelterRequestRepository;

@Service
public class ShelterRequestServiceImpl implements ShelterRequestService {
	
	@Autowired
	private ShelterRequestRepository shelterRequestRepository;
	
	@Override
	public ShelterRequest addShelterRequest(ShelterRequest shelterRequests) {
		
		shelterRequestRepository.save(shelterRequests);
		return shelterRequests;
	}
	
	@Override
	public List<ShelterRequest> getShelterRequest() {
		
		//findall o return all ShelterRequest
		return shelterRequestRepository.findAll();	
	}
}

