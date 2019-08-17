package week1.day8.assignment4;

import java.util.List;

public class BookingThread implements Runnable {
	
	private List<String> passengers;
	private Bus bus;
	
	public BookingThread(Bus bus, List<String> passengers) {
		this.passengers = passengers;
		this.bus = bus;
	}
	
	@Override
	public void run() {
		bus.bookSeats(passengers);
	}
}
