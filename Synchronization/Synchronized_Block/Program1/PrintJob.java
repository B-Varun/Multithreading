package main.printer.print.job;
public class PrintJob{
String job;

public PrintJob(String s){
job = s;
}

public void print(){
synchronized(PrintJob.class){
for(int i=0; i<5; i++)
 System.out.println(Thread.currentThread().getName()+"   ---   "+job);
}
}
}