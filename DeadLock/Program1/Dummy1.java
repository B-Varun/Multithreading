package edu.threads.dead.lock.obj;

public class Dummy1{
Dummy2 d2;

public void setD2(Dummy2 d){
 d2 = d;
}

public synchronized void print(){
 System.out.println("Inside print mehthod of Dummy1 class"); 
}

public synchronized void load(){
 try{
     Thread.sleep(1000);
     }catch(InterruptedException e){}
 d2.print();
}

}