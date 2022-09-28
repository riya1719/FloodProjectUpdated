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
@Table(name = "Shelter_Request")
public class ShelterRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int shelter_reqid;
	
	@Column(name = "VICTIM_ID")
    private int victim_id;
	
	@Column(name = "SHELTER_ID")
    private int shelter_id;
	
	@Temporal(TemporalType.DATE)
    @Column
    private Date date = new Date(System.currentTimeMillis());;
	
	@Column(name = "VC1_NAME")
    private String name1;
	
	@Column(name = "VC1_AGE")
    private int age1;
	
	@Column(name = "GENDER1")
    private String gender1;
	
	@Column(name = "VC2_NAME")
    private String name2;
	
	@Column(name = "VC2_AGE")
    private int age2;
	
	@Column(name = "GENDER2")
    private String gender2;
	
	@Column(name = "VC3_NAME")
    private String name3;
	
	@Column(name = "VC3_AGE")
    private int age3;
	
	@Column(name = "GENDER3")
    private String gender3;
	
	@Column(name = "VC4_NAME")
    private String name4;
	
	@Column(name = "VC4_AGE")
    private int age4;
	
	@Column(name = "GENDER4")
    private String gender4;
	
	@Column(name = "VC5_NAME")
    private String name5;
	
	@Column(name = "VC5_AGE")
    private int age5;
	
	@Column(name = "GENDER5")
    private String gender5;
	
	@Column(name = "VC6_NAME")
    private String name6;
	
	@Column(name = "VC6_AGE")
    private int age6;
	
	@Column(name = "GENDER6")
    private String gender6;
	
	public ShelterRequest() {
	}

	public ShelterRequest(int shelter_reqid, int victim_id, int shelter_id, Date date, String name1, int age1,
			String gender1, String name2, int age2, String gender2, String name3, int age3, String gender3,
			String name4, int age4, String gender4, String name5, int age5, String gender5, String name6, int age6,
			String gender6) {
		super();
		this.shelter_reqid = shelter_reqid;
		this.victim_id = victim_id;
		this.shelter_id = shelter_id;
		this.date = date;
		this.name1 = name1;
		this.age1 = age1;
		this.gender1 = gender1;
		this.name2 = name2;
		this.age2 = age2;
		this.gender2 = gender2;
		this.name3 = name3;
		this.age3 = age3;
		this.gender3 = gender3;
		this.name4 = name4;
		this.age4 = age4;
		this.gender4 = gender4;
		this.name5 = name5;
		this.age5 = age5;
		this.gender5 = gender5;
		this.name6 = name6;
		this.age6 = age6;
		this.gender6 = gender6;
	}

	public int getShelter_reqid() {
		return shelter_reqid;
	}

	public void setShelter_reqid(int shelter_reqid) {
		this.shelter_reqid = shelter_reqid;
	}

	public int getVictim_id() {
		return victim_id;
	}

	public void setVictim_id(int victim_id) {
		this.victim_id = victim_id;
	}

	public int getShelter_id() {
		return shelter_id;
	}

	public void setShelter_id(int shelter_id) {
		this.shelter_id = shelter_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public String getGender1() {
		return gender1;
	}

	public void setGender1(String gender1) {
		this.gender1 = gender1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public String getGender2() {
		return gender2;
	}

	public void setGender2(String gender2) {
		this.gender2 = gender2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public int getAge3() {
		return age3;
	}

	public void setAge3(int age3) {
		this.age3 = age3;
	}

	public String getGender3() {
		return gender3;
	}

	public void setGender3(String gender3) {
		this.gender3 = gender3;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public int getAge4() {
		return age4;
	}

	public void setAge4(int age4) {
		this.age4 = age4;
	}

	public String getGender4() {
		return gender4;
	}

	public void setGender4(String gender4) {
		this.gender4 = gender4;
	}

	public String getName5() {
		return name5;
	}

	public void setName5(String name5) {
		this.name5 = name5;
	}

	public int getAge5() {
		return age5;
	}

	public void setAge5(int age5) {
		this.age5 = age5;
	}

	public String getGender5() {
		return gender5;
	}

	public void setGender5(String gender5) {
		this.gender5 = gender5;
	}

	public String getName6() {
		return name6;
	}

	public void setName6(String name6) {
		this.name6 = name6;
	}

	public int getAge6() {
		return age6;
	}

	public void setAge6(int age6) {
		this.age6 = age6;
	}

	public String getGender6() {
		return gender6;
	}

	public void setGender6(String gender6) {
		this.gender6 = gender6;
	}

	@Override
	public String toString() {
		return "ShelterRequest [shelter_reqid=" + shelter_reqid + ", victim_id=" + victim_id + ", shelter_id="
				+ shelter_id + ", date=" + date + ", name1=" + name1 + ", age1=" + age1 + ", gender1=" + gender1
				+ ", name2=" + name2 + ", age2=" + age2 + ", gender2=" + gender2 + ", name3=" + name3 + ", age3=" + age3
				+ ", gender3=" + gender3 + ", name4=" + name4 + ", age4=" + age4 + ", gender4=" + gender4 + ", name5="
				+ name5 + ", age5=" + age5 + ", gender5=" + gender5 + ", name6=" + name6 + ", age6=" + age6
				+ ", gender6=" + gender6 + "]";
	}
	
	





}
