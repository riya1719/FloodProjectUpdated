package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Victim ") // medical
public class Victim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int VC_ID;
	
	@Column(name = "VICTIM_NAME")
    private String VC_NAME;
	
	@Column(name = "VICTIM_CONTACT")
    private long VC_CONTACT;
	
	@Column(name = "VICTIM_ADD")
    private String VC_ADDRESS;
	
	@Column(name = "VICTIM_CITY")
    private String VC_CITY;
	
	@Column(name = "VICTIM_EMAIL")
    private String VC_EMAIL;
	
	@Column(name = "VICTIM_USER")
    private String VC_USERID;
	@Column(name = "VICTIM_PASS")
    private String VC_PASSWORD;
    
    public Victim()
    {
    	
    }
    
    public Victim(String vC_NAME, long vC_CONTACT, String vC_ADDRESS, String vC_CITY, String vC_EMAIL, String vC_USERID,
			String vC_PASSWORD) {
		super();
		VC_NAME = vC_NAME;
		VC_CONTACT = vC_CONTACT;
		VC_ADDRESS = vC_ADDRESS;
		VC_CITY = vC_CITY;
		VC_EMAIL = vC_EMAIL;
		VC_USERID = vC_USERID;
		VC_PASSWORD = vC_PASSWORD;
	}
	public int getVC_ID() {
		return VC_ID;
	}
	public void setVC_ID(int vC_ID) {
		VC_ID = vC_ID;
	}
	public String getVC_NAME() {
		return VC_NAME;
	}
	public void setVC_NAME(String vC_NAME) {
		VC_NAME = vC_NAME;
	}
	public long getVC_CONTACT() {
		return VC_CONTACT;
	}
	public void setVC_CONTACT(long vC_CONTACT) {
		VC_CONTACT = vC_CONTACT;
	}
	public String getVC_ADDRESS() {
		return VC_ADDRESS;
	}
	public void setVC_ADDRESS(String vC_ADDRESS) {
		VC_ADDRESS = vC_ADDRESS;
	}
	public String getVC_CITY() {
		return VC_CITY;
	}
	public void setVC_CITY(String vC_CITY) {
		VC_CITY = vC_CITY;
	}
	public String getVC_EMAIL() {
		return VC_EMAIL;
	}
	public void setVC_EMAIL(String vC_EMAIL) {
		VC_EMAIL = vC_EMAIL;
	}
	public String getVC_USERID() {
		return VC_USERID;
	}
	public void setVC_USERID(String vC_USERID) {
		VC_USERID = vC_USERID;
	}
	public String getVC_PASSWORD() {
		return VC_PASSWORD;
	}
	public void setVC_PASSWORD(String vC_PASSWORD) {
		VC_PASSWORD = vC_PASSWORD;
	}
	
    

}
