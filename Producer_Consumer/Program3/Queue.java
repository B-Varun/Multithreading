package edu.java.ds.queue;
public class Queue{
int size;
int[] arr;
int front, rear;

public Queue(int s){
 size = s;
 arr = new int[size];
 front = rear = -1;
}

public void enqueue(int ele){
 if(isFull())
     return;
 else if(isEmpty()){
     front = rear = 0;
     arr[rear] = ele;
 }
 else
     arr[rear++] = ele;
}

public int dequeue(){
 if(isEmpty())
    return -1;
 else if(front == rear){
    int ele = arr[front];
    front = rear = -1;
    return ele;
 }
 else{
     int ele = arr[front++];
     return ele;
 }
}

public int front(){
 return isEmpty() ? -1 : arr[front];
}

public int rear(){
 return isEmpty() ? -1 : arr[rear];
}

public boolean isFull(){
 return ((rear+1) == size) ? true : false;
}

public boolean isEmpty(){
 return (front == -1) ? true : false;
}
}