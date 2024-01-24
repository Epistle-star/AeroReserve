/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.bookings;

import com.aeroreserve.passengers.Passenger;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class BookingService {
    private final EntityManager entityManager;

    public BookingService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public Booking getBooking(int bookingId)
    {
       return entityManager.find(Booking.class, bookingId);
    }
    
    public void addBooking(Booking bookings){
        if(bookings.getBookingStatus() == null)
            throw  new IllegalArgumentException("Booking Status cannot be blank");
        if(bookings.getFlight() == null)
            throw new IllegalArgumentException("Departure Location cannot be blank");
        if(bookings.getCategory() == null)
            throw new IllegalArgumentException("depature Class cannot be blank");
        if(bookings.getTrip() == null)
            throw new IllegalArgumentException("trip not be blank");
        
        entityManager.getTransaction().begin();
        entityManager.persist(bookings);
        entityManager.getTransaction().commit();
    }    
    
    public void updateFlights(String seatNumber, Booking bookings){
        Booking existingBookings = entityManager.find(Booking.class, seatNumber);
		
	if(existingBookings == null)
	{
            String message = String.format("Flights with seatNumber (%s) does not exist", seatNumber);
            throw new IllegalArgumentException(message);
        }
        if(bookings.getBookingStatus() == null)
//            throw  new IllegalArgumentException("Booking Status cannot be blank");
//        if(bookings.getSeatNumber().isEmpty() || bookings.getSeatNumber() == null)
//            throw new IllegalArgumentException("SeatNumber cannot be blank");
//        if(bookings.getDepartureLocation().isEmpty() || bookings.getDepartureLocation() == null)
//            throw new IllegalArgumentException("Departure Location cannot be blank");
//        if(bookings.getArrivalLocation().isEmpty() || bookings.getArrivalLocation() == null)
//            throw new IllegalArgumentException("Arival Location cannot be blank");
//        if(bookings.getPassenger() == null)
//            throw new IllegalArgumentException("UserId cannot be blank");
//        if(bookings.getCategory() == null)
//            throw new IllegalArgumentException("depature Class cannot be blank");
//        if(bookings.getArrivalCategoryId() == null)
//            throw new IllegalArgumentException("Arrival Class cannot be blank");
//        if(bookings.getTripType() == null)
//            throw new IllegalArgumentException("Trip Type cannot be blank");
//        if(bookings.getFlightid() == null)
//            throw new IllegalArgumentException("FlightId cannot be blank");
//        if(bookings.getTripID() == null)
//            throw new IllegalArgumentException("tripid cannot be blank");
//        if(bookings.getContact() == null)
//            throw new IllegalArgumentException("conatact info cannot be blank");
        
//        existingBookings.setArrivalCategoryId(bookings.getArrivalCategoryId());
//        existingBookings.setArrivalLocation(bookings.getArrivalLocation());
//        existingBookings.setBookingStatus(bookings.getBookingStatus());
//        existingBookings.setCategory(bookings.getCategory());
//        existingBookings.setDepartureLocation(bookings.getDepartureLocation());
//        existingBookings.setFlightid(bookings.getFlightid());
//        existingBookings.sesetPassengerookings.getPassenger());
//        existingBookings.setTripType(bookings.getTripType());
//        existingBookings.setSeatNumber(bookings.getSeatNumber());
//        existingBookings.setTripID(bookings.getTripID());
//        existingBookings.setContact(bookings.getContact());
                
        
        entityManager.getTransaction().begin();
        entityManager.persist(existingBookings);
        entityManager.getTransaction().commit();
    }
    
    public void deleteBooking(int bookingId){
        Booking booking = entityManager.find(Booking.class, bookingId);
		
	if(booking == null)
	{
            String message = String.format(
				"Booking with id (%d) does not exist", bookingId);
            throw new IllegalArgumentException(message);
	}
        
        entityManager.getTransaction().begin();
        entityManager.remove(booking);
        entityManager.getTransaction().commit();
                
    }
    
    
    
    
    
    
    
//    public String getSeatNumber(){
//        StringBuilder accountNumber = new StringBuilder();
//		
//		Random rand = new Random();
//		do
//		{
//			for(int i = 1; i <= 3; i++)
//			{
//				int randomNum = rand.nextInt(9);
//				accountNumber.append(randomNum);
//			}
//		}
//		while(getBooking(SeatNumber.toString()) != null);
//		
//		return accountNumber.toString();
//    }
   
}
