/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aeroreserve.bookings;

import com.aeroreserve.categories.Category;
import com.aeroreserve.destinations.City;
import com.aeroreserve.flights.Flight;
import com.aeroreserve.flights.FlightService;
import com.aeroreserve.passengers.Passenger;
import com.aeroreserve.passengers.PassengerService;
import com.aeroreserve.trip.Trip;
import com.aeroreserve.trip.TripService;
import com.aeroreserve.trip.TripType;
import com.aeroreserve.user.ContactInfo;
import com.aeroreserve.user.ContactService;
import com.aeroreserve.util.EntityManagerUtil;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.SystemTray;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Epistle
 */
@WebServlet(name="BookingController", urlPatterns={"/review-bookings", "/contact-info", "/successfully-booked"})
public class BookingController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    } 
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         String servlethPath = request.getServletPath();
        
        FlightService flightService = new FlightService(EntityManagerUtil.getEntityManager());
        
        HttpSession session = request.getSession();
        
        String arrivalLocation = (String) session.getAttribute("arrivalLocation");
        String departureLocation = (String) session.getAttribute("departureLocation");
        String departureDate = (String) session.getAttribute("departureDate");
        String returnDate = (String) session.getAttribute("returnDate");
        Trip trip = (Trip) session.getAttribute("trip");
        
        List<Passenger> passengerList = new ArrayList<>();
            
        if(servlethPath.equals("/contact-info")){
            
        int numPssengers = Integer.parseInt(request.getParameter("numPassengers"));
        
        for(int i = 1; i <= numPssengers; i++){
            Passenger passenger = new Passenger();
            String firstName = request.getParameter("firstname" + i);
            String lastName = request.getParameter("lastname" + i);
            String gender = request.getParameter("gender" + i);
            String dob = request.getParameter("dob" + i);
            
            
            passenger.setFirstName(firstName);
            passenger.setLastName(lastName);
            passenger.setGender(gender);
            passenger.setDateOfBirth(dob);
            
            System.out.println("gender: " + gender);
            passengerList.add(passenger);
        }
            session.setAttribute("passengers", passengerList);
            trip.setPassengers(passengerList);
            System.out.println("passengersList: " + passengerList.size());
            request.getRequestDispatcher("Contact-info.jsp").forward(request, response);
    }
        
        if(servlethPath.equals("/review-bookings")){
             String fullName = request.getParameter("fullname");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            
            if(fullName.isEmpty() || email.isEmpty() || phone.isEmpty()){
                request.setAttribute("feedback", "All Fields Are Required");
                request.getRequestDispatcher("/Contact-info.jsp").forward(request, response);
                return;
            }
            ContactInfo contact = new ContactInfo();
            contact.setFullName(fullName);
            contact.setEmail(email);
            contact.setPhone(phone);
            
            trip.getDepartureBooking().setContact(contact);
            TripType tripType = trip.getTripType();
            
            if(tripType.equals("Round Trip")){
                trip.getReturnBooking().setContact(contact);
            Flight type = trip.getReturnBooking().getFlight();
            }
            
            
        int numPassengers = (int) session.getAttribute("numPassengers");
        
            
            List<Flight> flightsList = flightService.getFlights(departureLocation, arrivalLocation);
        List<Flight> returnFlights = flightService.getFlights(arrivalLocation, departureLocation);
        
        List<Passenger> passenger = (List < Passenger >)session.getAttribute("passengers");
            request.setAttribute("flightsList", flightsList);
            request.setAttribute("returnflight", returnFlights);
            request.setAttribute("trip", trip);
            request.setAttribute("passengers", passenger);
            request.setAttribute("departureDate", departureDate );
            request.setAttribute("returndate", returnDate);
        request.setAttribute("numPassengers", numPassengers);
           RequestDispatcher dispatcher = request.getRequestDispatcher("review-bookings.jsp");
           dispatcher.forward(request, response);
        }
        
        if(servlethPath.equals("/successfully-booked")){
            TripType tripType = trip.getTripType();
            Booking departureBooking = trip.getDepartureBooking();
            ContactInfo contact = departureBooking.getContact();
            String fullName = contact.getFullName();
            String phone = contact.getPhone();
            String email = contact.getEmail();
            Flight departureFlight = departureBooking.getFlight();
            
            List<Passenger> passengers = trip.getPassengers();
            
            
            
            
            ContactService contactService = new ContactService(EntityManagerUtil.getEntityManager());
            PassengerService passengerService = new PassengerService(EntityManagerUtil.getEntityManager());
            BookingService bookingService = new BookingService(EntityManagerUtil.getEntityManager());
            TripService tripService = new TripService(EntityManagerUtil.getEntityManager());
            
            
            
            String code = tripService.getReferenceCode();
            trip.setReferenceCode(code);
            String referenceCode = trip.getReferenceCode();
            System.out.println("reference code: " + referenceCode);
            departureBooking.setBookingStatus(BookingStatus.BOOKED);
            Trip trips = new Trip(tripType, referenceCode, departureBooking);
            contactService.addContact(contact);
            for(Passenger passenger : passengers){
                passenger.setContactInfo(contact);
                passengerService.addPassengers(passenger);
            }
            System.out.println("tripType: " + tripType);
            bookingService.addBooking(departureBooking);
//            tripService.addTrip(trips);
            
            if(tripType.equals("Round")){
                Booking returnBooking = trip.getReturnBooking();
                returnBooking.setContact(contact);
                bookingService.addBooking(returnBooking);
                Trip roundTrip = new Trip(tripType, referenceCode, departureBooking, returnBooking);
                tripService.addTrip(roundTrip);
            }
            request.setAttribute("referenceCode", code);
            
            request.getRequestDispatcher("/successfulPage.jsp").forward(request, response);
        }
    }
}
