package com.ds.queue;

public class Queue{
int size;
int[] queue;
int front, rear;

public Queue(int s){
 size = s;
 queue = new int[size];
 front = rear = -1;
}

public void enqueue(Object order){

}

public Object dequeue(){

 return null;
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