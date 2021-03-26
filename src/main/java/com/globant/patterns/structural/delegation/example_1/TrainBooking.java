package com.globant.patterns.structural.delegation.example_1;

public class TrainBooking implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Train ticket booked");
    }
}
