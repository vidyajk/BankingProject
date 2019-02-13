package com.lti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bank_Account") 
public class Account {

	   @Column(length=15)
		private double balance;
	    
		@Id
		@Column(length=15)
		private long accountNumber;
		
		@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
		private List<Transaction> transaction;
		
		private  Random rand = new Random();
		
		public List<Transaction> getTransaction() {
			return transaction;
		}
		public void setTransaction(Transaction transaction) {
			this.transaction.add(transaction);
		}
		
		public Account() {
			super();
			this.accountNumber = (long) (Math.random()*99999);
			this.balance = 100;
			this.transaction = new ArrayList<Transaction>();
		}
		
		public Account(long accountNumber, double balance){
			super();
			
			this.accountNumber = (long) (Math.random()*99999);
			this.balance = 100;
			this.transaction = new ArrayList<Transaction>();
			this.transaction = transaction;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public long getAccountNumber() {
			return accountNumber;
		}
		
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		@Override
		public String toString() {
			return "Account [balance=" + balance + ", accountNumber=" + accountNumber + ", transaction=" + transaction
					+ "]";
		}
		

	}

