package printer.job.print.job;
import edu.secure.lock.Lock;
public class PrintJob{
Lock l;
String job;
public PrintJob(String j){
 job = j;
 l = new Lock();
}
public void print(){
synchronized(this){
for(int i=0; i<10; i++)
 System.out.println(Thread.currentThread().getName()+" executing : "+job);
}
}
}
