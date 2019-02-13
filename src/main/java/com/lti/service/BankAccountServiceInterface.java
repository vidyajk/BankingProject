package com.lti.service;

import java.util.List;
import javax.transaction.Transactional;
import com.lti.entity.Customer;
import com.lti.entity.Transaction;

public interface BankAccountServiceInterface {

	void add(Customer customer);

	Customer fetch(int accountno);
	}