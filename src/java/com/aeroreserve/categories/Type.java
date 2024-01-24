/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.categories;

/**
 *
 * @author Epistle
 */
public enum Type {
    
    ECONOMY("Economy"),
    BUSINESS("Business");
    
    private String name;

    private Type(String name) {
        this.name = name;
    }
    
    public String getName()
	{
		return name;
	}
 }

