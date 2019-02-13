package com.lti.controller;

import javax.security.auth.login.AccountNotFoundException
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lti.entity.Customer;
import com.lti.service.BankAccountService;

@RestController
@CrossOrigin
public class BankAccountController {

		@Autowired
		private BankAccountService bankAccountService;
		
		@RequestMapping(path="/customer/add", method = RequestMethod.POST)
		public String add(@RequestBody Customer customer) {
		bankAccountService.add(customer);
			return "{\"status\" : \"Bank details recorded successfullyyy!!\"}";
			
		}
		
		
		@RequestMapping(path="/customer/{accountno}", method = RequestMethod.GET)
		public Customer fetch(@PathVariable("accountno") int accountno) {
			return bankAccountService.fetch(accountno);
		}
		
}
