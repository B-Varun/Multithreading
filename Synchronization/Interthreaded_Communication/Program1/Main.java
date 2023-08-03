package edu.exam.main;
import edu.exam.Exam;
import edu.exam.teacher.Teacher;
import edu.exam.student.Student;
public class Main
{
public static void main(String... mains){
 Exam exam = new Exam();
 Teacher teacher = new Teacher(exam);
 Student student = new Student(exam);

 System.out.println("Main starting all threads");
 teacher.start();
 student.start();
 System.out.println("Main thread ending");
}
}