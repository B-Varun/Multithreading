package main.printer.job;
import main.printer.print.job.PrintJob;
public class Job extends Thread{
PrintJob job;

public Job(PrintJob j){
job = j;
}
public void run(){
job.print();
}
}