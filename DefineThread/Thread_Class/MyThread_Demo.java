package edu.java.threads.demo;
import edu.java.threads.MyThread;

public class MyThread_Demo{
public static void main(String... threads){
MyThread thread = new MyThread();
thread.start();

for(int i=0; i<10; i++)
 System.out.println("Main Thread");
}
}