package com.lti.repository;
import com.lti.entity.Customer;

public interface BankAccountRepoInterface {

	void add(Customer customer);

    Customer fetch(int accountno);

}