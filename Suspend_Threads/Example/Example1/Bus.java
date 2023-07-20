package edu.java.threads;

public class Bus extends Thread{
public void run(){
try{
System.out.println("Inside bus class : "+Thread.currentThread().getName());
Thread.sleep(2000);
System.out.println("Bus crossed traffic light");
}catch(Exception e){}
}
}