package com.example.demo.model;

import javax.persistence.Entity;


import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int organization_id;
	
	@Column(name = "TYPE_OF_ORGANIZATION")
	private String toforg;
	
	@Column(name = "ORGANIZATION_NAME")
	private String  org_name ;
	
	@Column(name = "NAME_OF_AUTH")
	private String auth_name;
	
	@Column(name = "REGISTRATION_ID")
	private String reg_id;
	
	@Column(name = "ADDRESS")
	private String org_addr;
	
	@Column(name = "CITY")
	private String org_city;
	
	@Column(name = "CONTACT")
	private int org_contact;
	
	@Column(name = "EMAIL")
	private String org_email ;
	
	@Column(name = "WEBSITE")
	private String  weburl;
	
	@Column(name = "USERNAME")
	private String  username;
	
	@Column(name = "PASSWORD")
	private String password ;

	public Organization() {
	}

	

	
}
