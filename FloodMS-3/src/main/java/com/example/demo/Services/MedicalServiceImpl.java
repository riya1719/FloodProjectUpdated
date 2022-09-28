package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodAndMedical;
import com.example.demo.repository.MedicalRepository;

@Service
public class MedicalServiceImpl implements MedicalService {
	
	
	@Autowired
	private MedicalRepository medicalRepository;
	
	@Override
	public FoodAndMedical addMedical(FoodAndMedical medicals) {
		
		medicalRepository.save(medicals);
		return medicals;
	}


	@Override
	public List<FoodAndMedical> getMedical() {
		
		//findall return all Medical
		return medicalRepository.findAll();
		
	}

}
