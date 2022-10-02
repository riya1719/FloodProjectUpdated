package com.example.demo.Services;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;

import com.example.demo.model.Organization;
import com.example.demo.model.Victim;
import com.example.demo.repository.OrganizationRepository;



@Service
public class OrganizationServiceImpl implements OrganizationService {
	@Autowired
	private OrganizationRepository organizationRepository;
	
	
	@Override
	public Organization addOrganization(Organization organizations) {
		
		organizationRepository.save(organizations);
		return organizations;
	}


	@Override
	public List<Organization> getAllOrganization() {
		
				return organizationRepository.findAll();
		
	}
	
	//Login
	public Organization getOrganization(String name,String password)
	{
		Organization organization = new Organization();
		organization = organizationRepository.getOrganization(name,password);
				
		return organization; 
	}
	
	


}
