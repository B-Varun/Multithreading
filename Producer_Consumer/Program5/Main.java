package edu.threads.main.demo;
import edu.ds.queue.Queue;
import edu.producer.demo.Producer;
import edu.consumer.demo.Consumer;

public class Main{
public static void main(String... threads){
System.out.println("Main thread started");
Queue queue = new Queue(10);
Producer producer = new Producer(queue);
producer.setName("Producer");

Consumer consumer = new Consumer(queue);
consumer.setName("Consumer");

producer.start();
consumer.start();
}
}