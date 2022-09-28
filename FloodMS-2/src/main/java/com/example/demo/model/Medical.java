package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medical")
public class Medical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int M_ID;
	
	@Column(name = "M_NAME")
    private String M_NAME;
	
	@Column(name = "M_QTY")
    private int M_QTY;
    
    
    public Medical()
    {
    	
    }
    
	
	
	public Medical(int m_ID, String m_NAME, int m_QTY) {
		super();
		M_ID = m_ID;
		M_NAME = m_NAME;
		M_QTY = m_QTY;
	}



	public Medical(int m_ID) {
		super();
		M_ID = m_ID;
	}

	public int getM_ID() {
		return M_ID;
	}
	public void setM_ID(int m_ID) {
		M_ID = m_ID;
	}
	public String getM_NAME() {
		return M_NAME;
	}
	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}
	public int getM_QTY() {
		return M_QTY;
	}
	public void setM_QTY(int m_QTY) {
		M_QTY = m_QTY;
	}

	@Override
	public String toString() {
		return "Medical [M_ID=" + M_ID + ", M_NAME=" + M_NAME + ", M_QTY=" + M_QTY + "]";
	}
	
	
    
	
}
