package edu.java.threads;

public class BusAdmission extends Thread{
Thread t;
public BusAdmission(Thread thread){
//super();
t = thread;
}
public void run(){
System.out.println("Inside Bus Admission : "+Thread.currentThread().getName());
try{
t.join();
}catch(InterruptedException e){}
System.out.println("Student registered with Bus");
}
}