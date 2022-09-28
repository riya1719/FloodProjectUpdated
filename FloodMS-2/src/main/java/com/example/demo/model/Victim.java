package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Victim ") // Victim Table
public class Victim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int VC_ID;
	
	@Column(name = "VICTIM_NAME")
    private String vfirstName;
	
	@Column(name = "LAST_NAME")
    private String vlastName;
	
	@Column(name = "VICTIM_CONTACT")
    private long vMobno;
	
	@Column(name = "VICTIM_ADD")
    private String vAddress;
	
	@Column(name = "VICTIM_CITY")
    private String vCity;
	
	@Column(name = "VICTIM_EMAIL")
    private String vEmail;
	
	@Column(name = "VICTIM_USER")
    private String vUserName;
	
	@Column(name = "VICTIM_PASS")
    private String vPassword;
    
    public Victim()
    {
    	
    }

	
	


	public Victim(int vC_ID, String vfirstName, String vlastName, long vMobno, String vAddress, String vCity,
			String vEmail, String vUserName, String vPassword) {
		super();
		VC_ID = vC_ID;
		this.vfirstName = vfirstName;
		this.vlastName = vlastName;
		this.vMobno = vMobno;
		this.vAddress = vAddress;
		this.vCity = vCity;
		this.vEmail = vEmail;
		this.vUserName = vUserName;
		this.vPassword = vPassword;
	}





	public int getVC_ID() {
		return VC_ID;
	}

	public void setVC_ID(int vC_ID) {
		VC_ID = vC_ID;
	}

	public String getVfirsttName() {
		return vfirstName;
	}

	public void setVfirsttName(String vfirsttName) {
		this.vfirstName = vfirsttName;
	}

	public String getVlastName() {
		return vlastName;
	}

	public void setVlastName(String vlastName) {
		this.vlastName = vlastName;
	}

	public long getvMobno() {
		return vMobno;
	}

	public void setvMobno(long vMobno) {
		this.vMobno = vMobno;
	}

	public String getvAddress() {
		return vAddress;
	}

	public void setvAddress(String vAddress) {
		this.vAddress = vAddress;
	}

	public String getvCity() {
		return vCity;
	}

	public void setvCity(String vCity) {
		this.vCity = vCity;
	}

	public String getvEmail() {
		return vEmail;
	}

	public void setvEmail(String vEmail) {
		this.vEmail = vEmail;
	}

	public String getvUserName() {
		return vUserName;
	}

	public void setvUserName(String vUserName) {
		this.vUserName = vUserName;
	}

	public String getvPassword() {
		return vPassword;
	}

	public void setvPassword(String vPassword) {
		this.vPassword = vPassword;
	}

	@Override
	public String toString() {
		return "Victim [VC_ID=" + VC_ID + ", vfirstName=" + vfirstName + ", vlastName=" + vlastName + ", vMobno="
				+ vMobno + ", vAddress=" + vAddress + ", vCity=" + vCity + ", vEmail=" + vEmail + ", vUserName="
				+ vUserName + ", vPassword=" + vPassword + "]";
	}
   
    

}
