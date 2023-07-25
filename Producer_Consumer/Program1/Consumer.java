package edu.threads.consumer;
import edu.threads.queue.Queue;

public class Consumer extends Thread{
Queue queue;
public Consumer(Queue queue){
 this.queue = queue;
}

public void run(){
System.out.println("Consumer run");
synchronized(queue){
while(true){
 while(!queue.isEmpty()){
 int ele = queue.dequeue();
 if(ele > -1) 
 System.out.println("Consumer consumed : "+ele);
 else
 System.out.println("=============================Queue Empty==========================");
 }
try{
System.out.println("Is Queue empty : "+queue.isEmpty()+"\nTrying to wait for the consumer to raise a wait() signal");
queue.wait();
System.out.println("Consumer raised wait()");
}catch(InterruptedException e){}
}
}
}
}