package com.example.demo.Services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.RescueRequest;
import com.example.demo.model.Victim;
import com.example.demo.repository.VictimRepository;

@Service
public class VictimServiceImpl implements VictimService {
	
	@Autowired
	private VictimRepository victimRepository;
	
//	@Autowired
//	public RescueRequest rescueRequest;
	
	
	@Override
	public Victim addVictim(Victim victims) {
		
		victimRepository.save(victims);
		return victims;
	}

	@Override
	public List<Victim> getVictim() 
	//find all o return all vicitms
	{		
		return victimRepository.findAll();
		
	}
	 
	    @Override // Find By ID
		public ResponseEntity<Victim> getVictimById(long vid)
		{
	    	Victim victim = victimRepository.findById(vid)
	    	.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
			return ResponseEntity.ok(victim);
}
	    
	    @Override // Delete By ID
		public ResponseEntity<Victim> deleteVictimById(long vid)
		{
	    	Victim victim = victimRepository.findById(vid)
	    	.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
	    	
	    	victimRepository.delete(victim); 
	    	
			return ResponseEntity.ok(victim);
}
	    
		@Override 
		public List<Victim> find()
		{
			List<Victim> listVictim = new ArrayList<>();
			listVictim = victimRepository.findAll();
			return listVictim;
		}


		@Override //Login
		public List<Victim> getUsername(String vname,String vpass)
		{
			List<Victim> listVictim = new ArrayList<>();
			listVictim = victimRepository.getVictimByName(vname,vpass);
			return listVictim;
		}
		
		// Victim Rescue Request
		public ResponseEntity<Victim> rescueReq(long vid,int count)// Victim victims
		{
			Victim victim = victimRepository.findById(vid)
			.orElseThrow(() -> new ResourceNotFoundException("Victim does not exit with id: " + vid));
			
			// victim.setV_addr(victims.getV_addr());
			RescueRequest resreq = new RescueRequest();
			resreq.setV_count(count);
			victim.setRescueRequest(resreq);
									
			Victim updatedVictim = victimRepository.save(victim);
		return ResponseEntity.ok(updatedVictim);

		}
		
		// Details of victim and rescue req
		public List<Victim> getDetailOfrequest()
		{
			List<Victim> listVictim = new ArrayList<>();
			listVictim = victimRepository.getDetails();
			return listVictim;
		}
		
		

	    
	    
}
