package com.example.demo.Services;

import java.util.List;

import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.RescueRequest;
import com.example.demo.model.Victim;

@Service
public interface VictimService {
	
	Victim addVictim(Victim victims); //registration (add victim)
	
	public List<Victim> getVictim(); // Display (Get victim)
		    
	ResponseEntity<Victim> getVictimById(long vid); // Find by Id	
	
	ResponseEntity<Victim> deleteVictimById(long vid); // Delete by Id	
	
	List<Victim> find(); //find victim by userdefied query
	 
	List<Victim> getUsername(String vname, String vpass); // login
	
   // RescueReq
    ResponseEntity<Victim>  rescueReq(long vid,int count);
    
    // ShelterReq
    ResponseEntity<Victim> ShelterReq(long vid,long sh_id);
    
    ResponseEntity<Victim> AddMember(long vid,long sh_id,Victim victims);
     
    List<Victim> getDetailsOfRescuerequest(); // All Details Rescue Resquest 
    
    List<Victim> getDetailsOfShelterrequest(); // All Details Shelter Resquest 

	
	
}
