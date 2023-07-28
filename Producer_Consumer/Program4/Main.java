package edu.threads.main.demo;
import edu.consumer.demo.Consumer;
import edu.producer.demo.Producer;
import edu.ds.queue.Queue;

public class Main{
public static void main(String... threads){
System.out.println("Starting Producer - Consumer Simulation");
Queue queue = new Queue(10);
Producer producer = new Producer(queue);
Consumer consumer = new Consumer(queue);
producer.setName("Producer");
consumer.setName("Consumer");
producer.start();
consumer.start();

System.out.println("Main thread completed its execution");
}
}
