package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Victim;

@Repository
public interface VictimRepository extends JpaRepository<Victim ,Long>{

	
	
	//doubt
//	@Query("SELECT u FROM User u WHERE u.VC_USERID = ?1")
//    public Victim findByUsername(String username);

}
