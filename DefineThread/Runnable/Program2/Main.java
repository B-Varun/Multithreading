package com.main;
import com.thread.Child;

public class Main{
public static void main(String... mains){
Child child = new Child();
child.start();
for(int i=0; i<10; i++)
 System.out.println("Main Thread");

}
}