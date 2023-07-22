package printer.job;
import printer.job.print.job.PrintJob;
public class Job extends Thread{
PrintJob job;
public Job(PrintJob j){
job = j;
}
public void run(){
// System.out.print("Thread name : "+Thread.currentThread().getName());
 job.print();
}
}