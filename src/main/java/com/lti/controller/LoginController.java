package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Customer;
import com.lti.repository.BankAccountRepository;
import com.lti.service.LoginService;

@RestController
@CrossOrigin
public class LoginController  {
	@Autowired
	private LoginService loginService;
		
	@RequestMapping(path="/verify", method=RequestMethod.POST)
	public String verifyCustomer(@RequestBody Customer login) {
		/*System.out.println(email);
		Customer login=new Customer();
		login.setEmailid(email);
		login.setPassword(password);*/
		boolean flag = loginService.verifyCustomer(login);
		if(flag) {
			String flag1 = Boolean.toString(flag);
			return"{\"status\": \"Login successfull!!\"}";
		}
		else {
			return "{\"status\":\"Details are incorrect\"}";
		}
		
	}
	

}
