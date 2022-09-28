package com.example.demo.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rescue_Request")
public class RescueRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int vc_reqID;
	
	@Column(name = "VICTIM_ID")
    private int vc_ID;
	
	@Column(name = "VICTIM_NAME")
    private String vc_fname;
	
	@Column(name = "LAST_NAME")
    private String vc_lname;
	
	@Column(name = "VICTIM_CONTACT")
    private long vc_mob;
	
	@Column(name = "VICTIM_ADD")
    private String vc_add;
	
	@Column(name = "VICTIM_CITY")
    private String vc_city;
	
	@Column(name = "COUNT_OF_PEOPLE")
    private int vc_count;
	
	

	public RescueRequest() {
	}

	public RescueRequest(int vc_reqID, int vc_ID, String vc_fname, String vc_lname, long vc_mob, String vc_add,
			String vc_city, int vc_count) {
		super();
		this.vc_reqID = vc_reqID;
		this.vc_ID = vc_ID;
		this.vc_fname = vc_fname;
		this.vc_lname = vc_lname;
		this.vc_mob = vc_mob;
		this.vc_add = vc_add;
		this.vc_city = vc_city;
		this.vc_count = vc_count;
	}

	public int getVc_reqID() {
		return vc_reqID;
	}

	public void setVc_reqID(int vc_reqID) {
		this.vc_reqID = vc_reqID;
	}

	public int getVc_ID() {
		return vc_ID;
	}

	public void setVc_ID(int vc_ID) {
		this.vc_ID = vc_ID;
	}

	public String getVc_fname() {
		return vc_fname;
	}

	public void setVc_fname(String vc_fname) {
		this.vc_fname = vc_fname;
	}

	public String getVc_lname() {
		return vc_lname;
	}

	public void setVc_lname(String vc_lname) {
		this.vc_lname = vc_lname;
	}

	public long getVc_mob() {
		return vc_mob;
	}

	public void setVc_mob(long vc_mob) {
		this.vc_mob = vc_mob;
	}

	public String getVc_add() {
		return vc_add;
	}

	public void setVc_add(String vc_add) {
		this.vc_add = vc_add;
	}

	public String getVc_city() {
		return vc_city;
	}

	public void setVc_city(String vc_city) {
		this.vc_city = vc_city;
	}

	public int getVc_count() {
		return vc_count;
	}

	public void setVc_count(int vc_count) {
		this.vc_count = vc_count;
	}

	@Override
	public String toString() {
		return "RescueRequest [vc_reqID=" + vc_reqID + ", vc_ID=" + vc_ID + ", vc_fname=" + vc_fname + ", vc_lname="
				+ vc_lname + ", vc_mob=" + vc_mob + ", vc_add=" + vc_add + ", vc_city=" + vc_city + ", vc_count="
				+ vc_count + "]";
	}

	

	
	
	
	
	

}