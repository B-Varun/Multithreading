package com.hotel.chef;
import com.ds.queue.Queue;
import com.hotel.order.preparation.time.OrderPreparationTime;
import com.hotel.order.Order;

public class Chef extends Thread
{
Queue orderPlacedQueue, foodPreparedQueue;

public Chef(Queue placed, Queue prepared){
	orderPlacedQueue = placed;
	foodPreparedQueue = prepared;
}
	
public void run(){
 while(true){
	 		System.out.print("");
	 if(!orderPlacedQueue.isEmpty()){
		Order customerOrder = orderPlacedQueue.dequeue();
		int orderTime = OrderPreparationTime.getTime(customerOrder.getItemName());
		orderTime*=1000;
		System.out.println("\n___________Order will be prepared by chef in : "+orderTime);
		preparingOrder(orderTime);
		System.out.println("\n___________Chef prepared : "+customerOrder.getItemName()+", passed it to waiter");
		foodPreparedQueue.enqueue(customerOrder);
	 }
 }
}

public void preparingOrder(int orderTime){
		try{
			Thread.sleep(orderTime);
		}catch(InterruptedException e){
			System.out.println("Chef interrupted");
		}
}
}