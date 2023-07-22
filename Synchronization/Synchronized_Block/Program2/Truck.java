package edu.truck;

public class Truck{
public void startTruck(){
synchronized(this){
for(int i=0; i<5; i++)
 System.out.println("Starting truck --- "+Thread.currentThread().getName()); 
}
}
}