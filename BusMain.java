package week1.day8.assignment4;

import java.util.ArrayList;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		Bus bus = new Bus();
		
		List<String> passengers1 = new ArrayList<String>();
		passengers1.add("Bill");
		passengers1.add("Tom");
		passengers1.add("Steve");
		
		List<String> passengers2 = new ArrayList<String>();
		passengers2.add("Jane");
		passengers2.add("Patricia");
		passengers2.add("Beatrice");
		passengers2.add("Jennifer");
		
		BookingThread thread1 = new BookingThread(bus, passengers1);
		BookingThread thread2 = new BookingThread(bus, passengers2);
		
		thread1.run();
		thread2.run();
		System.out.println("Seats filled: " + bus.getFilledSeats());
		thread1.run();
		thread2.run();
		System.out.println("Seats filled: " + bus.getFilledSeats());
		thread1.run();
		thread2.run(); // not enough seats
		System.out.println("Seats filled: " + bus.getFilledSeats());
		thread1.run();
		thread2.run(); // not enough seats
		
		System.out.println("Seats filled: " + bus.getFilledSeats());
		System.out.println(bus.getPassengers());
	}
}
