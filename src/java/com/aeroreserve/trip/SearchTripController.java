/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aeroreserve.trip;

import com.aeroreserve.passengers.Passenger;
import com.aeroreserve.passengers.PassengerService;
import com.aeroreserve.util.EntityManagerUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Epistle
 */
@WebServlet(name="SearchTripController", urlPatterns={"/search-trip"})
public class SearchTripController extends HttpServlet {
   
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String referenceCode = request.getParameter("referenceid");
        TripService tripService = new TripService(EntityManagerUtil.getEntityManager());
        
        Trip trip = tripService.getTrip(referenceCode);
        List<Passenger> passengers = trip.getPassengers();
        for(Passenger passenger : passengers){
            request.setAttribute("passenger", passenger);
        }
        request.setAttribute("trip", trip);
        request.getRequestDispatcher("searchTrip.jsp").forward(request, response);
    }

}
