package com.example.demo.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Victim;

@Repository
public interface VictimRepository extends JpaRepository<Victim,Long>{
	
	
//	@Query("SELECT v FROM Victim v")
//	List<Victim> find();
	
	@Query("SELECT v FROM Victim v WHERE v.username=:username")
	List<Victim> findByVictim(@Param("username") String vname);
	
	@Query("SELECT v FROM Victim v WHERE v.username=:username and v.password=:password")
	List<Victim> getVictimByName(@Param("username") String vname, @Param("password") String vpass);
	
	
	@Query("SELECT u FROM Victim u JOIN u.rescueRequest r")
	List<Victim> getDetailsOfRescuerequest();
	
	//      "SELECT DISTINCT p FROM Department d JOIN d.employees e JOIN e.projects p")

	@Query("SELECT u FROM Victim u JOIN u.shelterRequest r JOIN r.AddMembers p ")
	List<Victim> getDetailsOfShelterrequest();
	
}
