package edu.main.printer;
import edu.printer.job.Job;
import edu.printer.print.job.PrinterJob;
public class Printer{
public static void main(String... printer){

PrinterJob printerJob = new PrinterJob("Duplex Printing job");
PrinterJob printerJob1 = new PrinterJob("Single Job");

Job job1 = new Job(printerJob);

Job job2 = new Job(printerJob1);

Job job3 = new Job(printerJob1);

Job job4 = new Job(printerJob);

System.out.println("Starting Printer");

job1.start();
job2.start();
job3.start();
job4.start();

System.out.println("Stopped Printer");

}
}