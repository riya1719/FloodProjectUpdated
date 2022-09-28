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
	   private int Item_ID;
	   
	   @Column(name="Req_ID")
	   private int Request_ID;
	   
	   @Column(name="Vic_ID")
	   private int Victim_ID;
	   
	   @Column(name="Item_Name")
	   private String Item_Name;
	   
	   @Column(name="Cotton")
	   private String Cotton;
	   
	   @Column(name="Cotton_qty_in_KG")
	   private int Cotton_QTY;
	   
	   @Column(name="Bandages")
	   private String Bandages;
	   
	   @Column(name="Bandages_qty")
	   private int Bnadages_QTY;
	   
	   @Column(name="Dettol")
	   private String Dettol;
	   
	   @Column(name="Dettol_in_liters")
	   private int Dettol_In_Liters;
	   
	   @Column(name="Pain_Killers")
	   private String PainKillers;
	   
	   @Column(name="Pain_Killers_qty")
	   private int PainKillers_QTY;
	   
	   @Column(name="FirstAid_KIT")
	   private String FirstAid_KIT;
	   
	   @Column(name="FirstAid_KIT_qty")
	   private int FirstAid_QTY;
	   
	   @Column(name="water")
	   private String Water;
	   
	   @Column(name="water_in_liters")
	   private int Water_In_Liters;
	   
	   @Column(name="Rice_Dal_In_KG")
	   private String Rice_Dal;
	   
	   @Column(name="Rice_Dal_qty")
	   private int Rice_Dal_QTY;
	   
	   @Column(name="Baby_Food")
	   private String BabyFood;
	   
	   @Column(name="Baby_Food_qty_In_KG")
	   private int BabyFood_QTY;
	   
	   @Column(name="Biscuits")
	   private String Biscuits;
	   
	   @Column(name="Biscuits_qty_In_KG")
	   private int Biscuits_QTY;
	   
	   @Column(name="Milk")
	   private String Milk;
	   
	   @Column(name="Milk_in_liters")
	   private int Milk_in_Liters;
	   
	   
	   
	   public FM_Request()
	   {
		   
	   }
	  
        public FM_Request(int item_ID, int request_ID, int victim_ID, String item_Name, String cotton, int cotton_QTY,
			String bandages, int bnadages_QTY, String dettol, int dettol_In_Litters, String painKillers,
			int painKillers_QTY, String firstAid_KIT, int firstAid_QTY, String water, int water_In_Liters,
			String rice_Dal, int rice_Dal_QTY, String babyFood, int babyFood_QTY, String biscuits, int biscuits_QTY,
			String milk, int milk_in_Liters) {
		super();
		Item_ID = item_ID;
		Request_ID = request_ID;
		Victim_ID = victim_ID;
		Item_Name = item_Name;
		Cotton = cotton;
		Cotton_QTY = cotton_QTY;
		Bandages = bandages;
		Bnadages_QTY = bnadages_QTY;
		Dettol = dettol;
		Dettol_In_Liters = dettol_In_Litters;
		PainKillers = painKillers;
		PainKillers_QTY = painKillers_QTY;
		FirstAid_KIT = firstAid_KIT;
		FirstAid_QTY = firstAid_QTY;
		Water = water;
		Water_In_Liters = water_In_Liters;
		Rice_Dal = rice_Dal;
		Rice_Dal_QTY = rice_Dal_QTY;
		BabyFood = babyFood;
		BabyFood_QTY = babyFood_QTY;
		Biscuits = biscuits;
		Biscuits_QTY = biscuits_QTY;
		Milk = milk;
		Milk_in_Liters = milk_in_Liters;
	}
   
    public int getItem_ID() {
		return Item_ID;
	}
	public void setItem_ID(int item_ID) {
		Item_ID = item_ID;
	}
	public int getRequest_ID() {
		return Request_ID;
	}
	public void setRequest_ID(int request_ID) {
		Request_ID = request_ID;
	}
	public int getVictim_ID() {
		return Victim_ID;
	}
	public void setVictim_ID(int victim_ID) {
		Victim_ID = victim_ID;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public String getCotton() {
		return Cotton;
	}
	public void setCotton(String cotton) {
		Cotton = cotton;
	}
	public int getCotton_QTY() {
		return Cotton_QTY;
	}
	public void setCotton_QTY(int cotton_QTY) {
		Cotton_QTY = cotton_QTY;
	}
	public String getBandages() {
		return Bandages;
	}
	public void setBandages(String bandages) {
		Bandages = bandages;
	}
	public int getBnadages_QTY() {
		return Bnadages_QTY;
	}
	public void setBnadages_QTY(int bnadages_QTY) {
		Bnadages_QTY = bnadages_QTY;
	}
	public String getDettol() {
		return Dettol;
	}
	public void setDettol(String dettol) {
		Dettol = dettol;
	}
	public int getDettol_In_Litters() {
		return Dettol_In_Liters;
	}
	public void setDettol_In_Litters(int dettol_In_Litters) {
		Dettol_In_Liters = dettol_In_Litters;
	}
	public String getPainKillers() {
		return PainKillers;
	}
	public void setPainKillers(String painKillers) {
		PainKillers = painKillers;
	}
	public int getPainKillers_QTY() {
		return PainKillers_QTY;
	}
	public void setPainKillers_QTY(int painKillers_QTY) {
		PainKillers_QTY = painKillers_QTY;
	}
	public String getFirstAid_KIT() {
		return FirstAid_KIT;
	}
	public void setFirstAid_KIT(String firstAid_KIT) {
		FirstAid_KIT = firstAid_KIT;
	}
	public int getFirstAid_QTY() {
		return FirstAid_QTY;
	}
	public void setFirstAid_QTY(int firstAid_QTY) {
		FirstAid_QTY = firstAid_QTY;
	}
	public String getWater() {
		return Water;
	}
	public void setWater(String water) {
		Water = water;
	}
	public int getWater_In_Liters() {
		return Water_In_Liters;
	}
	public void setWater_In_Liters(int water_In_Liters) {
		Water_In_Liters = water_In_Liters;
	}
	public String getRice_Dal() {
		return Rice_Dal;
	}
	public void setRice_Dal(String rice_Dal) {
		Rice_Dal = rice_Dal;
	}
	public int getRice_Dal_QTY() {
		return Rice_Dal_QTY;
	}
	public void setRice_Dal_QTY(int rice_Dal_QTY) {
		Rice_Dal_QTY = rice_Dal_QTY;
	}
	public String getBabyFood() {
		return BabyFood;
	}
	public void setBabyFood(String babyFood) {
		BabyFood = babyFood;
	}
	public int getBabyFood_QTY() {
		return BabyFood_QTY;
	}
	public void setBabyFood_QTY(int babyFood_QTY) {
		BabyFood_QTY = babyFood_QTY;
	}
	public String getBiscuits() {
		return Biscuits;
	}
	public void setBiscuits(String biscuits) {
		Biscuits = biscuits;
	}
	public int getBiscuits_QTY() {
		return Biscuits_QTY;
	}
	public void setBiscuits_QTY(int biscuits_QTY) {
		Biscuits_QTY = biscuits_QTY;
	}
	public String getMilk() {
		return Milk;
	}
	public void setMilk(String milk) {
		Milk = milk;
	}
	public int getMilk_in_Liters() {
		return Milk_in_Liters;
	}
	public void setMilk_in_Liters(int milk_in_Liters) {
		Milk_in_Liters = milk_in_Liters;
	}

	@Override
	public String toString() {
		return "FM_Request [Item_ID=" + Item_ID + ", Request_ID=" + Request_ID + ", Victim_ID=" + Victim_ID
				+ ", Item_Name=" + Item_Name + ", Cotton=" + Cotton + ", Cotton_QTY=" + Cotton_QTY + ", Bandages="
				+ Bandages + ", Bnadages_QTY=" + Bnadages_QTY + ", Dettol=" + Dettol + ", Dettol_In_Litters="
				+ Dettol_In_Liters + ", PainKillers=" + PainKillers + ", PainKillers_QTY=" + PainKillers_QTY
				+ ", FirstAid_KIT=" + FirstAid_KIT + ", FirstAid_QTY=" + FirstAid_QTY + ", Water=" + Water
				+ ", Water_In_Liters=" + Water_In_Liters + ", Rice_Dal=" + Rice_Dal + ", Rice_Dal_QTY=" + Rice_Dal_QTY
				+ ", BabyFood=" + BabyFood + ", BabyFood_QTY=" + BabyFood_QTY + ", Biscuits=" + Biscuits
				+ ", Biscuits_QTY=" + Biscuits_QTY + ", Milk=" + Milk + ", Milk_in_Liters=" + Milk_in_Liters + "]";
	}

	
	
   
}
