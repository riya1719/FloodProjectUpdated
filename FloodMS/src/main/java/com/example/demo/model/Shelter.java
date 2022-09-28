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
	private int BOOKING_ID;
	
	@Column(name = "SHELTER_ID")
    private int SHELTER_ID;
	
	@Column(name = "VICTIM_ID")
    private int VICTIM_ID;
	
	@Column(name = "S_DATE")
    private String S_DATE;
    
   
    public Shelter()
    {
    	
    }
    
	public Shelter(int sHELTER_ID, int vICTIM_ID, String s_DATE) {
		super();
		SHELTER_ID = sHELTER_ID;
		VICTIM_ID = vICTIM_ID;
		S_DATE = s_DATE;
	}
	public int getBOOKING_ID() {
		return BOOKING_ID;
	}
	public void setBOOKING_ID(int bOOKING_ID) {
		BOOKING_ID = bOOKING_ID;
	}
	public int getSHELTER_ID() {
		return SHELTER_ID;
	}
	public void setSHELTER_ID(int sHELTER_ID) {
		SHELTER_ID = sHELTER_ID;
	}
	public int getVICTIM_ID() {
		return VICTIM_ID;
	}
	public void setVICTIM_ID(int vICTIM_ID) {
		VICTIM_ID = vICTIM_ID;
	}
	public String getS_DATE() {
		return S_DATE;
	}
	public void setS_DATE(String s_DATE) {
		S_DATE = s_DATE;
	}

    
}
