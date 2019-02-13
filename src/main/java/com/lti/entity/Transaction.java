package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_transaction")

public class Transaction {

	    @Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(length=10)
		private int id;
		
		@Column(length=5)
		private int transId;
		
		@Column(length=10)
		private double balance;
		
		@Column(length=10)
		private long transWith;
		
		public Transaction() 
		{
			super();
			this.transId = transId;
			this.balance = balance;
			this.transWith = transWith;
		}
		public Transaction(int transId, double balance, long transWith) {
			super();
			this.transId = transId;
			this.balance = balance;
			this.transWith = transWith;
		}
		public long getTransWith() {
			return transWith;
		}
		public void setTransWith(long transWith) {
			this.transWith = transWith;
		}
		public int getTransId() {
			return transId;
		}
		public void setTransId(int transId) {
			this.transId = transId;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "Transaction [id=" + id + ", transId=" + transId + ", balance=" + balance + ", transWith=" + transWith
					+ "]";
		}
}
