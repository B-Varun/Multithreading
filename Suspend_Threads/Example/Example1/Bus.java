package edu.java.threads;

public class Bus extends Thread{
public void run(){
System.out.println("Inside bus class : "+Thread.currentThread().getName());
System.out.println("Bus crossed traffic light");
}
}