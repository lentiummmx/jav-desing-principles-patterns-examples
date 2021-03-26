package com.globant.patterns.structural.delegation.example_1;

public class TicketBookingByAgent implements TravelBooking{
    TravelBooking travelBooking;

    public TicketBookingByAgent(TravelBooking t) {
        this.travelBooking = t;
    }

    /**
     * Delegation --- Here ticket booking responsibility
     * is delegated to other class using polymorphism
     */
    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}
