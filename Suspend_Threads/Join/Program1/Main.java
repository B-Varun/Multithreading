package edu.main.demo;
import edu.thread.child.ChildThread;
public class Main{
public static void main(String... mains) throws InterruptedException{
 ChildThread child = new ChildThread();
System.out.println("Main Thread started");
 child.start();
child.join();
System.out.println("Main Thread ends");
}
}