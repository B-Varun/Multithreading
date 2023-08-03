package edu.thread.child;

public class ChildThread extends Thread{
public void run(){

for(int i=0; i<10; i++) System.out.println("Child Thread");
}
}