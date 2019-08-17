package week1.day8.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	private volatile ArrayList<String> passengers;	// Here volatile ONLY covers the reference
	private static final int MAX_SEATS = 20;
	
	public Bus () {
		passengers = new ArrayList<String>(MAX_SEATS);
	}
	
	public boolean bookSeats(List<String> bookers) {
		synchronized (this) {
			if (passengers.size() + bookers.size() > MAX_SEATS)
				return false;
			else {
				passengers.addAll(passengers.size(), bookers);
				return true;
			}
		}
	}
	
	public int getFilledSeats () {
		return passengers.size();
	}
	
	public List<String> getPassengers() {
		return passengers;
	}
}
