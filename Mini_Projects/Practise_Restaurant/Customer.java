package com.hotel.cusomter;
import com.ds.queue.Queue;
import com.hotel.order.Order;

public class Customer extends Thread
{
	Queue customerOrdersQueue, orderDeliveredQueue;

public Customer(Queue q, Queue delivered){
	customerOrdersQueue = q;
	orderDeliveredQueue = delivered;
}

public void run(){
 Order order = new Order("Pasta", Thread.currentThread().getName());
 submitOrder(order);
 System.out.println("\n___________Cusomter received "+order.getItemName()+", leaving restaurant");
}

public void submitOrder(Order order){
	System.out.println("\n___________Customer ordered : "+order.getItemName());
	 customerOrdersQueue.enqueue(order);
	 waitForOrder(order);
	 Order deliveredOrder = orderDeliveredQueue.dequeue();
 }	 
 
 public void waitForOrder(Order order){
	  synchronized(order){
		 try{
			System.out.println("\n___________Customer waiting for "+order.getItemName());
			 order.wait();
		 }catch(InterruptedException e){
			 System.out.println("Customer interrupted when waiting for Order");
		 }
	  }
}
}