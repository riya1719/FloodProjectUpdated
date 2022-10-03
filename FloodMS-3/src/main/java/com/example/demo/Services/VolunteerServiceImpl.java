package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Volunteer;
import com.example.demo.repository.VolunteerRepository;
@Service
public class VolunteerServiceImpl implements VolunteerService{
	
	@Autowired
	private VolunteerRepository volunteerRepository;
	
	
	@Override
	public Volunteer addVolunteer(Volunteer volunteers) {
		
		volunteerRepository.save(volunteers);
		return volunteers;
	}


	@Override
	public List<Volunteer> getVolunteer() {
		
		//findAll return all volunteers
		return volunteerRepository.findAll();
		
	}
	// Login
	public Volunteer getVolunteer(String name,String password)
	{
		Volunteer volunteer = new Volunteer();
		volunteer = volunteerRepository.getVolunteer(name,password);

		return volunteer;
	}


	

}
