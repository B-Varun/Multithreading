package main.printer;
import main.printer.print.job.PrintJob;
import main.printer.job.Job;
public class Printer{
public static void main(String... printers){
PrintJob printJob = new PrintJob("Duplex Printing");
PrintJob printJob1 = new PrintJob("Simplex Printing");


Job job1 = new Job(printJob);
Job job2 = new Job(printJob1);
Job job3 = new Job(printJob1);
Job job4 = new Job(printJob);

System.out.println("Starting Printer");
job1.start();
job2.start();
job3.start();
job4.start();
System.out.println("Ending Printer");
}
}