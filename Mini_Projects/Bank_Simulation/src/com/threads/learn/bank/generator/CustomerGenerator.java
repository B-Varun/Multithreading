package com.threads.learn.bank.generator;

import java.util.Random;

import com.threads.learn.bank.customer.Customer;
import com.threads.learn.bank.queue.CustomerLine;

public class CustomerGenerator extends Thread{

	private CustomerLine queue;
	private static int count=1;
	
	public CustomerGenerator(CustomerLine line) {
		queue = line;
	}
	
	public int getCounter() {
		return count++;
	}
	
	public void run() {
		Random random = new Random();
		try {
			while(true) {
				for(int i=0; i<10; i++)
					queue.enqueue(new Customer(random.nextInt(0,3), "Customer-"+getCounter()));
				System.out.println("\n\n------Generated 10 customers------\n\n");
				Thread.sleep(60000);
			}
		}catch(InterruptedException e) {
			System.out.println("\n\nCustomer Generator thread interrupted while creating new Customers.\n\n");
		}
	}
}
