package edu.java.threads;

public class Car extends Thread{
Thread t;
public Car(Thread t){
this.t = t;
}
public void run(){
try{
t.join();
}catch(Exception e){}
System.out.println("Inside car class : "+Thread.currentThread().getName());
System.out.println("Car crossed traffic light");
}
}