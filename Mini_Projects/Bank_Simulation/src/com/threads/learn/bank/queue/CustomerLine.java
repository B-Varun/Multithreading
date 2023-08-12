package com.threads.learn.bank.queue;

import com.threads.learn.bank.customer.Customer;

// This class is an implementation of a Queue Data structure. It contains a queue of Customers.
public class CustomerLine {
	private Customer[] queue;
	private int size;
	private int front, rear;
	
	public CustomerLine(int lineSize) {
		size = lineSize;
		queue = new Customer[size];
		front = rear = -1;
	}
	
	public void enqueue(Customer customer) {
		if(isFull())
			System.out.println("Queue is Full. Cannot add more elements.");
		else if(isEmpty()) {
			front = rear = 0;
			queue[rear] = customer;
		}
		else
			queue[++rear] = customer;
	}
	
	public Customer dequeue() {
		Customer customer = null;
		if(isEmpty()) {
			System.out.println("Queue is Empty. Deletion not possible.");
			return null;
		}
		else if(front == rear) {
			customer = queue[front];
			front = rear = -1;
		}
		else
			customer = queue[front++];
		return customer;
	}
	
	public boolean isFull() {
		return ((rear+1) == size) ? true : false;
	}
	
	public boolean isEmpty() {
		return (front == -1) ? true : false;
	}
	
	public Customer front() {
		return isEmpty() ? null : queue[front];
	}
	
	public Customer rear() {
		return isEmpty() ? null : queue[rear];
	}
	
}