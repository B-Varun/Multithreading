package edu.exam.teacher;
import edu.exam.Exam;
public class Teacher extends Thread{ 
Exam exam;
public Teacher(Exam e){
exam = e;
}

public void printPaper() throws InterruptedException{
System.out.println("Teacher printing the paper;");
Thread.sleep(2000);
}

public void run(){
try{
printPaper();
distributeToStudents();
waitForStudentsToComplete();
System.out.println("All students completed the exam");
}catch(InterruptedException e){}
}

public synchronized void waitForStudentsToComplete() throws InterruptedException{
 synchronized(exam){
  exam.wait();
 }
}

public synchronized void distributeToStudents() throws InterruptedException{ System.out.println("Distributing papers to students");
Thread.sleep(3000);
 synchronized(exam){ 
  exam.notify();
 }
}

}