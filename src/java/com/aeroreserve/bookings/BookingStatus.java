/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.bookings;

/**
 *
 * @author Epistle
 */
public enum BookingStatus {
    BOOKED("Booked"),
    COMPLETED("Completed"),
    EXPIRED("Expired"), 
    PENDING("Pending");
    
    private String name;

    private BookingStatus(String name) {
        this.name = name;
    }
    
    public String getName()
	{
		return name;
	}
    
}
