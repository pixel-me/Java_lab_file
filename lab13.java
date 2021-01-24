package com.company;

import java.util.Vector;

public class lab13 {

    String Origin;
    String destination;
    String departure;
    String arrival;
    String fees;
    Vector<lab13> v = new Vector<>();

    public lab13(String Origin, String destination, String departure, String arrival, String amount) {
        this.Origin = Origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.fees = amount;
    }

    public static void main(String[] args){
        lab13 ticket = new lab13("SISTec", "Gandhinagar Bhopal", "9:00", "5:00", "85000");
        ticket.v.add(ticket);
        for (com.company.lab13 lab13 : ticket.v)
            System.out.println(lab13.Origin);
    }
}
