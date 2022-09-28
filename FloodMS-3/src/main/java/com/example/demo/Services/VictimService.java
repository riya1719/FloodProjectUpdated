package com.example.demo.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.Victim;

@Service
public interface VictimService {
	
	Victim addVictim(Victim victims);
	
	public List<Victim> getVictim(); 

}