package edu.threads.main;
import edu.threads.child.ChildThread;
public class MainThread{
public static void main(String... threads) throws Exception{
System.out.println("Main thread Started");
ChildThread child = new ChildThread();
child.start();
synchronized(child){
child.wait();
}
System.out.println("Sum of 1st natural no's : "+child.sum);
System.out.println("End of Main thread");
}
}