//*******************************************************************
//	ITC 115 - Assignment 10 - Ex5-Ex7 - Ticket Class
//  Implement a class called Ticket that will serve as the superclass
//    for various ticket types. Define all operations in the superclass
//    and specify all operation such that every subclass must implement
//    them. Define the following operations:
//      - the ability to construct a ticket by number.
//      - the ability to ask for a ticket's price.
//      - the ability to println a ticket object as a String:
//            - e.g. "Number: 17, Price: 50.0"
//
//	By: Mike Gilson
//	Date: 3/13/2020
//*******************************************************************

//  Create Abstract class to set up characteristics all subclasses will use
public abstract class Ticket {
	
// 	Field - encapsulated number used for Ticket object parameter
	private int number;
	
//  Constructor - constructing a Ticket object with a number parameter.	
	public Ticket (int number) {
		this.number = number;
	} // end Ticket constructor
	
// Abstract methods that all subclasses will must implement and define.
// Per instructions, all subclasses will define getPrice and toString methods.
	public abstract double getPrice();
	public abstract String toString();

// Getter method for the encapsulated number field, to be used by subclasses.	
	public int getNumber() {
		return number;
	} // end getNumber getter	
	
} // end abstract class




