/* Name: Muhammad El Wazir
 * id: 202204951
 * last modified: February 9th , 2023
 * code description: this file defines the class Vehicle(the parent class
 * of Car, Motorcycle, and Truck. It has 3 characteristics: brand_name, date_of_make, and color.
 * It defines the accessors and setters and the toString() method
 * Files needed: none
 */

package assignment2;

public abstract class Vehicle {
	//characteristics
	protected String brand_name;
	protected String date_of_make;
	protected String color;
	
	//constructor
	public Vehicle(String b, String d, String c) {
		brand_name = b; date_of_make = d; color = c;
	}
	//setters
	public void setName(String n) {
		brand_name = n;
	}
	public void setDate(String d) {
		date_of_make = d;
	}
	public void setColor(String c) {
		color = c;
	}
	
	//accessors
	public String getName() {
		return brand_name;
	}
	public String getDate() {
		return date_of_make;
	}
	public String getColor() {
		return color;
	}
	
	//String representation
	public String toString() {
		return "Brand name: " + brand_name
				+ "\nDate of make: " + date_of_make
				+ "\nColor: " + color;
	}
}

