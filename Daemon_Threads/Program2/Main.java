package edu.threads.daemon;

public class Main{
public static void main(String... threads){
MyThread thread = new MyThread();
System.out.println("Is the child daemon : "+thread.isDaemon());
thread.setDaemon(true);
System.out.println("Is the child daemon : "+thread.isDaemon());
thread.start();
}
}