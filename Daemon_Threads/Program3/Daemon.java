package edu.threads.daemon;
public class Daemon extends Thread{
public void run(){
for(int i=1; i<=10; i++)
System.out.println("Daemon Thread");
}
}

