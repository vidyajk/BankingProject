package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;

import com.lti.repository.BankAccountRepository;
@Service
public class LoginService {
	
	@Autowired(required=true)
	private BankAccountRepository bankAccountRepository;

	@Transactional
	public boolean verifyCustomer(Customer login ) {
		String emailid = login.getEmailid();
		String password = login.getpassword();
		boolean flag = false;
		List <Customer> customerList =  bankAccountRepository.fetchAll();
			for(Customer customer1 : customerList) {
				if(emailid.equals(customer1.getEmailid())){
					if( password.equals(customer1.getpassword())){
					System.out.println("Hello");
					flag= true;
					return true;
			}
			}
			}
			System.out.println("Hello 1");
			return false;
}
}
