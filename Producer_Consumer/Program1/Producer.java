package edu.threads.producer;
import edu.threads.queue.Queue;

public class Producer extends Thread{
Queue queue;
public Producer(Queue queue){
 this.queue = queue;
}

public void fillQueue(){
for(int i=0; i<10; i++){
  System.out.println("Producer produced : "+i);
  queue.enqueue(i);
}
}

public void run(){
synchronized(queue){
while(true){
 if(queue.isFull()){
//System.out.print("is queue empty : "+queue.isEmpty());
try{ queue.wait(); }catch(InterruptedException e){
// System.out.println("\n\nIException in Producer");
}
//System.out.println("Queue already full, Producer waiting");
}
else{
 fillQueue();
//System.out.println("Producer notify queue full");
 queue.notify();
}
}
}
}
}