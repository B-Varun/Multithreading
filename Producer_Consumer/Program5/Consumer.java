package edu.consumer.demo;
import edu.ds.queue.Queue;

public class Consumer extends Thread{
Queue queue;

public Consumer(Queue q){
 queue = q;
}

public void consume(){
 while(!queue.isEmpty())
    System.out.println("Consumed : "+queue.dequeue());
}

public void run(){
 System.out.println("\n\n"+Thread.currentThread().getName()+"\n\n");
synchronized(queue){
while(true){
if(!queue.isEmpty()){
 consume();
 queue.notifyAll();
}
else
try{ queue.wait(); } catch(InterruptedException e){}
}
}
}
}