//package com.example.demo;
//
//import java.util.Collection;
//
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.example.demo.model.Victim;
//
//public class VictimUserDetails implements UserDetails {
//	
//	private Victim victim;
//	
//	
//
//	public VictimUserDetails(Victim victim) {
//		this.victim = victim;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return victim.getVC_PASSWORD();
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return victim.getVC_USERID();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
