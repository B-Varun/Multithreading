package com.threads.learn.bank;

import com.threads.learn.bank.generator.CustomerGenerator;
import com.threads.learn.bank.queue.CustomerLine;
import com.threads.learn.bank.staff.Teller;

public class BasicBankSimulation {
	
	public static void main(String... mains) {
		CustomerLine queue = new CustomerLine(100);
		Teller teller = new Teller(queue);
		CustomerGenerator customerGenerator = new CustomerGenerator(queue);
		
		System.out.println("Welcome to My Bank. Customers please wait in the line for the Teller");
		
		customerGenerator.start();
		teller.start();
	}

}
