package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Services.VictimService;

import com.example.demo.model.Victim;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class VictimController {
	
	@Autowired               //making obj of interface which is not allowedd
	private VictimService victimService;
	
	@PostMapping("/victims")  // save victim details
	public Victim addVictim(@RequestBody Victim victims) {
		return this.victimService.addVictim(victims);
	}
	
	@GetMapping("/victims") // display details of victim
	public List<Victim> getVictim(){	
	    return this.victimService.getVictim();
	}

	@GetMapping("/find") // Get all user by query
	public List<Victim> find()
	{
		return this.victimService.find();
	}
	
	//Find victim by ID
	@RequestMapping(path = "/FindById", method = RequestMethod.POST) 
	public ResponseEntity<Victim> getVictimById(@RequestBody Victim victim)   
	{ 
		long vid = victim.getVictim_id();
		
	  return this.victimService.getVictimById(vid);  
	}  
	
	//Delete victim by ID
		@RequestMapping(path = "/DeleteById", method = RequestMethod.POST) 
		public ResponseEntity<Victim> DeleteVictimById(@RequestBody Victim victim)   
		{ 
			long vid = victim.getVictim_id();
			
		  return this.victimService.deleteVictimById(vid);  
		}  
				
	@RequestMapping(path = "/login", method = RequestMethod.POST) // Login
	public List<Victim> getUsername(@RequestBody Victim victim)
	{
		String vname = victim.getUsername();
		String vpass = victim.getPassword();
		System.out.println(vname);
		return this.victimService.getUsername(vname,vpass);
	}
	
	@RequestMapping(path = "/rescueReq", method = RequestMethod.POST) // Resecue Request
	public ResponseEntity <Victim> updateVictim(@RequestBody Victim victims)
	{
		long vid = victims.getVictim_id();
		
		System.out.println(victims.getRescueRequest().getV_count());
		
		int count = victims.getRescueRequest().getV_count();
		System.out.println(count);
		
	return this.victimService.rescueReq(vid,count);
	
	}
	
	@RequestMapping(path = "/Details", method = RequestMethod.GET) 
	// Resecue Request Details

	public List<Victim> getDetailOfrequest()
	{	
		return this.victimService.getDetailOfrequest();
	}
	
	
	
	
	
	
		
}
