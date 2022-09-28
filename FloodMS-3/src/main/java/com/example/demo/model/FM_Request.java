package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="FMRequest")
public class FM_Request {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int fm_reqid;
	    
	   @Column(name="VICTIM_ID")
	   private int victim_id;
	   
	   @Temporal(TemporalType.DATE)
	    @Column
	    private Date date = new Date(System.currentTimeMillis());;
	   
	   @Column(name = "REQ_TYPE")
	    private String req_type;
	  
	   @Column(name="Cotton_qty")
	   private int cotton_q;
	    
	   @Column(name="Bandages_qty")
	   private int bandages_q;
	   
	   @Column(name="Dettol_in_liters")
	   private int dettol_q;
	   
	   @Column(name="Pain_Killers_qty")
	   private int painkiller_q;
	   
	   @Column(name="FirstAid_KIT_qty")
	   private int firstaid_q;
	   
	   @Column(name="water_in_liters")
	   private int water_q;
	 
	   @Column(name="Rice_Dal_qty")
	   private int ricedal_q;
	
	   @Column(name="Baby_Food_qty_In_KG")
	   private int babyfood_q;
	
	   @Column(name="Biscuits_qty_In_KG")
	   private int biscuit_q;

	   @Column(name="Milk_in_liters")
	   private int milk_q;
	   
	   

	public FM_Request() {
	}



	public FM_Request(int fm_reqid, int victim_id, Date date, String req_type, int cotton_q, int bandages_q,
			int dettol_q, int painkiller_q, int firstaid_q, int water_q, int ricedal_q, int babyfood_q, int biscuit_q,
			int milk_q) {
		super();
		this.fm_reqid = fm_reqid;
		this.victim_id = victim_id;
		this.date = date;
		this.req_type = req_type;
		this.cotton_q = cotton_q;
		this.bandages_q = bandages_q;
		this.dettol_q = dettol_q;
		this.painkiller_q = painkiller_q;
		this.firstaid_q = firstaid_q;
		this.water_q = water_q;
		this.ricedal_q = ricedal_q;
		this.babyfood_q = babyfood_q;
		this.biscuit_q = biscuit_q;
		this.milk_q = milk_q;
	}



	public int getFm_reqid() {
		return fm_reqid;
	}



	public void setFm_reqid(int fm_reqid) {
		this.fm_reqid = fm_reqid;
	}



	public int getVictim_id() {
		return victim_id;
	}



	public void setVictim_id(int victim_id) {
		this.victim_id = victim_id;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getReq_type() {
		return req_type;
	}



	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}



	public int getCotton_q() {
		return cotton_q;
	}



	public void setCotton_q(int cotton_q) {
		this.cotton_q = cotton_q;
	}



	public int getBandages_q() {
		return bandages_q;
	}



	public void setBandages_q(int bandages_q) {
		this.bandages_q = bandages_q;
	}



	public int getDettol_q() {
		return dettol_q;
	}



	public void setDettol_q(int dettol_q) {
		this.dettol_q = dettol_q;
	}



	public int getPainkiller_q() {
		return painkiller_q;
	}



	public void setPainkiller_q(int painkiller_q) {
		this.painkiller_q = painkiller_q;
	}



	public int getFirstaid_q() {
		return firstaid_q;
	}



	public void setFirstaid_q(int firstaid_q) {
		this.firstaid_q = firstaid_q;
	}



	public int getWater_q() {
		return water_q;
	}



	public void setWater_q(int water_q) {
		this.water_q = water_q;
	}



	public int getRicedal_q() {
		return ricedal_q;
	}



	public void setRicedal_q(int ricedal_q) {
		this.ricedal_q = ricedal_q;
	}



	public int getBabyfood_q() {
		return babyfood_q;
	}



	public void setBabyfood_q(int babyfood_q) {
		this.babyfood_q = babyfood_q;
	}



	public int getBiscuit_q() {
		return biscuit_q;
	}



	public void setBiscuit_q(int biscuit_q) {
		this.biscuit_q = biscuit_q;
	}



	public int getMilk_q() {
		return milk_q;
	}



	public void setMilk_q(int milk_q) {
		this.milk_q = milk_q;
	}



	@Override
	public String toString() {
		return "FM_Request [fm_reqid=" + fm_reqid + ", victim_id=" + victim_id + ", date=" + date + ", req_type="
				+ req_type + ", cotton_q=" + cotton_q + ", bandages_q=" + bandages_q + ", dettol_q=" + dettol_q
				+ ", painkiller_q=" + painkiller_q + ", firstaid_q=" + firstaid_q + ", water_q=" + water_q
				+ ", ricedal_q=" + ricedal_q + ", babyfood_q=" + babyfood_q + ", biscuit_q=" + biscuit_q + ", milk_q="
				+ milk_q + "]";
	}
	
	


	
	
   
}
