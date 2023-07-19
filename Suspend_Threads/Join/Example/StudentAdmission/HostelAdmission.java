package edu.java.threads;

public class HostelAdmission extends Thread{
Thread t;
public HostelAdmission(Thread thread){
super();
t = thread;
}
public void run(){
System.out.println("Inside Hostel Admission : "+Thread.currentThread().getName());
try{
t.join();
}catch(InterruptedException e){}
System.out.println("Hostel admitted the student");
}
}