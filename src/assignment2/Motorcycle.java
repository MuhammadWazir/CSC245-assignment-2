/* Name: Muhammad El Wazi
 * id: 202204951
 * last modified: February 9th , 2023
 * code description: this class (motorcycle) extends the class Vehicle. In this file, an additional 
 * characteristic (engine capacity) is introduced with its accessor and getter. The method
 * toString() is overriden accordingly.
 * Files needed: Vehicle.java
 */

package assignment2;

public class Motorcycle extends Vehicle{
	//additional characteristic
	private float eng_capacity;
	
	//constructor
	public Motorcycle(String b, String d, String c, float e) {
		super(b, d, c); eng_capacity = e;
	}
	
	//additional setter
	public void setEngCapacity(float e) {
		eng_capacity = e;
	}
	
	//additional accessor
	public float getEngCapacity() {
		return eng_capacity;
	}
	
	//String representation
	public String toString() {
		return "Brand name: " + brand_name
				+ "\nDate of make: " + date_of_make
				+ "\nColor: " + color
				+ "\nEngine capacity: " + eng_capacity + "ml";
	}
}
