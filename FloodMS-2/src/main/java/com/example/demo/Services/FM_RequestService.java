package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.FM_Request;


@Service
public interface FM_RequestService {

		
		FM_Request addFood_Medical_Request(FM_Request food_medicals_request);
		
		public List<FM_Request> getFood_Medical_request(); 

}
