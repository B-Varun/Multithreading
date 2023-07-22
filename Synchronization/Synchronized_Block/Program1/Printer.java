package main.printer;
import printer.job.Job;
import printer.job.print.job.PrintJob;
public class Printer{
public static void main(String... jobs) throws InterruptedException{

PrintJob print = new PrintJob("Programmatic Print job");

PrintJob print2 = new PrintJob("Print2 class");

PrintJob print3 = new PrintJob("Print3 class Job");

Job job1 = new Job(print);
Job job2 = new Job(print2);
Job job3 = new Job(print3);

System.out.println("Starting print job");
job1.start();
job2.start();
job3.start();

job1.join();
job2.join();
job3.join();

System.out.println("Ending print job");
}
}