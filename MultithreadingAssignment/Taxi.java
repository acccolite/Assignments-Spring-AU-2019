package com.au.multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class Taxi  implements Runnable{
	public static final int taxiSeats = 4;
	
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 private LinkedList<NewTaxi> taxiQueue;

	 private LinkedList<NewTaxi> destinationList;


	  public Taxi(LinkedList<NewTaxi> taxiQueue, LinkedList<NewTaxi> destinationList) {
		
		this.taxiQueue = taxiQueue;
		this.destinationList = destinationList;
	}

   public void run() {

	        while (true) {

	            try {
	            	 int tid = (int) ((Math.random() * ((500 - 100) + 1)) + 100);

	                 int delay = (int) ((Math.random() * ((6000 - 3000) + 1)) + 3000);
	               

	                NewTaxi taxiObj = new NewTaxi(tid,destinationList,taxiQueue);

	                taxiQueue.add(taxiObj);

	                new Thread(taxiObj).start();

	                System.out.println(  taxiObj + " joined the TAXI QUEUE"); 

	                Thread.sleep(delay);

	            } catch (InterruptedException e) {

	                e.printStackTrace();

	            }

	        }

	    }

	
}
