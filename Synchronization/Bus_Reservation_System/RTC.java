package edu.reservation.bus;

public class RTC
{
private static int no_Of_Seats = 100;

public static synchronized void bookTicket(int num){
System.out.print("Booking ticket for : "+Thread.currentThread().getName()+". Ticket booked ? : ");

try{
Thread.sleep(1000);
}catch(InterruptedException e){}

if(no_Of_Seats>0 && no_Of_Seats>num){
 no_Of_Seats-=num;
 System.out.println("true");
}
else
 System.out.println("false");
}
}