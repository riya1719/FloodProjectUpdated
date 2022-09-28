package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Organization;
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
	public List<Organization> getOrganization() {
		
		//findall o return all Organization
		return organizationRepository.findAll();
		
	}


}
