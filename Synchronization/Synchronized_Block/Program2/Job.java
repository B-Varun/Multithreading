package edu.trucks.job;
import edu.truck.Truck;
public class Job extends Thread{
Truck truck;
public Job(Truck t){
 truck = t;
}

public void run(){
 truck.startTruck();
}
}