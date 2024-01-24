/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.trip;

import com.aeroreserve.bookings.Booking;
import com.aeroreserve.passengers.Passenger;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Epistle
 */
@Entity
@Table(name = "trip")
public class Trip implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TripType tripType;
    
    @Column(nullable = false)
    private String referenceCode;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Booking departureBooking;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Booking returnBooking;
    
    @OneToMany
    private List<Passenger> passengers;

    public Trip() {
    }

    public Trip(TripType tripType, String referenceCode, Booking departureBooking) {
        this.tripType = tripType;
        this.referenceCode = referenceCode;
        this.departureBooking = departureBooking;
    }

    public Trip(TripType tripType, String referenceCode, Booking departureBooking, Booking returnBooking) {
        this.tripType = tripType;
        this.referenceCode = referenceCode;
        this.departureBooking = departureBooking;
        this.returnBooking = returnBooking;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public Booking getDepartureBooking() {
        return departureBooking;
    }

    public void setDepartureBooking(Booking departureBooking) {
        this.departureBooking = departureBooking;
    }

    public Booking getReturnBooking() {
        return returnBooking;
    }

    public void setReturnBooking(Booking returnBooking) {
        this.returnBooking = returnBooking;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> otherPassengers) {
        this.passengers = otherPassengers;
    }

    @Override
    public String toString() {
        return "Trip{" + "id=" + id + ", tripType=" + tripType + ", referenceCode=" + referenceCode + ", departureBooking=" + departureBooking + ", returnBooking=" + returnBooking + '}';
    }

    
}
