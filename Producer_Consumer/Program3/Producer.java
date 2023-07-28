package edu.threads.producer;
import edu.java.ds.queue.Queue;
public class Producer extends Thread{
Queue queue;
public Producer(Queue q){
 this.queue = q;
}

public void run(){
synchronized(queue){
while(true){
System.out.println(Thread.currentThread().getName());
if(queue.isFull())
 queue.notifyAll();
else{
 if(queue.isEmpty())
  for(int i=0; i<10; i++)
   queue.enqueue(i);
try{queue.wait(); } catch(InterruptedException e){}
}
}
}
}
}