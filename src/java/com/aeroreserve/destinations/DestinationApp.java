/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.destinations;

import com.aeroreserve.util.EntityManagerUtil;

/**
 *
 * @author Epistle
 */
public class DestinationApp {
    public static void main(String[] args) {
        City destination1 = new City("Abuja");
        City destination2 = new City("Rivers");
        City destination3 = new City("Lagos");      
        City destination6 = new City("Owerri");

        City destination4 = new City("Abuja");
        City destination5 = new City("Rivers");
        
        
        CityService destinationService = new CityService(EntityManagerUtil.getEntityManager());
        
        
        destinationService.addDestination(destination6);
        destinationService.addDestination(destination5);
        destinationService.addDestination(destination4);
        destinationService.addDestination(destination3);
        destinationService.addDestination(destination2);
        destinationService.addDestination(destination1);

//            String destinations = destinationService.getCity("Owerri");
            
//            System.out.println(destinations);
    }
}
