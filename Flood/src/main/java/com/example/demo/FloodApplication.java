package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class FloodApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(FloodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String sql ="INSERT INTO Login (LastName,FirstName,Address,City) VALUES (?,?,?,?)";
		
		int result = jdbcTemplate.update(sql,"dh","riya","Malad","Mumb");
		
		if (result > 0)
		{
			System.out.println("One new row has been Inserted");
		}
		
	}

}
