//*******************************************************************
//	ITC 115 - Assignment 10 - Ex5-Ex7 - WalkupTicket subclass
//  Implement a subclass called WalkupTicket to represent a walk-up event
//    ticket. Walk-up tickets are also constructed by number, and they
//    have a price of #50.
//  Define the following operations:
//      - the ability to construct a ticket by number.
//      - the ability to ask for a ticket's price.
//      - the ability to println a ticket object as a String:
//            - e.g. "Number: 17, Price: 50.0"
//
//	By: Mike Gilson
//	Date: 3/13/2020
//*******************************************************************

// Define class that inherits the Ticket abstract superclass
public class WalkupTicket extends Ticket {

// Initially had a "private double price" field, but determined it was 
//   unnecessary, since getPrice could simply return 50, so commented it
//   out here and in the constructor. Rerunning client app showed no issues.
	// private double price;
	
//  Constructor - calls on Ticket constructor
	public WalkupTicket (int number) {
		super(number);
		// this.price = 50;  // --commented out as unnecessary
	} // end constructor
	
//  Required method definition, based on abstract methods in Ticket superclass.
//    Returns 50, since there are no modification elements to this price.
	@Override
	public double getPrice() {
		return 50;	
	}  // end getPrice method

//  Required method definition, based on abstract methods in Ticket superclass.
//  Calls on superclass getter for ticket number, and outputs the proper price.
	@Override
	public String toString() {
		
		return "Number: " + super.getNumber() + ", Price: " + getPrice();
	} // end toString method
		
} // end WalkupTicket class
