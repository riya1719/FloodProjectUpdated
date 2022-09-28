package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Victim;
import com.example.demo.repository.VictimRepository;

@Service
public class VictimServiceImpl implements VictimService {
	
	@Autowired
	private VictimRepository victimRepository;
	
	
	@Override
	public Victim addVictim(Victim victims) {
		
		victimRepository.save(victims);
		return victims;
	}

	@Override
	public List<Victim> getVictim() {
		
		//findall o return all vicitms
		return victimRepository.findAll();
		
	}

}