package com.au.multithreading;

import java.util.*;

import java.text.*;





public class NewPassenger implements Runnable {
	public static final int taxiSeats = 4;

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private int passengerId;

    private DropDestination destination;



    private PassengerState state = PassengerState.waiting;

    private LinkedList<NewTaxi> destinationList;

    private LinkedList<NewPassenger> passengerQueue;



    public NewPassenger(int passengerId, DropDestination destination, LinkedList<NewTaxi> destinationList,

            LinkedList<NewPassenger> passengerQueue) {

        this.passengerId = passengerId;

        this.destination = destination;

        this.destinationList = destinationList;

        this.passengerQueue = passengerQueue;

    }



    public int getPassengerId() {

        return this.passengerId;

    }



    public DropDestination getDestination() {

        return this.destination;

    }



    @Override

    public String toString() {

        return "Passenger Id : " + this.passengerId + " to " + this.destination +" ";

    }



    @Override

    public void run() {

        while (this.state == PassengerState.waiting) {

            try {

                if (passengerQueue.peek() == this) {

                    for (NewTaxi t : destinationList) {

                        if (t.getDestination() == null) {

                            t.setDestination(this.destination);

                            t.occupySeat(passengerQueue.remove());

                            this.state = PassengerState.travelling;

                            System.out.println(

                                    this + " moved from queue to " + t ); 

                            break;

                        } else if (t.getDestination() == this.destination && t.waitingForPassengers()

                                && t.nonEmptySeats().size() < Taxi.taxiSeats) {

                            t.occupySeat(passengerQueue.remove());

                            this.state = PassengerState.travelling;

                            System.out.println(

                                     this + " moved from queue to " + t); 

                            break;

                        }

                    }

                } else {

                    Thread.sleep(100);

                }

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }



    enum PassengerState {

        waiting, travelling

    }

}
