package edu.threads.daemon;

public class President extends Thread{
public void run(){
System.out.println("I'm the president, I reached the venue");

try{
Thread.sleep(1000);
}catch(InterruptedException e){
 System.out.println("Interrupted Exception");
}

System.out.println("President leaving the venue");
}
}