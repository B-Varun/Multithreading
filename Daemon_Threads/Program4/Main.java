/* 
This program will start 2 threads president & soldiers who pretect the president. The main program starts both these threads and soldiers say that they are protecting the president untill the President thread is being executed. Once the president thread completes its execution then the emain thread ends along with Soldier threads

Finally to verify this we can check if the below 2 lines are printed : 
*   "I'm the president, I reached the venue" : Once the president thread starts
*   "President leaving the venue" : Just before the president threads end
*/

package edu.threads.demo.main;
import edu.threads.daemon.President;
import edu.threads.daemon.Soldiers;
public class Main{
public static void main(String... threads) throws InterruptedException{
 System.out.println("The venue in which the President is going to land.");
 Soldiers soldiers = new Soldiers();
 President president = new President();

 soldiers.setDaemon(true);
 president.setDaemon(true);
 
 soldiers.start();
 president.start();
 president.join();
}
}