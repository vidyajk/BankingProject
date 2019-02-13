package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.lti.entity.Customer;

@Repository
public class BankAccountRepository implements BankAccountRepoInterface {
	
	@PersistenceContext
     private EntityManager entityManager;

	public void add(Customer customer) {
		entityManager.persist(customer);
	}
	
	@Override
	public Customer fetch(int accountno) {
		return entityManager.find(Customer.class,accountno);
	}
	public List<Customer> fetchAll(){
		Query q= entityManager.createQuery("select obj from Customer as obj");
		return q.getResultList();
	}

}
