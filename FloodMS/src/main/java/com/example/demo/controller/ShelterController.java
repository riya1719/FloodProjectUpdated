package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Shelter;
import com.example.demo.model.Victim;
import com.example.demo.repository.ShelterRepository;


@RestController
@RequestMapping("/api/v1")
public class ShelterController {
	
	@Autowired
	private ShelterRepository shelterRepository ;
		
	// get all shelters
		@GetMapping("/shelters")
		public List<Shelter> getAllShelter()
		{
			return shelterRepository.findAll();
		}
		
		// create Shelter rest API
		@PostMapping ("/shelters")
		public Shelter createShelter(@RequestBody Shelter shelter)
		{
			return shelterRepository.save(shelter);
		}
		
		// get shelter byID Rest API	
		@PostMapping ("/shelters/{id}")
		public ResponseEntity<Shelter> getShelterById(@PathVariable Long id)
		{
			Shelter shelter = shelterRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Shelter does not exit with id: " + id));
		return ResponseEntity.ok(shelter);
		}
		
		 // update shelter rest API
		@PutMapping("/shelters/{id}")
		public ResponseEntity <Shelter> updateShelter(@PathVariable Long id, @RequestBody Shelter shelterDetails)
		{
			Shelter shelter = shelterRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Shelter does not exit with id: " + id));
			
			shelter.setSHELTER_ID(shelterDetails.getSHELTER_ID());
			shelter.setVICTIM_ID(shelterDetails.getVICTIM_ID());
			shelter.setS_DATE(shelterDetails.getS_DATE());

			
			Shelter updatedShelter = shelterRepository.save(shelter);
		return ResponseEntity.ok(updatedShelter);
		}
		
		@DeleteMapping("/shelters/{id}")
		public ResponseEntity <Map<String,Boolean>> deleteShelter(@PathVariable Long id)
		{
			Shelter shelter = shelterRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Shelter does not exit with id: " + id));
					
			shelterRepository.delete(shelter);
			Map<String,Boolean>response = new HashMap<>();
			
				return ResponseEntity.ok(response);
		}
	
	
	
	

}
