package com.lti.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

@Repository
public class LoginRepository  {

	@PersistenceContext
		private EntityManager entitymanager;
		
		@Transactional
		public void add(LoginRepository login)
		{
			entitymanager.persist(login);
			
		}
		
		@Transactional
	public LoginRepository fetch(int id)
	{
	return entitymanager.find(LoginRepository.class, id);	
	}
		
		@Transactional
		public List<Customer> fetchAll(){
		Query q= entitymanager.createQuery("select obj from Bidder as obj");
		return q.getResultList();
		}

	}

	


