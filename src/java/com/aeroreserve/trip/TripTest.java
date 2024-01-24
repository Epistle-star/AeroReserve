/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.trip;

import com.aeroreserve.passengers.PassengerService;
import com.aeroreserve.passengers.Passenger;
import com.aeroreserve.util.EntityManagerUtil;

/**
 *
 * @author Epistle
 */
public class TripTest {
    public static void main(String[] args) {
        PassengerService passengers = new PassengerService(EntityManagerUtil.getEntityManager());
        
//        Trip trip1 = new Trip(TripType.Round, passengers.getPassengers("John"));
//        Trip trip2 = new Trip(TripType.OneWay, passengers.getPassengers("Jane"));
//        
//        TripService tripService = new TripService(EntityManagerUtil.getEntityManager());
//        
//        tripService.addTrip(trip2);
//        tripService.addTrip(trip1);

        TripService tripService = new TripService(EntityManagerUtil.getEntityManager());
        
        Trip trip1 =  tripService.getTrip("635");
        System.out.println("Trip: " + trip1.getDepartureBooking().getCategory());
    }
}
