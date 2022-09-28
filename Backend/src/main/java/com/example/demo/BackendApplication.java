package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO TABLENAME(LastName,LastName,AGE) VALUES (?,?,?)";
		
		int result = jdbcTemplate.update(sql, "riya", "ddh", 32);
		
		if (result > 0)
		{
			System.out.println("one row inserted");
		}
		
	}

}
