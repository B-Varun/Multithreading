package edu.printer.job;
import edu.printer.print.job.PrinterJob;
public class Job extends Thread{
PrinterJob job;

public Job(PrinterJob j){
job = j;
}

public void run(){
job.print();
}
}