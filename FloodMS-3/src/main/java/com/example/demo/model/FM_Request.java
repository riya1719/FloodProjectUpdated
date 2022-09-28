package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;


@Entity
@Table(name="FMRequest")
public class FM_Request {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int fm_reqid;
	    
	   @Column(name="VICTIM_ID")
	   private int victim_id;
	   
	   @Column(name = "DATE")
	    private String date;
	   
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
		super();
	}


	
	
   
}