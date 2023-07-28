package edu.producer.demo;
import edu.ds.queue.Queue;

public class Producer extends Thread{
Queue queue;

public Producer(Queue q){
 queue = q;
}

public void produce(){
 for(int i=1; i<=10; i++)
     queue.enqueue(i);
}

public void run(){
  System.out.println("\n\n"+Thread.currentThread().getName()+"\n\n");
synchronized(queue){
while(true){
if(queue.isEmpty()){
 produce();
 queue.notifyAll();
}
else
try{ queue.wait(); } catch(InterruptedException e){}
}
}
}
}
