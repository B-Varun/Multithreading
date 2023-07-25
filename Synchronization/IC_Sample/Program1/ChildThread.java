package edu.threads.child;
public class ChildThread extends Thread{
public int sum=0;
public void run(){
System.out.println("Child Thread trying to sumup 1st 100 natural numbers");
for(int i=1; i<=100; i++)
 sum+=i;
System.out.println("Returning sum of 1st 100 natural numbers to main thread");
synchronized(this){
this.notify();
}
for(int i=1; i<=500; i++)
System.out.println();
}
}