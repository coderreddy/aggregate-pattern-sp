package com.kris.aggregator.pattern;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.kris.dao.Users;

@Component
public class UserMSImpl implements UserMS{
	
	public Users getUsers(int id) {
		
		RestTemplate rt = new RestTemplate();
		Users user = rt.getForObject("http://localhost:8000/getUsers?id={id}", Users.class,id);
		return user;
	}

}
