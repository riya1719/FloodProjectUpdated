package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Rescue_Request")
public class RescueRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int rescue_reqid;
	
	@Column(name = "VICTIM_ID")
    private int victim_id; // fk
	
//	@OneToOne
//    @JoinColumn(name = "fk")
//    private Victim victim;
//	
	@Temporal(TemporalType.DATE)
    @Column
    private Date date = new Date(System.currentTimeMillis());;
	
	@Column(name = "FIRST_NAME")
    private String v_fname;
	
	@Column(name = "LAST_NAME")
    private String v_lname;
	
	@Column(name = "CONTACT")
    private long v_contanct;
	
	@Column(name = "ADDRESS")
    private String v_addr;
	
	@Column(name = "CITY")
    private String v_city;
	
	@Column(name = "COUNT_OF_PEOPLE")
    private int v_count;
	
	
	public RescueRequest() {
		
	}


	public RescueRequest(int rescue_reqid, int victim_id, Date date, String v_fname, String v_lname,
			long v_contanct, String v_addr, String v_city, int v_count) {
		super();
		this.rescue_reqid = rescue_reqid;
		this.victim_id = victim_id;
		//this.victim = victim;
		this.date = date;
		this.v_fname = v_fname;
		this.v_lname = v_lname;
		this.v_contanct = v_contanct;
		this.v_addr = v_addr;
		this.v_city = v_city;
		this.v_count = v_count;
	}
	
	


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getRescue_reqid() {
		return rescue_reqid;
	}


	public void setRescue_reqid(int rescue_reqid) {
		this.rescue_reqid = rescue_reqid;
	}


	public int getVictim_id() {
		return victim_id;
	}


	public void setVictim_id(int victim_id) {
		this.victim_id = victim_id;
	}


//	public Victim getVictim() {
//		return victim;
//	}
//
//
//	public void setVictim(Victim victim) {
//		this.victim = victim;
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


	public long getV_contanct() {
		return v_contanct;
	}


	public void setV_contanct(long v_contanct) {
		this.v_contanct = v_contanct;
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


	public int getV_count() {
		return v_count;
	}


	public void setV_count(int v_count) {
		this.v_count = v_count;
	}


	@Override
	public String toString() {
		return "RescueRequest [rescue_reqid=" + rescue_reqid + ", victim_id=" + victim_id +  ", date=" + date + ", v_fname=" + v_fname + ", v_lname=" + v_lname + ", v_contanct=" + v_contanct
				+ ", v_addr=" + v_addr + ", v_city=" + v_city + ", v_count=" + v_count + "]";
	}
	
	

	

	

	
	
	
	
	

}
