package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.FoodAndMedical;

@Service
public interface MedicalService {
	
	FoodAndMedical addMedical(FoodAndMedical medicals);
	
	public List<FoodAndMedical> getMedical(); 

}

