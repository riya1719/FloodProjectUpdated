package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FM_Request;
import com.example.demo.repository.FM_Request_Repository;

@Service
public class FM_RequestServiceImpl implements FM_RequestService {

	@Autowired
	private FM_Request_Repository food_medicalRepository;
	
	@Override
	public FM_Request addFood_Medical_Request(FM_Request food_medicals_request) {
		
		food_medicalRepository.save(food_medicals_request);
		return food_medicals_request;
	}


	@Override
	public List<FM_Request> getFood_Medical_request() {
		
		//findall return all Medical
		return food_medicalRepository.findAll();

    }
}
