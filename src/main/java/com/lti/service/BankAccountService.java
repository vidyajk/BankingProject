package com.lti.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.Customer;
import com.lti.entity.Transaction;
import com.lti.repository.BankAccountRepoInterface;
import com.lti.repository.BankAccountRepository;

@Service
public class BankAccountService implements BankAccountServiceInterface {
	
	   @Autowired
		private BankAccountRepository bankAccountRepository;

	    @Override
		@Transactional
		public void add(Customer customer) {
			bankAccountRepository.add(customer);
		}
		
	    @Override
		public Customer fetch(int accountno)
		{
			return bankAccountRepository.fetch(accountno);
		
		}
}

	
			
