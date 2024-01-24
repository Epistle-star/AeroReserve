/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.trip;

/**
 *
 * @author Epistle
 */
public enum TripType {
    
    
    Round("Round"),
    OneWay("OneWay");
    
    private String name;

    private TripType(String name) {
        this.name = name;
    }
    
    public String getName()
	{
		return name;
	}
}
