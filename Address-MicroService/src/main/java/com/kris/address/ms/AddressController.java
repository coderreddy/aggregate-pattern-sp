package com.kris.address.ms;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kris.dao.Address;
import com.kris.dao.DaoImpl;

@RestController
public class AddressController {
	
	//@Resource
	
	
	@RequestMapping("/getAddress")
	public Address getAddress(int id)
	{
	    DaoImpl impl = new DaoImpl();
		return impl.getAddress(id);
	}

}
