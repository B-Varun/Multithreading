package com.ds.queue;

public class Queue{
int size;
Object[] queue;
int front, rear;

public Queue(int s){
 size = s;
 queue = new Object[size];
 front = rear = -1;
}

public void enqueue(Object order){
 if(isEmpty()){
  front = rear = 0;
  queue[rear] = order;
 }
 else if(isFull())
  return;
 else
   queue[++rear] = order;
}

public Object dequeue(){
 if(isEmpty())
  return null;
 else if(front == rear){
   Object ele = queue[front];
   front = rear = -1;
   return ele;
 }
 else
   return queue[front++];  
}

public Object front(){
 return isEmpty() ? null : queue[front];
}

public Object rear(){
 return isEmpty() ? null : queue[rear];
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public boolean isEmpty(){
 return (front == -1) ? true : false;
}
}