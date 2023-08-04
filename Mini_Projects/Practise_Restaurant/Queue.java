package com.ds.queue;
import com.hotel.order.Order;

public class Queue{
int size;
Order[] queue;
int front, rear;

public Queue(int s){
 size = s;
 queue = new Order[size];
 front = rear = -1;
}

public void enqueue(Order order){
 if(isEmpty()){
  front = rear = 0;
  queue[rear] = order;
 }
 else if(isFull())
  return;
 else
   queue[++rear] = order;
}

public Order dequeue(){
 if(isEmpty())
  return null;
 else if(front == rear){
   Order ele = queue[front];
   front = rear = -1;
   return ele;
 }
 else
   return queue[front++];  
}

public Order front(){
 return isEmpty() ? null : queue[front];
}

public Order rear(){
 return isEmpty() ? null : queue[rear];
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public boolean isEmpty(){
 return (front == -1) ? true : false;
}
}