/* Name: Muhammad El Wazir
 * id: 202204951
 * last modified: February 9th , 2023
 * code description: this class(truck) extends the class Vehicle. In this file, an additional 
 * characteristic (numberof wheels) is introduced with its accessor and getter. The method
 * toString() is overriden accordingly.
 * Files needed: Vehicle.java
 */

package assignment2;

public class Truck extends Vehicle {
	//additional chacateristic
	private int nb_of_wheels;
	
	//constructor
	public Truck(String b, String d, String c, int n) {
		super(b, d, c); nb_of_wheels = n;
	}
	
	//additional setters
	public void setNumWheels(int n) {
		nb_of_wheels = n;
	}
	
	//additional accessor
	public int getNumWheels() {
		return nb_of_wheels;
	}
	
	//String representation
	public String toString() {
		return "Brand name: " + brand_name
				+ "\nDate of make: " + date_of_make
				+ "\nColor: " + color
				+ "\nNumber of Wheels: " + nb_of_wheels;
	}
}
