package com.kris.aggregator.pattern;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.kris.dao.Address;

@Component
public class AddressMSImpl implements AddressMS{

	public Address getAddress(int id) {
		
		RestTemplate rt = new RestTemplate();
		Address adr = rt.getForObject("http://localhost:9000/getAddress?id={id}", Address.class,id);
		return adr;
	}

}
