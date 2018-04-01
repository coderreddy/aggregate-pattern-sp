package com.kris.users.ms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kris.dao.DaoImpl;
import com.kris.dao.Users;

@RestController
public class UserController {
	
	@RequestMapping("/getUsers")
	public Users getUsers(int id) 
	{
		DaoImpl impl = new DaoImpl();
		return impl.getUser(id);
	}
}
