package edu.java.threads.demo;
import edu.java.threads.MyThread;

public class ThreadDemo{
public static void main(String... threads) throws InterruptedException{
MyThread thread = new MyThread();
thread.start();
thread.join();
for(int i=0; i<10; i++)
 System.out.println("Main Thread");
}
}
