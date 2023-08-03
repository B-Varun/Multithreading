package edu.exam.student;
import edu.exam.Exam;

public class Student extends Thread{ 
Exam exam;
public Student(Exam e){
exam = e;
}

public void run(){
 try{
 System.out.println("Student waiting for question paper");
 waitingForPaper();
 System.out.println("Student got question paper from teacher");
 attemptingExam();
 examCompleted();
 }catch(InterruptedException e){}
}

public void examCompleted() throws InterruptedException{
 Thread.sleep(2000);
 System.out.println("Student submitted question paper");
 synchronized(exam){
  exam.notify();
 }
}

public void attemptingExam() throws InterruptedException{
 Thread.sleep(2000);
 System.out.println("Student attempting the exam");
}

public void waitingForPaper() throws InterruptedException{
 synchronized(exam){
  exam.wait();
 }
} 

}