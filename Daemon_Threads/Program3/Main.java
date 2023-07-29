package edu.threads.demo.main;
import edu.threads.daemon.Daemon;
public class Main{
public static void main(String... args){
 System.out.println("Main Thread");
 Daemon thread = new Daemon();
 thread.setDaemon(true);
 thread.start();
}
}