package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Donation;

@Service
public interface IndividualService {

	Donation addIndividual(Donation individuals);
	
	public List<Donation> getIndividual(); 
}
