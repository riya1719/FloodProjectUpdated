package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Volunteer;

@Service
public interface VolunteerService {
	Volunteer addVolunteer(Volunteer Volunteers);
	
	public List<Volunteer> getVolunteer();

}
