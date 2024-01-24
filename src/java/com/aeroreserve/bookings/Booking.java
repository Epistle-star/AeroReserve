/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.bookings;

import com.aeroreserve.categories.Category;
import com.aeroreserve.flights.Flight;
import com.aeroreserve.passengers.Passenger;
import com.aeroreserve.trip.Trip;
import com.aeroreserve.user.ContactInfo;
import com.aeroreserve.user.User;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Epistle
 */
@Entity
@Table(name = "bookings")
public class Booking implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tripID", referencedColumnName = "id")
    private Trip trip;
    
    @JoinColumn(name = "flightID", referencedColumnName = "id")
    @ManyToOne
    private Flight flight;
    
    @ManyToOne
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;
    
    @OneToOne
    @JoinColumn(name = "contactInfo", referencedColumnName = "id")
    private ContactInfo contact;
    
    @Column(nullable = false)
    private LocalDate flightDate;

    public Booking() {
    }

    public Booking(BookingStatus bookingStatus, Trip trip, Flight flight,  
            Category category, ContactInfo contact, LocalDate flightDate) {
        
        this.bookingStatus = bookingStatus;
        this.trip = trip;
        this.flight = flight;
        this.category = category;
        this.contact = contact;
        this.flightDate = flightDate;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }
    
    
}
