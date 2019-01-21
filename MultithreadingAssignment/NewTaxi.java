package com.au.multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

public class NewTaxi implements Runnable {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");



	    public static final int taxiSeats = 4;

	   


	    private int taxiId;

	    private DropDestination destination;

	    private HashMap<Integer, NewPassenger> nonemptySeats = new HashMap<Integer, NewPassenger>(taxiSeats);



	    private TaxiState state = TaxiState.waiting;

	    private LinkedList<NewTaxi> destinationList;

	    private LinkedList<NewTaxi> taxiQueue;

	    private int standWaitTime = 0;



	    public NewTaxi(int taxiId, LinkedList<NewTaxi> destinationList, LinkedList<NewTaxi> taxiQueue) {

	        this.taxiId = taxiId;

	        this.destinationList = destinationList;

	        this.taxiQueue = taxiQueue;

	    }



	    public DropDestination getDestination() {

	        return this.destination;

	    }



	    public void setDestination(DropDestination destination) {

	        this.destination = destination;

	    }



	    public void occupySeat(NewPassenger p) {

	    	nonemptySeats.put(p.getPassengerId(), p);

	    }



	    public HashMap nonEmptySeats() {

	        return this.nonemptySeats;

	    }



	    public int getTaxiId() {
			return taxiId;
		}



		public void setTaxiId(int taxiId) {
			this.taxiId = taxiId;
		}



		public TaxiState getState() {

	        return this.state;

	    }



	    public boolean waitingForPassengers() {

	        return this.state == TaxiState.gettingPassenger;

	    }



	    @Override

	    public String toString() {

	        String str = "TAXI No: " + this.taxiId + " to " + this.destination +" ";

	        return str;

	    }



	   

	    public void run() {



	        while (this.state != TaxiState.departing) {

	            try {

	                if (this.state == TaxiState.waiting) {

	                    if (taxiQueue.getFirst() == this && destinationList.size() < ApplicationMain.taxiStandSize) {

	                        destinationList.add(taxiQueue.remove());

	                        this.state = TaxiState.gettingPassenger;

	                        System.out.println(this + " moved from queue to stand  ");

	                    } else {

	                        Thread.sleep(100);

	                    }

	                }

	                if (this.state == TaxiState.gettingPassenger) {

	                    this.standWaitTime += 100;

	                    if (this.standWaitTime > 45000 || nonemptySeats.size() == taxiSeats) {

	                        this.state = TaxiState.departing;

	                        destinationList.remove(this);

	                        System.out.println(  this + " left the taxi stand with "

	                                + this.nonemptySeats.size() + " passengers"); 

	                    } else {

	                        Thread.sleep(100);

	                    }

	                }

	            } catch (InterruptedException e) {

	                e.printStackTrace();

	            }

	        }

	    }



	    public enum TaxiState {

	        waiting, gettingPassenger, departing;

	    }
}
