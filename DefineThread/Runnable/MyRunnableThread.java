package edu.java.runnable;

public class MyRunnableThread implements Runnable{
		
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println("Child Thread");
	}
}