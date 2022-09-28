package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "Organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "N_TYPEOF_ORGANIZATION")
	private String N_TYPEOF_ORGANIZATION;
	
	@Column(name = "N_NAMEOF_ORG")
	private String  N_NAMEOF_ORG ;
	
	@Column(name = "N_NAMEOF_AUTH")
	private String N_NAMEOF_AUTH;
	
	@Column(name = "N_REGISTRATION_ID")
	private String N_REGISTRATION_ID;
	
	@Column(name = "N_ADDRESS")
	private String N_ADDRESS;
	
	@Column(name = "N_CITYNAME")
	private String N_CITYNAME;
	
	@Column(name = "N_CONTACT")
	private int N_CONTACT;
	
	@Column(name = "N_EMAIL")
	private String N_EMAIL ;
	
	@Column(name = "N_WEBSITE")
	private String  N_WEBSITE;
	
	@Column(name = "N_USERID")
	private String  N_USERID;
	
	@Column(name = "N_PASSWARD")
	private String N_PASSWARD ;
	
	
	public Organization()
	{
	
	}
	
	
	public Organization(int id, String n_TYPEOF_ORGANIZATION, String n_NAMEOF_ORG, String n_NAMEOF_AUTH,
			String n_REGISTRATION_ID, String n_ADDRESS, String n_CITYNAME, int n_CONTACT, String n_EMAIL,
			String n_WEBSITE, String n_USERID, String n_PASSWARD) {
		super();
		this.id = id;
		N_TYPEOF_ORGANIZATION = n_TYPEOF_ORGANIZATION;
		N_NAMEOF_ORG = n_NAMEOF_ORG;
		N_NAMEOF_AUTH = n_NAMEOF_AUTH;
		N_REGISTRATION_ID = n_REGISTRATION_ID;
		N_ADDRESS = n_ADDRESS;
		N_CITYNAME = n_CITYNAME;
		N_CONTACT = n_CONTACT;
		N_EMAIL = n_EMAIL;
		N_WEBSITE = n_WEBSITE;
		N_USERID = n_USERID;
		N_PASSWARD = n_PASSWARD;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getN_TYPEOF_ORGANIZATION() {
		return N_TYPEOF_ORGANIZATION;
	}
	public void setN_TYPEOF_ORGANIZATION(String n_TYPEOF_ORGANIZATION) {
		N_TYPEOF_ORGANIZATION = n_TYPEOF_ORGANIZATION;
	}
	public String getN_NAMEOF_ORG() {
		return N_NAMEOF_ORG;
	}
	public void setN_NAMEOF_ORG(String n_NAMEOF_ORG) {
		N_NAMEOF_ORG = n_NAMEOF_ORG;
	}
	public String getN_NAMEOF_AUTH() {
		return N_NAMEOF_AUTH;
	}
	public void setN_NAMEOF_AUTH(String n_NAMEOF_AUTH) {
		N_NAMEOF_AUTH = n_NAMEOF_AUTH;
	}
	public String getN_REGISTRATION_ID() {
		return N_REGISTRATION_ID;
	}
	public void setN_REGISTRATION_ID(String n_REGISTRATION_ID) {
		N_REGISTRATION_ID = n_REGISTRATION_ID;
	}
	public String getN_ADDRESS() {
		return N_ADDRESS;
	}
	public void setN_ADDRESS(String n_ADDRESS) {
		N_ADDRESS = n_ADDRESS;
	}
	public String getN_CITYNAME() {
		return N_CITYNAME;
	}
	public void setN_CITYNAME(String n_CITYNAME) {
		N_CITYNAME = n_CITYNAME;
	}
	public int getN_CONTACT() {
		return N_CONTACT;
	}
	public void setN_CONTACT(int n_CONTACT) {
		N_CONTACT = n_CONTACT;
	}
	public String getN_EMAIL() {
		return N_EMAIL;
	}
	public void setN_EMAIL(String n_EMAIL) {
		N_EMAIL = n_EMAIL;
	}
	public String getN_WEBSITE() {
		return N_WEBSITE;
	}
	public void setN_WEBSITE(String n_WEBSITE) {
		N_WEBSITE = n_WEBSITE;
	}
	public String getN_USERID() {
		return N_USERID;
	}
	public void setN_USERID(String n_USERID) {
		N_USERID = n_USERID;
	}
	public String getN_PASSWARD() {
		return N_PASSWARD;
	}
	public void setN_PASSWARD(String n_PASSWARD) {
		N_PASSWARD = n_PASSWARD;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", N_TYPEOF_ORGANIZATION=" + N_TYPEOF_ORGANIZATION + ", N_NAMEOF_ORG="
				+ N_NAMEOF_ORG + ", N_NAMEOF_AUTH=" + N_NAMEOF_AUTH + ", N_REGISTRATION_ID=" + N_REGISTRATION_ID
				+ ", N_ADDRESS=" + N_ADDRESS + ", N_CITYNAME=" + N_CITYNAME + ", N_CONTACT=" + N_CONTACT + ", N_EMAIL="
				+ N_EMAIL + ", N_WEBSITE=" + N_WEBSITE + ", N_USERID=" + N_USERID + ", N_PASSWARD=" + N_PASSWARD + "]";
	}
	
	
}
