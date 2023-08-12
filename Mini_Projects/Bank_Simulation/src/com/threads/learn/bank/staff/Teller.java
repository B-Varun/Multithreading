package com.threads.learn.bank.staff;

import com.threads.learn.bank.customer.Customer;
import com.threads.learn.bank.queue.CustomerLine;

public class Teller extends Thread{

	private CustomerLine queue;

	public Teller(CustomerLine line) {
		queue = line;
	}

	public void run() {
		Customer customer;
		while(true) {
			try {
				if(queue.isEmpty()) {
					Thread.sleep(1000);
					continue;
				}
				customer = queue.dequeue();
				if(customer!=null) {
					int customerServiceTime = customer.serviceTime;
					System.out.println(Thread.currentThread().getName()+" serving "+customer);
					Thread.sleep(customerServiceTime*1000);	
				}			
			}catch(InterruptedException e) {
				System.out.println("Teller thread interrupted while serving the customer.");
			}		
		}
	}
}
