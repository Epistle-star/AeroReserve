/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.flights;

import com.aeroreserve.destinations.City;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Epistle
 */
@Entity
@Table(name = "flights")
public class Flight implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String flightTime;
    
    @Column(nullable = false)
    private String arrivaltime;
    
    @ManyToOne
    @JoinColumn(name = "origin", referencedColumnName = "name")
    private City origin;
    
    @ManyToOne
    @JoinColumn(name = "destination", referencedColumnName = "name")
    private City destination;

    public Flight() {
    }

    public Flight(String flightTime, String arrivaltime,City origin, City destinations) {
//        this.id = id;
        this.flightTime = flightTime;
        this.arrivaltime = arrivaltime;
        this.origin = origin;
        this.destination = destinations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getArrivaldate() {
        return arrivaltime;
    }

    public void setArrivaldate(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }


    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flights{" + "id=" + id + ", flightTime=" + flightTime + ", arrivaldate=" + arrivaltime + ", origin=" + origin + ", destinations=" + destination + '}';
    }
    
    
    
    
}
