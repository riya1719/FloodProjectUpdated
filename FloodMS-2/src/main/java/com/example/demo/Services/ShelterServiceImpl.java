package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Shelter;
import com.example.demo.repository.ShelterRepository;


@Service
public class ShelterServiceImpl implements  ShelterService{

	
	@Autowired
	  private  ShelterRepository  shelterRepository;


	@Override
	public 	Shelter addShelter(Shelter shelters)
 {
		
		shelterRepository.save(shelters);
		return shelters;
	}
	@Override
	public List<Shelter> getShelter() {
		
		//findall return all Individual
		return shelterRepository.findAll();
		
	}




}
