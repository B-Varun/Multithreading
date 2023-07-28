package edu.threads;
import edu.threads.dead.lock.obj.Dummy1;
import edu.threads.dead.lock.obj.Dummy2;

public class Thread2 extends Thread{
Dummy1 d1;
Dummy2 d2;

public Thread2(Dummy1 d,  Dummy2 f){
 d1 = d;
 d2 = f;
}

public void run(){
 d2.load();
}
}