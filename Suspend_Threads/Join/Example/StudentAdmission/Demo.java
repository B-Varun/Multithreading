package edu.java.threads.demo;
import edu.java.threads.BusAdmission;
import edu.java.threads.SchoolAdmission;
import edu.java.threads.HostelAdmission;
import edu.java.threads.MessAdmission;
public class Demo{
public static void main(String... students) throws InterruptedException{
SchoolAdmission school = new SchoolAdmission();
BusAdmission bus = new BusAdmission(school);
HostelAdmission hostel = new HostelAdmission(school);
MessAdmission mess = new MessAdmission(hostel);

System.out.println("Main Thread starting all threads");
hostel.start();
bus.start();
mess.start();
school.start();
mess.join();
System.out.println("Student successfully registered fully");


}
}