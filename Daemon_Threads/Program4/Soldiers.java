package edu.threads.daemon;

public class Soldiers extends Thread{
public void run(){
while(true)
System.out.println("Protecting the President.");
}
}