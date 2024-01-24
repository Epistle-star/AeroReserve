/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.passengers;

import com.aeroreserve.user.ContactService;
import com.aeroreserve.util.EntityManagerUtil;

/**
 *
 * @author Epistle
 */
public class PassengersApp {
    public static void main(String[] args) {
        ContactService contactService = new ContactService(EntityManagerUtil.getEntityManager());
        
//        Passenger passenger1 = new Passenger("John", "Doe", "11-03-2005", "male", contactService.getContact("Onunwor Ebube"));
//        Passenger passenger2 = new Passenger("Jane", "Doe", "11-03-2002", "female");
        
        
        PassengerService passengerService = new PassengerService(EntityManagerUtil.getEntityManager());
        
//        passengerService.addPassengers(passenger2);
//        passengerService.addPassengers(passenger1);
//    }
}
