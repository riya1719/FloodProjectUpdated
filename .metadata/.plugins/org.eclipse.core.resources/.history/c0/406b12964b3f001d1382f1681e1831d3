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
	private int shelter_id;
	
	@Column(name = "Name")
    private String sh_name;
	
	@Column(name = "Address")
    private String sh_addr;
	
	@Column(name = "City")
    private String sh_city;
	
	@Column(name = "Email")
    private String sh_email;
	
	@Column(name = "Contact")
    private String sh_cont;
	
    public Shelter()
    {
    	
    }



    
}
