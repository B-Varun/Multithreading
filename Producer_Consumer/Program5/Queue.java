package edu.ds.queue;

public class Queue{
private int size;
private int[] queue;
public int front, rear;

public Queue(int s){
size = s;
queue = new int[size];
front = rear = -1;
}

public boolean isFull(){
return ((rear+1) == size) ? true : false;
}

public boolean isEmpty(){
 return (front == -1) ? true : false;
}

public int front(){
 return isEmpty() ? -1 : queue[front];
}

public int rear(){
 return isEmpty() ? -1 : queue[rear];
}

public void enqueue(int ele){
if(isFull())
 return ;
else if(isEmpty()){
 front = rear = 0;
 queue[rear] = ele;
}
else
 queue[++rear] = ele;
}

public int dequeue(){
if(isEmpty())
 return -1;
else if(front == rear){
 int ele = queue[front];
 front = rear = -1;
 return ele;
}
else 
 return queue[front++];
}
}