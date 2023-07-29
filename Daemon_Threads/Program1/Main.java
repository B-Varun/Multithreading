package edu.threads.daemon;
public class Main{
public static void main(String... threads){
System.out.println("Current Thread is : "+Thread.currentThread().getName()+", is it a Daemon thread : "+Thread.currentThread().isDaemon());

MyThread thread = new MyThread();
System.out.println("Is MyThread a Daemon thread : "+thread.isDaemon()+"\nMaking it a Daemon thread");
thread.setDaemon(true);
thread.start();
System.out.println("Is MyThread a Daemon thread : "+thread.isDaemon());
}
}