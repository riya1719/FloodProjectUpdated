package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Medical;
import com.example.demo.repository.MedicalRepository;

@Service
public class MedicalServiceImpl implements MedicalService {
	
	
	@Autowired
	private MedicalRepository medicalRepository;
	
	@Override
	public Medical addMedical(Medical medicals) {
		
		medicalRepository.save(medicals);
		return medicals;
	}


	@Override
	public List<Medical> getMedical() {
		
		//findall return all Medical
		return medicalRepository.findAll();
		
	}

}
