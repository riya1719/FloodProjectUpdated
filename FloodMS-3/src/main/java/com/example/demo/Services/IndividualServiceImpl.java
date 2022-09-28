package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Donation;
import com.example.demo.repository.IndividualRepository;

@Service
public class IndividualServiceImpl implements IndividualService {
	
	@Autowired
	private  IndividualRepository  individualRepository;
	
	@Override
	public 	Donation addIndividual(Donation individuals)
 {
		
		individualRepository.save(individuals);
		return individuals;
	}


	@Override
	public List<Donation> getIndividual() {
		
		//findall return all Individual
		return individualRepository.findAll();
		
	}



}

