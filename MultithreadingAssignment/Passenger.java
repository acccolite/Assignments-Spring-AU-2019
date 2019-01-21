package com.au.multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;


public class Passenger implements Runnable{
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private LinkedList<NewPassenger> passengerQueue;

    private LinkedList<NewTaxi>destinationList;



   


    public Passenger(LinkedList<NewPassenger> passengerQueue, LinkedList<NewTaxi> destinationList) {
		
		this.passengerQueue = passengerQueue;
		this.destinationList = destinationList;
	}






	public void run() {

        while (true) {

            try {
            	 int pid = (int) ((Math.random() * ((1000 - 500) + 1)) + 500);

                 int delay = (int) ((Math.random() * ((6000 - 3000) + 1)) + 3000);

                 int dest = (int) (Math.random() * DropDestination.values().length);
                NewPassenger passengerObj = new NewPassenger(pid, DropDestination.values()[dest],destinationList,passengerQueue);

                passengerQueue.add(passengerObj);

                new Thread(passengerObj).start();

                System.out

                        .println( passengerObj + " joined the PASSENGER QUEUE"); 

                Thread.sleep(6000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

	
}
