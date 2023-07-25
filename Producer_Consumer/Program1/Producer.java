package edu.threads.producer;
import edu.threads.queue.Queue;

public class Producer extends Thread{
Queue queue;
public Producer(Queue queue){
 this.queue = queue;
}

public void run(){
System.out.println("Producer run");
synchronized(queue){
while(true){
while(!queue.isFull()){
 for(int i=0; i<100; i++)
   if(!queue.isFull())
      queue.enqueue(i);
 }
System.out.println("Producer trying to notify");
queue.notifyAll();
}
}
}
}