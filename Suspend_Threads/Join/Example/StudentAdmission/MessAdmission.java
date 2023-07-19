package edu.java.threads;

public class MessAdmission extends Thread{
Thread t;
public MessAdmission(Thread thread){
super();
t = thread;
}
public void run(){
try{
t.join();
}catch(InterruptedException e){}
System.out.println("Student provided admission in the mess");
}
}