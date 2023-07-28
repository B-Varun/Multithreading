package edu.threads.main.demo;
import edu.java.ds.queue.Queue;
import edu.threads.producer.Producer;
import edu.threads.consumer.Consumer;
public class Main{
public static void main(String... threads){
Queue queue = new Queue(10);
Producer producer = new Producer(queue);
producer.setName("Producer");
Consumer consumer = new Consumer(queue);
consumer.setName("Consumer");

System.out.println("Starting Producer-Consumer simulation");
producer.start();
consumer.start();
System.out.println("Main Thread has no work now");
}
}