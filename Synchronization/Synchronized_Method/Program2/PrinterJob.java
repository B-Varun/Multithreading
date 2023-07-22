package edu.printer.print.job;
public class PrinterJob{
String jobString;

public PrinterJob(String str){
 jobString = str;
}

public synchronized void print(){
for(int i=0; i<5;i++)
System.out.println(Thread.currentThread().getName()+"  ---  "+jobString);
}

}