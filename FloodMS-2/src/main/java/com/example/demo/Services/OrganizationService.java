package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Organization;

@Service
public interface OrganizationService {
	Organization addOrganization(Organization organization);
	
	public List<Organization> getOrganization(); 
}
