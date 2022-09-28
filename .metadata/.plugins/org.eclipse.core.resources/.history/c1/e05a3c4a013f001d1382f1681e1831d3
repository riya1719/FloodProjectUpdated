package com.example.demo.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Table(name = "Individual")
public class Individual {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IN_ID;
	
	@Column(name="IN_FNAME")
	private String IN_FNAME;
	
	@Column(name="IN_LNAME")
	private String IN_LNAME;
	
	@Column(name="IN_ADDRESS")
	private String IN_ADDRESS;
	
	@Column(name="IN_City")
	private String IN_City;
	
	@Column(name="IN_CONTACT")
	private int IN_CONTACT;
	@Column(name="IN_EMAIL")
	private String IN_EMAIL;
	@Column(name="DONATION_TYPE")
	private String DONATION_TYPE;
	
	@Column(name="AMOUNT")
	private int AMOUNT;
	
	@Column(name="Transaction_ID")
	private int txID;
	
	public Individual() {
		
	}
	
	public Individual(int iN_ID, String iN_FNAME, String iN_LNAME, String iN_ADDRESS, String iN_City, int iN_CONTACT,
			String iN_EMAIL, String dONATION_TYPE, int aMOUNT, int txID) {
		super();
		IN_ID = iN_ID;
		IN_FNAME = iN_FNAME;
		IN_LNAME = iN_LNAME;
		IN_ADDRESS = iN_ADDRESS;
		IN_City = iN_City;
		IN_CONTACT = iN_CONTACT;
		IN_EMAIL = iN_EMAIL;
		DONATION_TYPE = dONATION_TYPE;
		AMOUNT = aMOUNT;
		this.txID = txID;
	}

	@Override
	public String toString() {
		return "Individual [IN_ID=" + IN_ID + ", IN_FNAME=" + IN_FNAME + ", IN_LNAME=" + IN_LNAME + ", IN_ADDRESS="
				+ IN_ADDRESS + ", IN_City=" + IN_City + ", IN_CONTACT=" + IN_CONTACT + ", IN_EMAIL=" + IN_EMAIL
				+ ", DONATION_TYPE=" + DONATION_TYPE + ", AMOUNT=" + AMOUNT + ", txID=" + txID + "]";
	}



	


	

	}


