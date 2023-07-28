package edu.threads.main.demo;
import edu.threads.dead.lock.obj.Dummy1;
import edu.threads.dead.lock.obj.Dummy2;
import edu.threads.Thread1;
import edu.threads.Thread2;

public class Main{
public static void main(String... dum){
Dummy1 d1 = new Dummy1();
Dummy2 d2 = new Dummy2();
d2.setD1(d1);
d1.setD2(d2);
Thread1 t1 = new Thread1(d1, d2);
Thread2 t2 = new Thread2(d1, d2);

System.out.println("Main thread starting the 2 other threads");
t1.start();
t2.start();

}
}