package edu.java.threads.demo;
import edu.java.threads.Bus;
import edu.java.threads.Car;
public class Demo{
public static void main(String... threa) throws Exception{
System.out.println("Full Traffic");
Bus b = new Bus();
Car c = new Car(b);
b.start();
c.start();
c.join();
System.out.println("Cleared  Traffic");
}
}