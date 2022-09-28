package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Shelter")
public class Shelter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Shelter_ID;
	
	@Column(name = "S_Name")
    private String S_Name;
	
	@Column(name = "S_Address")
    private String S_Address;
	
	@Column(name = "S_City")
    private String S_City;
	
	@Column(name = "S_Email")
    private String S_Email;
	
	@Column(name = "S_Contact")
    private String S_Contact;
	
    public Shelter()
    {
    	
    }

	public Shelter(int shelter_ID,  String s_Name, String s_Address, String s_City, String s_Email, String s_Contact) {
		super();
		Shelter_ID = shelter_ID;
		S_Name = s_Name;
		S_Address = s_Address;
		S_City = s_City;
		S_Email = s_Email;
		S_Contact = s_Contact;
	}

	public int getShelter_ID() {
		return Shelter_ID;
	}

	public void setShelter_ID(int shelter_ID) {
		Shelter_ID = shelter_ID;
	}

	public String getS_Name() {
		return S_Name;
	}

	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}

	public String getS_Address() {
		return S_Address;
	}

	public void setS_Address(String s_Address) {
		S_Address = s_Address;
	}

	public String getS_Email() {
		return S_Email;
	}

	public void setS_Email(String s_Email) {
		S_Email = s_Email;
	}

	public String getS_Contact() {
		return S_Contact;
	}

	public void setS_Contact(String s_Contact) {
		S_Contact = s_Contact;
	}

	public String getS_City() {
		return S_City;
	}

	public void setS_City(String s_City) {
		S_City = s_City;
	}

	@Override
	public String toString() {
		return "Shelter [Shelter_ID=" + Shelter_ID + ", S_Name=" + S_Name + ", S_Address=" + S_Address + ", S_City="
				+ S_City + ", S_Email=" + S_Email + ", S_Contact=" + S_Contact + "]";
	}

	
    
    
	

    
}