package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Shelter;

@Service
public interface ShelterService {
	
	Shelter addShelter(Shelter shelters);
	
	public List<Shelter> getShelter(); 

}
