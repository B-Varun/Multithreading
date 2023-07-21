package edu.reservation.system;
import edu.reservation.station.ReservationSystem;
import edu.reservation.bus.RTC;

class Main{
public static void main(String... reservationSystem){
RTC bus1 = new RTC();
RTC bus2 = new RTC();
RTC bus3 = new RTC();
RTC bus4 = new RTC();

ReservationSystem abhiBus = new ReservationSystem(bus1, 20);
abhiBus.setName("Abhi Bus");

ReservationSystem greyHound = new ReservationSystem(bus2, 10);
greyHound.setName("Grey Hound");

ReservationSystem airBus = new ReservationSystem(bus3, 50);
airBus.setName("AirBus");

ReservationSystem redBus = new ReservationSystem(bus4, 150);
redBus.setName("RedBus");

abhiBus.start();
greyHound.start();
airBus.start();
redBus.start();

}
}