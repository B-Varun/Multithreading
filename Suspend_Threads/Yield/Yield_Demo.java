package edu.java.threads.demo;
import edu.java.threads.MyThread;
public class Yield_Demo{
public static void main(String... threads){
MyThread thread = new MyThread();
thread.setPriority(10);
thread.start();
for(int i=0; i<10; i++)
 System.out.println("Main Thread");
}
}