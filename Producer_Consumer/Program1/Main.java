package edu.threads.main;
import edu.threads.producer.Producer;
import edu.threads.consumer.Consumer;
import edu.threads.queue.Queue;

public class Main{
public static void main(String... mains){
System.out.println("Classic Producer Consumer Problem");
Queue queue = new Queue();
Producer producer = new Producer(queue);
Consumer consumer = new Consumer(queue);

producer.start();
consumer.start();

System.out.println("Both producer and consumer are initialized by Main thread, main thread has no task to do.");
}
}