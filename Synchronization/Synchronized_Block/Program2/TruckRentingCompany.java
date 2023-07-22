package edu.main.trucks.renting;
import edu.trucks.job.Job;
import edu.truck.Truck;
public class TruckRentingCompany{
public static void main(String... trucks) throws InterruptedException{
Truck truck = new Truck();
Job job1 = new Job(truck);
Job job2 = new Job(truck);
Job job3 = new Job(truck);
Job job4 = new Job(truck);

System.out.println("Company going to start trucks");
job1.start();
job2.start();
job3.start();
job4.start();
job1.join();
job2.join();
job3.join();
job4.join();
System.out.println("Company stopped the running trucks");
}
}