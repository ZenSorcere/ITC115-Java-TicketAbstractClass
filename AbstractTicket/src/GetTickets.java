//*******************************************************************
//	ITC 115 - Assignment 10 - Ex5-Ex7 - GetTickets class (client app)
//  Client app that call from main the creations and toString methods of
//    both Walkup and Advanced ticket types. Tests for advancedDays price
//    variations, and creates tickets both by creating new objects individually
//    and by grouping together in an array. Calls the toString method to
//    display ticket info, and calls the getPrice methods separately as well.
//  Define the following operations:
//      - the ability to construct a ticket by number.
//      - the ability to ask for a ticket's price.
//      - the ability to println a ticket object as a String:
//            - e.g. "Number: 17, Price: 50.0"
//
//	By: Mike Gilson
//	Date: 3/13/2020
//*******************************************************************
public class GetTickets {

	public static void main(String[] args) {

// Individually created ticket objects, and displaying their info.
		WalkupTicket walk1 = new WalkupTicket(100);
		System.out.println(walk1);       // should display 100 and 50.0
		
		AdvanceTicket adv1 = new AdvanceTicket(80, 20);
		System.out.println(adv1);        // should display 80 and 30.0
		
		AdvanceTicket adv2 = new AdvanceTicket(81, 10);
		System.out.println(adv2);        // should display 81 and 30.0
		
		AdvanceTicket adv3 = new AdvanceTicket(90, 5);
		System.out.println(adv3);        // should display 90 and 40.0
		
//  Blank line to separate testing groups for easier reading
		System.out.println();

//  Calling the Ticket superclass constructor and creating a subclass ticket.		
		Ticket test = new WalkupTicket(17);
		System.out.println(test);        // should display 17 and 50.0
		
//  Blank line to separate testing groups for easier reading		
		System.out.println();
		
//  Ticket array for new ticket object creation, with for loop to display ticket info.
//    Should display identically to ticket objects above.
		Ticket[] group = { new WalkupTicket(100), new AdvanceTicket(80, 20), new AdvanceTicket(81, 10),
				new AdvanceTicket(90, 5) };
		for (int i = 0; i < group.length; i++) {
			System.out.println(group[i].toString());
		} // end for loop

//  Blank line to separate testing groups for easier reading
			System.out.println();
			
//  Tests to call just the getPrice methods for individual objects and array objects.
		System.out.println(walk1.getPrice());      // 50.0
		System.out.println(adv1.getPrice());       // 30.0
		System.out.println(group[2].getPrice());   // 30.0
		
//  Test to trigger the if-exception for negative advancedDays values.
		AdvanceTicket adv4 = new AdvanceTicket(99, 0);
		System.out.println(adv4);    // should throw IllegalArgumentException w/ message
	} // end main

}  // end getTickets class
