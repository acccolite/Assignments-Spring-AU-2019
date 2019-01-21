package com.au.multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class ApplicationMain {
	public static int taxiStandSize=5;
	public static LinkedList<NewTaxi> destinationList = new LinkedList<NewTaxi>();
	public static void main(String [] args) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		LinkedList<NewPassenger> passengerQueue = new LinkedList<NewPassenger>();

        LinkedList<NewTaxi> taxiQueue = new LinkedList<NewTaxi>();
		Taxi taxiObj=new Taxi(taxiQueue,destinationList);
		Passenger passengerObj=new Passenger(passengerQueue,destinationList);
		 new Thread(taxiObj).start();
		 System.out.println("New taxi created at "+dateFormat.format(new Date()));
		 new Thread(passengerObj).start();
		 System.out.println("New Passenger created at "+dateFormat.format(new Date())); 
		
	}

	

}
