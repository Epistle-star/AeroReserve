/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aeroreserve.flights;

import com.aeroreserve.bookings.Booking;
import com.aeroreserve.bookings.BookingStatus;
import com.aeroreserve.categories.Category;
import com.aeroreserve.categories.CategoryService;
import com.aeroreserve.categories.Type;
import com.aeroreserve.destinations.City;
import com.aeroreserve.destinations.CityService;
import com.aeroreserve.passengers.Passenger;
import com.aeroreserve.trip.Trip;
import com.aeroreserve.trip.TripType;
import com.aeroreserve.util.EntityManagerUtil;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
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
@WebServlet(name="FlightController", urlPatterns={"/book-flights", "/get-flights"})
public class FlightController extends HttpServlet {
    
    
    Logger logger = Logger.getLogger(FlightController.class.getName());
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String servlethPath = request.getServletPath();
        
        
            
        
    if(servlethPath.equals("/get-flights")){
         String tripType = request.getParameter("trip-type");
       
    String adultsParam = request.getParameter("adult");
    String childrenParam = request.getParameter("children");
    String departureLocation = request.getParameter("departurelocation");
    String arrivalLocation = request.getParameter("arrivallocation");
    String departureDate = request.getParameter("departuredate");
    String returnDate = request.getParameter("returndate");
  
      
            if(departureLocation.isEmpty() || arrivalLocation.isEmpty() || departureDate.isEmpty()){
                 if(tripType.equals("Round Trip") && returnDate.isEmpty()){
                 request.setAttribute("feedback", "All fields are required");
                 }
                 
                request.setAttribute("feedback", "All fields are required");
                request.getRequestDispatcher("search-flights.jsp").forward(request, response);
                return;
                 }
            
        
        
            CategoryService categoryService = new CategoryService(EntityManagerUtil.getEntityManager());
            CityService cityService = new CityService(EntityManagerUtil.getEntityManager());
            FlightService flightService = new FlightService(EntityManagerUtil.getEntityManager());
            
//            City origin = destinations.getOrgin(departureLocation);
//            City destination = destinations.getCity(arrivalLocation);
            
//            Flight flights = flightService.getFlight(departureLocation, arrivalLocation);  
            List<Flight> flightsList = flightService.getFlights(departureLocation, arrivalLocation);
  
            double economyPrice = categoryService.getCategoryPrice(Type.ECONOMY, departureLocation, arrivalLocation);
            double businessPrice = categoryService.getCategoryPrice(Type.BUSINESS, departureLocation, 
                    arrivalLocation);
            Flight returnFlightTime = flightService.getArrivalTime(arrivalLocation, departureLocation);
            
            List<Flight> returnFlightsList = flightService.getFlights(arrivalLocation, departureLocation);
//            Flight arrivalTime = flightService.getArrivalTime(departureLocation,arrivalLocation);
               if (flightsList.isEmpty()) {
                    request.setAttribute("feedback", "No flight found for the specified route.");
                    request.getRequestDispatcher("search-flights.jsp").forward(request, response);
                    return;
                }
//               System.out.println("time: " + returnFlightTime);

//            String flightTime = flights.getFlightTime();
//            double economyPriceStr  = economyPrice.getCategoryPrice();
//            double bussinessPriceStr = businessPrice.getCategoryPrice();
         

//            String arrivalTimeStr = arrivalTime.getArrivaldate();
                
            
            
            request.setAttribute("flightsList", flightsList);
            request.setAttribute("returnFlightList", returnFlightsList);
            request.setAttribute("returnFlightTime", returnFlightTime);
            
//            request.setAttribute("departureLocation", departureLocation);
//            request.setAttribute("arrivalLocation", arrivalLocation);
            request.setAttribute("economyPrice", economyPrice);
            request.setAttribute("businessPrice", businessPrice);
//            request.setAttribute("flightTime", flightTime);
//            request.setAttribute("arrivalTime", arrivalTimeStr);

            Trip trip = new Trip();
            Flight flight = new Flight();
            
            
            HttpSession locationSession = request.getSession();            
            HttpSession locationSession1 = request.getSession();
            HttpSession datesession = request.getSession();

            locationSession.setAttribute("departureLocation", departureLocation);
            locationSession1.setAttribute("arrivalLocation", arrivalLocation);
            datesession.setAttribute("departureDate", departureDate);
            
            trip.setTripType((tripType.equals("Round Trip")) ? TripType.Round : TripType.OneWay);
            
            int noOfAdults = Integer.parseInt(adultsParam);
            int noOfChildren = Integer.parseInt(childrenParam);
//            trip.setPassengers(new ArrayList<>(noOfAdults + noOfChildren));

            int numPassengers = noOfAdults + noOfChildren;
            
            HttpSession session1 = request.getSession();
            session1.setAttribute("numPassengers", numPassengers);
            
            Booking departureBooking = new Booking();
            departureBooking.setBookingStatus(BookingStatus.PENDING);
            departureBooking.setFlightDate(LocalDate.parse(departureDate));
            departureBooking.setTrip(trip);
            trip.setDepartureBooking(departureBooking);
            request.setAttribute("departureDate", departureDate);
                
                
//            if(tripType.equals("One Way")){
//              
//             request.getRequestDispatcher("get-oneway-flights.jsp").forward(request, response);
//            }
            
            
            if(tripType.equals("Round Trip"))
            {
                 Booking returnBooking = new Booking();
                returnBooking.setBookingStatus(BookingStatus.PENDING);
                returnBooking.setFlightDate(LocalDate.parse(returnDate));
                returnBooking.setTrip(trip);
                trip.setReturnBooking(returnBooking);
                request.setAttribute("returndate", returnDate);
            } 
            
            HttpSession session = request.getSession();
            session.setAttribute("trip", trip);
             request.getRequestDispatcher("get-flightss.jsp").forward(request, response);
        }
    
     
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String servlethPath = request.getServletPath();
        FlightService flightService = new FlightService(EntityManagerUtil.getEntityManager());
        CategoryService categoryService = new CategoryService(EntityManagerUtil.getEntityManager());
        HttpSession session = request.getSession(false);
        
        String flightId = request.getParameter("flightid");
        String returnFlightId = request.getParameter("returnflightid");
        String category = request.getParameter("categoryType");
        
        int flightint  = Integer.parseInt(flightId);
        
        String origin = (String) session.getAttribute("departureLocation");
        String destination = (String) session.getAttribute("arrivalLocation");
        
        Trip trip = (Trip) session.getAttribute("trip");
        Flight flights = flightService.getFlightbyId(flightint);
        Category departureCategory = categoryService.getCategory(Type.valueOf(category), origin, destination);
        
        if(session != null){
            if(trip != null){
                trip.getDepartureBooking().setFlight(flights);
                trip.getDepartureBooking().setCategory(departureCategory);
            }
            else{
                System.out.println("Trip is null");
            }
        }
        else{
            System.out.println("Session is null");
        }
        
        
                TripType tripType = trip.getTripType();
                String tripString = tripType.toString();
                if(tripString.equals("Round")){
                    String classs = request.getParameter("returnEconomy");
                    int returnFlightInt = Integer.parseInt(returnFlightId);
                    Flight returnFlight = flightService.getFlightbyId(returnFlightInt);
                    Category returnCategory = categoryService.getCategory(Type.valueOf(classs), origin, destination);
                    trip.getReturnBooking().setFlight(returnFlight);
                    trip.getReturnBooking().setCategory(returnCategory);
                }
        
        int numPassengers = (int) session.getAttribute("numPassengers");
        
        request.setAttribute("passengers", numPassengers);
        
        request.getRequestDispatcher("get-passengers.jsp").forward(request, response);
      
    }
    

}
