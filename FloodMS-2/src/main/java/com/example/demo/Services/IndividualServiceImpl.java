package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Individual;
import com.example.demo.repository.IndividualRepository;

@Service
public class IndividualServiceImpl implements IndividualService {
	
	@Autowired
	private  IndividualRepository  individualRepository;
	
	@Override
	public 	Individual addIndividual(Individual individuals)
 {
		
		individualRepository.save(individuals);
		return individuals;
	}


	@Override
	public List<Individual> getIndividual() {
		
		//findall return all Individual
		return individualRepository.findAll();
		
	}



}
