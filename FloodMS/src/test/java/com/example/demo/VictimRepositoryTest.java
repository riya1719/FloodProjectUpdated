package com.example.demo;

//import static org.assertj.core.api.Assertions.assertThat;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import com.example.demo.model.Victim;
//import com.example.demo.repository.VictimRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class VictimRepositoryTest {
//	
//	 @Autowired
//	    private TestEntityManager entityManager;
//	     
//	    @Autowired
//	    private VictimRepository victimRepository;
//	    
//	    
//	    @Test
//	    public void testCreateUser() {
//	    	
//	        Victim victim = new Victim();
//	        
//	        victim.setVC_NAME("shu");
//	        victim.setVC_CONTACT(123557809);
//	        victim.setVC_ADDRESS("qwe");
//	        victim.setVC_CITY("dombivili");
//	        victim.setVC_EMAIL("orr@gmail.com");
//	        victim.setVC_USERID("ret");
//	        victim.setVC_PASSWORD("set");
//	        
//	         
//	         Victim savedvictim = victimRepository.save(victim);
//	        
//	         Victim existUser = entityManager.find(Victim.class, savedvictim.getVC_ID());
//	         
//	        assertThat(victim.getVC_USERID()).isEqualTo(existUser.getVC_USERID());
//	        
//	        
//	         
	    // }	    
//	    
//	    @Test
//	    public void testFindUserByUsername()
//	    {
//	    	String username = "paswrd";
//	    	Victim victim = victimRepository.findByUsername(username);
//	    	
//	    	assertThat(victim).isNotNull();
//	    	
//	    }
	
// }
