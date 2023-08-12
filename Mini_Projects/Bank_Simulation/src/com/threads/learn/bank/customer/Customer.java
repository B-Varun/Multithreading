package com.threads.learn.bank.customer;

public class Customer {

	public int serviceTime;
	public String customerName;
	
	public Customer(int time, String name) {
		serviceTime = time;
		customerName = name;
	}
	
	public String toString() {
		return customerName+", Service Time : "+serviceTime+" sec";
	}
	
}
