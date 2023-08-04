package com.threads.hotel.main;
import com.ds.queue.Queue;
import com.hotel.cusomter.Customer;
import com.hotel.waiter.Waiter;
import com.hotel.chef.Chef;

public class Main{
public static void main(String... threads){
Queue customerOrders = new Queue(4);
Queue orderPlaced = new Queue(4);
Queue orderPrepared = new Queue(4);
Queue orderDelivered = new Queue(4);

Customer customer = new Customer(customerOrders, orderDelivered);
Waiter waiter = new Waiter(customerOrders, orderDelivered, orderPlaced, orderPrepared);
Chef chef = new Chef(orderPlaced, orderPrepared);

System.out.println("Welcome to my Restaurant, it can handle 1 customer per serve");
waiter.start();
chef.start();
System.out.println("Waiter and Chef threads are started. Letting customers enter the restaurant");
customer.start();

//String[] orders = new String[]{""};
}
}