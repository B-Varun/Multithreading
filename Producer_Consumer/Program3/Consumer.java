package edu.threads.consumer;
import edu.java.ds.queue.Queue;
public class Consumer extends Thread{
Queue queue;
public Consumer(Queue q){
 this.queue = q;
}

public void run(){
synchronized(queue){
while(true){
System.out.println(Thread.currentThread().getName());
if(queue.isEmpty())
 try{queue.wait(); } catch(InterruptedException e){}
else{
while(!queue.isEmpty()){
 int ele = queue.dequeue();
 System.out.println("Consumed : "+ele);
}  
queue.notifyAll();
}
}
}
}
}