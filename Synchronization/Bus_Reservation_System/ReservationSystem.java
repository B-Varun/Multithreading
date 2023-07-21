package edu.reservation.station;
import edu.reservation.bus.RTC;

public class ReservationSystem extends Thread{
private RTC bus;
int ticketCount;

public ReservationSystem(RTC rtc, int count){
bus = rtc;
ticketCount = count;
}

public void run(){
bus.bookTicket(ticketCount);
}

}