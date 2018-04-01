package com.kris.aggregator.pattern;

import com.kris.dao.Address;
import com.kris.dao.Users;

public class Person {
	
	private Users users;
	
	private Address address;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
