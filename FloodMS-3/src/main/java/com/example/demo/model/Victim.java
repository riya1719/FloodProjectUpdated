package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Victim") // Victim Table
public class Victim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int victim_id;
	
//	@OneToOne(mappedBy = "victim")
//    private RescueRequest rescueRequest;
	
	@Column(name = "FIRST_NAME")
    private String v_fname;
	
	@Column(name = "LAST_NAME")
    private String v_lname;
	
	@Column(name = "CONTACT")
    private long v_contact;
	
	@Column(name = "ADDRESS")
    private String v_addr;
	
	@Column(name = "CITY")
    private String v_city;
	
	@Column(name = "EMAIL")
    private String v_email;
	
	@Column(name = "USERNAME")
    private String username;
	
	@Column(name = "PASSWORD")
    private String password;
	

	public Victim() {
	}


	public Victim(int victim_id, String v_fname, String v_lname, long v_contact,
			String v_addr, String v_city, String v_email, String username, String password) {
		super();
		this.victim_id = victim_id;
		this.v_fname = v_fname;
		this.v_lname = v_lname;
		this.v_contact = v_contact;
		this.v_addr = v_addr;
		this.v_city = v_city;
		this.v_email = v_email;
		this.username = username;
		this.password = password;
	}


	public int getVictim_id() {
		return victim_id;
	}


	public void setVictim_id(int victim_id) {
		this.victim_id = victim_id;
	}


//	public RescueRequest getRescueRequest() {
//		return rescueRequest;
//	}
//
//
//	public void setRescueRequest(RescueRequest rescueRequest) {
//		this.rescueRequest = rescueRequest;
//	}


	public String getV_fname() {
		return v_fname;
	}


	public void setV_fname(String v_fname) {
		this.v_fname = v_fname;
	}


	public String getV_lname() {
		return v_lname;
	}


	public void setV_lname(String v_lname) {
		this.v_lname = v_lname;
	}


	public long getV_contact() {
		return v_contact;
	}


	public void setV_contact(long v_contact) {
		this.v_contact = v_contact;
	}


	public String getV_addr() {
		return v_addr;
	}


	public void setV_addr(String v_addr) {
		this.v_addr = v_addr;
	}


	public String getV_city() {
		return v_city;
	}


	public void setV_city(String v_city) {
		this.v_city = v_city;
	}


	public String getV_email() {
		return v_email;
	}


	public void setV_email(String v_email) {
		this.v_email = v_email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Victim [victim_id=" + victim_id + ", v_fname=" + v_fname
				+ ", v_lname=" + v_lname + ", v_contact=" + v_contact + ", v_addr=" + v_addr + ", v_city=" + v_city
				+ ", v_email=" + v_email + ", username=" + username + ", password=" + password + "]";
	}
	
	


	
	
     

}
