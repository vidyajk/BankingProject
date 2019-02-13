package com.lti.banking.repotesting;

import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import com.lti.bankingproject.BankingProjectApplication;
import com.lti.entity.Customer;
import com.lti.repository.BankAccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=BankingProjectApplication.class)
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BankAccountRepoTesting {
	
	    @Autowired
		private BankAccountRepository bankAccountRepository;
		
	    @Test
		@Transactional
		public void add() {
         	Customer customer = new Customer();
		    customer.setTitle("Ms");
		    customer.setFirstname("Vidya");
		    customer.setMiddlename("Ashok");
		    customer.setLastname("Kshirsagar");
		    customer.setFathername("Ashok Kshirsagar");
		    customer.setMobileno("9538294511");
		    customer.setEmailid("abc@gmail.com");
		    customer.setAadharno("555568996556");
		    customer.setPassword("abc");
		    bankAccountRepository.add(customer);
		}
	      @Test
	      @Transactional
	      public void fetchByid() {
	      Customer customer = new Customer();
		  customer	=	bankAccountRepository.fetch(1);
	      System.out.println(customer.getAccountno());
	      System.out.println("success!");
	       }
	     @Test
	     @Transactional
		 public void verifyCustomer() {
		 Customer customer = new Customer();
		 customer	=	bankAccountRepository.fetch(1);
	     System.out.println(customer.getAccountno());
	     System.out.println("success!");
			
  }
}
