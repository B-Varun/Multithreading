package com.hotel.waiter;
import com.ds.queue.Queue;
import com.hotel.order.Order;

public class Waiter extends Thread
{
Queue customerOrdersQueue, orderDeliveredQueue, orderPlacedQueue, foodPreparedQueue;

public Waiter(Queue q, Queue delivered, Queue placed, Queue prepared){
	customerOrdersQueue = q;
	orderDeliveredQueue = delivered;
	orderPlacedQueue = placed;
	foodPreparedQueue = prepared;
}

public void run(){
	while(true){
		System.out.print("");
		if(!customerOrdersQueue.isEmpty()){
			Order customerOrder = customerOrdersQueue.dequeue();
			System.out.println("\n___________Waiter takes Customer's order for "+customerOrder.getItemName());
			orderPlacedQueue.enqueue(customerOrder);
			System.out.println("\n___________Waiter submits "+customerOrder.getItemName()+" to chef");
		}
		else if(!foodPreparedQueue.isEmpty()){
			Order preparedFood = foodPreparedQueue.dequeue();
			System.out.println("\n___________Waiter picks "+preparedFood.getItemName());
			orderDeliveredQueue.enqueue(preparedFood);
			System.out.println("\n___________Waiter delivers "+preparedFood.getItemName()+" to Customer");
			synchronized(preparedFood){
				preparedFood.notify();
			}
		}
	}
}
}