package edu.java.runnable.demo;
import edu.java.runnable.MyRunnableThread;

public class RunnableThreadDemo{
	public static void main(String...strings) {
		MyRunnableThread runnable = new MyRunnableThread();
		Thread thread = new Thread(runnable);
		thread.start();
		
		for(int i=0; i<10;i++)
			System.out.println("Main Thread");
	}
}
