package com.kris.aggregator.pattern;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Resource
	private AddressMSImpl address;
	
	@Resource
	private UserMSImpl users;
	
	private Person person;
	
	@RequestMapping(value = "/getPerson", method = RequestMethod.GET)
	public Person getPerson(int id)
	{
		person = new Person();
		person.setAddress(address.getAddress(id));
		person.setUsers(users.getUsers(id));
		return person;
	}

}
