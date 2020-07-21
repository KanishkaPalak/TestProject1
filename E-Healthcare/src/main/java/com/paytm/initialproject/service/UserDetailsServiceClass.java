package com.paytm.initialproject.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import com.paytm.initialproject.model.UserAuth;
import com.paytm.initialproject.repository.UserRepository;

@Service
public class UserDetailsServiceClass implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException
	{
		UserAuth user = repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User Not Present!");
		
		return new UserDetailsImplementation(user);
	}

}
