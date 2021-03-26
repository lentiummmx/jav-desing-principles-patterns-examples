package com.globant.patterns.structural.delegation.example_1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World - 1!" );

        TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
        agent.bookTicket();

        agent = new TicketBookingByAgent(new AirBooking());
        agent.bookTicket();
    }
}
