//*******************************************************************
//	ITC 115 - Assignment 10 - Ex5-Ex7 - AdvancedTicket subclass
//  Implement a subclass called AdvancedTicket to represent tickets
//    purchased in advance. And advanced ticket is constructed with a
//    ticket number and with the number of days in advance that the ticket
//    was purchased. Advanced tickets purchased 10 or more days before
//    the event cost $30, and advanced tickets purchased fewer than 10
//    days before the event cost $40.
//  Define the following operations:
//      - the ability to construct a ticket by number and days in advance.
//      - the ability to ask for a ticket's price.
//      - the ability to println a ticket object as a String:
//            - e.g. "Number: 17, Price: 50.0"
//
//	By: Mike Gilson
//	Date: 3/13/2020
//*******************************************************************

//  Define class that inherits the Ticket abstract superclass
public class AdvanceTicket extends Ticket {

//  Field - encapsulated field for Days in Advance
	private int advanceDays;
	
//  Constructor - calls on Ticket constructor, but modified to include advancedDays parameter
//    and assign it to the encapsulated field.	
	public AdvanceTicket (int number, int days) {
		super(number);
		this.advanceDays = days;
	} // end constructor
	
//  Required method definition, based on abstract methods in Ticket superclass
//  if statement to return different prices based on how many advanceDays were entered.
//    Also included an exception argument with message for days being <= 0. 
	@Override
	public double getPrice() {
		if (advanceDays == 0 || advanceDays < 0) {
			throw new IllegalArgumentException("Days in Advance cannot be 0 or less");
		} // end if-exception

		if (advanceDays >= 10) {
			return 30;
		} else {
			return 40;
		} // end if-else
		
	}  // end getPrice method

	
//  Required method definition, based on abstract methods in Ticket superclass.
//    Calls on superclass getter for ticket number, and outputs the proper price.
	@Override
	public String toString() {
		return "Number: " + super.getNumber() + ", Price: " + getPrice();
	} // end toString method
			
}  // ends AdvancedTicket class
