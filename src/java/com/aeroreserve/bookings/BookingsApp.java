/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.bookings;

import com.aeroreserve.categories.CategoryService;
import com.aeroreserve.categories.Type;
import com.aeroreserve.flights.FlightService;
import com.aeroreserve.passengers.PassengerService;
import com.aeroreserve.trip.TripService;
import com.aeroreserve.trip.TripType;
import com.aeroreserve.user.ContactService;
import com.aeroreserve.user.UserService;
import com.aeroreserve.util.EntityManagerUtil;

/**
 *
 * @author Epistle
 */
public class BookingsApp {
    public static void main(String[] args) {
        BookingService bookings = new BookingService(EntityManagerUtil.getEntityManager());
        PassengerService passengers = new PassengerService(EntityManagerUtil.getEntityManager());
        FlightService flights = new FlightService(EntityManagerUtil.getEntityManager());
        CategoryService category = new CategoryService(EntityManagerUtil.getEntityManager());
        TripService trips = new TripService(EntityManagerUtil.getEntityManager());
        ContactService contact = new ContactService(EntityManagerUtil.getEntityManager());
        UserService service = new UserService(EntityManagerUtil.getEntityManager());
        
        
//        Booking booking1 = new Booking(BookingStatus.BOOKED, trips.getTrip(TripType.Round), "Rivers", "Abuja", bookings.getReferenceCode(), bookings.getSeatNumber(), 
//                passengers.getPassengers("John"), flights.getFlights("PortHarcourt"), category.getCategories(Type.ECONOMY), 
//                category.getCategories(Type.ECONOMY), contact.getContact("John Doe"));
//        
//        
//        Booking booking2 = new Booking(BookingStatus.BOOKED, trips.getTrip(TripType.Round), "Abuja", "Rivers", bookings.getReferenceCode(), bookings.getSeatNumber()
//                , passengers.getPassengers("John"), flights.getFlights("PortHarcourt"), category.getCategories(Type.ECONOMY), 
//                category.getCategories(Type.ECONOMY), contact.getContact("John Doe"));
        
//        Booking bookings1 = new Booking(BookingStatus.BOOKED, tripID, departureLocation, 
//                arrivalLocation, seatNumber, referenceid, flightid, departureCategoryId, arrivalCategoryId);
        
//        bookings.addBooking(booking2);
//        bookings.addBooking(booking1);
    }
}
