/* Name: Muhammad El Wazir
 * id: 202204951
 * last modified: February 9th , 2023
 * code description: this class(car) extends the class Vehicle. In this file, an additional 
 * characteristic (engine capacity) is introduced with its accessor and getter. The method
 * toString() is overriden accordingly.
 * Files needed: Vehicle.java
 */

package assignment2;

public class Car extends Vehicle {
	//additional characteristics
	private int nb_of_seats;
	private String type;
	
	//constructor 
	public Car(String b, String d, String c, int n, String t) {
		super(b, d, c); nb_of_seats = n; type = t;
	}
	
	//setters
	public void setNumSeats(int n) {
		nb_of_seats = n;
	}
	public void setType(String t) {
		type = t;
	}
	
	//accessors
	public int getNumSeats() {
		return nb_of_seats;
	}
	public String getType() {
		return type;
	}
	//String representation
	public String toString() {
		return "Brand name: " + brand_name
				+ "\nDate of make: " + date_of_make
				+ "\nColor: " + color
				+ "\nNumber of seats: " + nb_of_seats
				+ "\nType: " + type;
	}
}
