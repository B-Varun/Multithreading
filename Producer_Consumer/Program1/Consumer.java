package edu.threads.consumer;
import edu.threads.queue.Queue;

public class Consumer extends Thread{
Queue queue;
public Consumer(Queue queue){
 this.queue = queue;
}

public void consume(){
 while(!queue.isEmpty())
 System.out.println("Consumer consumed : "+queue.dequeue());
}

public void run(){
synchronized(queue){
while(true){
if(queue.isEmpty()){
//System.out.println("Consumer wait");
try{ queue.wait(); }catch(InterruptedException e){}
}
else{
// System.out.println("Consumer consuming");
 consume();
 queue.notify();
}
}
}
}
}