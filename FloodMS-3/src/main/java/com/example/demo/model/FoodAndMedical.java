package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FoodAndMedical")
public class FoodAndMedical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_id;
	
	@Column(name = "ITEM_NAME")
    private String item_name;
	
	@Column(name = "ITEM_QTY")
    private int item_qty;
    
    
    public FoodAndMedical()
    {
    	
    }
    
    
    
	

	
    
	
}