package edu.threads.queue;
public class Queue{
int size = 10;
int[] queue = new int[size];
public int front, rear;

public Queue(){
 front = rear = -1;
}

public void enqueue(int ele){
 if(isEmpty()){
    front = rear = 0;
    queue[rear] = ele;
 } 
 else if(isFull())
    System.out.println("Queue is Full");
 else{
    queue[++rear] = ele;
 }  
}

public int dequeue(){
 if(isEmpty()){
    System.out.println("Queue is Empty");
    return -1;
 }
 else if(front == rear){
    int ele = queue[front];
    rear = front = -1;
    return ele;
 }
 else{
  int ele = queue[front++];  
  return ele;
 }
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public boolean isEmpty(){
 return (front == -1 && rear == -1) ? true : false;
}

public int front(){
 return (isEmpty()) ? -1 : queue[front];
}

public int rear(){
 return (isEmpty()) ? -1 : queue[rear];
}
}