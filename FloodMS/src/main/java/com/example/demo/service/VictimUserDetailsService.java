package com.example.demo.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.example.demo.VictimUserDetails;
//import com.example.demo.model.Victim;
//import com.example.demo.repository.VictimRepository;


//public class VictimUserDetailsService implements UserDetailsService {
//
//	@Autowired
//    private VictimRepository victimRepository;
//     
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Victim victim = victimRepository.findByUsername(username);
//        if (victim == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new VictimUserDetails(victim);
//	}

// }
