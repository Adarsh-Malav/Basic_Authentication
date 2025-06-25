package com.example.demo_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo_1.repository.UserDetailsRepository;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userDetailsRepository.findByUsername(username)
					.orElseThrow(()-> new UsernameNotFoundException("username not found"));
	}
	
}
