package edu.threads.dead.lock.obj;

public class Dummy2{
Dummy1 d1;

public void setD1(Dummy1 d){
 d1 = d;
}

public synchronized void print(){
 System.out.println("Inside print mehthod of Dummy2 class");
}

public synchronized void load(){
 try{
     Thread.sleep(1000);
     }catch(InterruptedException e){}
 d1.print();
}

}