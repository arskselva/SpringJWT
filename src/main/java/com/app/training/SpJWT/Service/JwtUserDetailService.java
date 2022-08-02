package com.app.training.SpJWT.Service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailService implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if("arskselva".equals(username)) {
			
			return new User(username, "$2a$10$aR7YeNcC9Rw94xtqKcyefOwZLp.yDg0Dkbcqa2GzbiiXUrVI9ZtOy", new ArrayList<>() );
		}else {
			
			throw new UsernameNotFoundException("User not found " + username);
		}
	}
}
