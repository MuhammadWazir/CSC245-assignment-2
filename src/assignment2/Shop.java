/* Name: Muhammad El Wazir
 * id: 202204951
 * last modified: February 9th , 2023
 * code description: in this file, class Shop is defined. The menu displaying
 * all options(add vehicle, delete vehicle, display type, list all, and exit).
 * Each option has a method defined in the class Shop.
 * Files needed: Truck.java, Motorcycle.java, Car.java
 */


package assignment2;
import java.util.Vector;
import java.util.Scanner;

public class Shop {
	Vector vehicles = new Vector();
	int car_count;
	int motorcycle_count;
	int truck_count;
	
	//constructor
	public Shop() {
	}
	
	
	public void addVehicle() {
		/*method to add a vehicle
		 * if vehicle is a motorcycle: validates engine capacity
		 * if vehicle is a car: validates that it's either SVU, sedan, or hatchback
		 */
		Scanner scan = new Scanner(System.in);
		
		//scan brand
		System.out.println("Enter the name of the brand of the vehicle: ");
		String brand = scan.nextLine();
		
		//scan date of make
		System.out.println("Enter the date of make of the vehicle: ");
		String date = scan.nextLine();
		
		//scan color
		System.out.println("Enter the color of the vehicle: ");
		String color = scan.nextLine();
		
		//scan type of the vehicle
		System.out.println("Enter the type of the vehicle (motorcycle, car, or truck): ");
		String type = scan.nextLine();
		
		if (type.toLowerCase().equals("car")) {
			System.out.println("Enter number of seats: ");
			int num_seats = scan.nextInt();
			
			Scanner scan_car_type = new Scanner(System.in);
			System.out.println("Enter the type of the car (sedan, hatchback, or SVU: ");
			String type_car = scan_car_type.nextLine();
			
			Car new_car = new Car(brand, date, color, num_seats, type_car);
			vehicles.addElement(new_car);
			car_count++;
			
		}
		else if (type.toLowerCase().equals("motorcycle")) {
			System.out.println("Enter the engine capacity(between 70 and 120): ");
			float capacity = scan.nextFloat();
			
			Motorcycle new_motorcycle = new Motorcycle(brand, date, color, capacity);
			vehicles.addElement(new_motorcycle);
			motorcycle_count++;
		}
		else{
			System.out.println("Enter the number of wheels: ");
			int nb_wheels = scan.nextInt();
			Truck new_truck = new Truck(brand, date, color, nb_wheels);
			vehicles.addElement(new_truck);
			truck_count++;
		}
	}	
	
	
	public void deleteVehicle() {
		/*delete a vehicle option
		 * lists all instances of the specified type 
		 * deletes upon the user's input(integer)
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the type of the vehicle: ");
		String type = scan.nextLine();
		
		if (type.toLowerCase().equals("car")) {
			int i = 1;
			for(Object vehicle: vehicles) {
				if (vehicle instanceof Car) {
					System.out.println(i + ". ");
					System.out.print(vehicle);
					System.out.println(" ");
					i++;
				}
			}
			System.out.println("Enter the number of the vehicle you want to delete: ");
			int to_delete = scan.nextInt();
			int j = 0;
			for(int c = 0; c <vehicles.size(); c++) {
				if(vehicles.elementAt(c) instanceof Car) {
					j++;
					if (j == to_delete) {
						vehicles.removeElement(vehicles.elementAt(c));
						car_count--;
					}
				}
			}
		}
		else if (type.toLowerCase().equals("truck")) {
			int i = 1;
			for(Object vehicle: vehicles) {
				if (vehicle instanceof Truck) {
					System.out.println(i + ". ");
					System.out.print(vehicle);
					System.out.println(" ");
					i++;
				}
			}
			System.out.println("Enter the number of the vehicle you want to delete: ");
			int to_delete = scan.nextInt();
			int j = 0;
			for(int c = 0; c <vehicles.size(); c++) {
				if(vehicles.elementAt(c) instanceof Truck ) {
					j++;
					if (j == to_delete) {
						vehicles.removeElement(vehicles.elementAt(c));
						truck_count--;
					}
				}
			}
		}
		else {
			int i = 1;
			for(Object vehicle: vehicles) {
				if (vehicle instanceof Motorcycle) {
					System.out.println(i + ". ");
					System.out.print(vehicle);
					System.out.println(" ");
					i++;
				}
			}
			System.out.println("Enter the number of the vehicle you want to delete: ");
			int to_delete = scan.nextInt();
			int j = 0;
			for(int c = 0; c <vehicles.size(); c++) {
				if(vehicles.elementAt(c) instanceof Motorcycle) {
					j++;
					if (j == to_delete) {
						vehicles.removeElement(vehicles.elementAt(c));
						motorcycle_count--;
					}
				}
			}
		}
	}
	
	
	public void displayType() {
		/*display-type option
		 * asks for type and displays all instances and their count
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of vehicles"
				+ "you want to display (car, motorcycle, or truck): ");
		String type = scan.nextLine();
		
		if(type.toLowerCase().equals("car")) {
			for(Object vehicle: vehicles) {
				if (vehicle instanceof Car) {
					System.out.println(vehicle);
				}
			}
			System.out.println("Number of cars: "+ car_count);
		}
		else if(type.toLowerCase().equals("truck")) {
			for(Object vehicle: vehicles) {
				if (vehicle instanceof Truck) {
					System.out.println(vehicle);
				}
			}
			System.out.println("Number of trucks: "+truck_count);
		}
		else{
			for(Object vehicle: vehicles) {
				if (vehicle instanceof Motorcycle) {
					System.out.println(vehicle);
				}
			}
			System.out.println("Number of motorcycles: "+motorcycle_count);
		}
	}
	
	
	public void listAll() {
		//lists all vehicles in the array
		int i = 1;
		for(Object vehicle: vehicles) {
			System.out.println(i + ". ");
			System.out.print(vehicle);
			System.out.println(" ");
			i++;
		}
	}
	
	public void menu() {
		//displays options to the user
			System.out.println("1.Add a vehicle\r\n"
					+ "2.Delete a vehicle\r\n"
					+ "3.Display type\r\n"
					+ "4.List all\r\n"
					+ "5.Exit\r\n"
					+ "----------------------\r\n"
					+ "Enter your choice:\r\n"
					+ "");
	}
		
	public static void main(String[]args) {
		Shop s = new Shop();
		Scanner scan = new Scanner(System.in);
		s.menu();
		int choice = scan.nextInt();
		int errors = 0;
		//exiting after 5 times input is invalid
		while(errors<5) {
			switch(choice) {
			case 1:
				s.addVehicle();
				break;
			case 2:
				s.deleteVehicle();
				break;
			case 3:
				s.displayType();
				break;
			case 4:
				s.listAll();
				break;
			case 5:
				return;
			default:
				errors++;
				System.out.println("Invalid input, try again");
				
			}
			s.menu();
			choice = scan.nextInt();
		}
	}
}
