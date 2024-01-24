/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.flights;

import com.aeroreserve.destinations.CityService;
import com.aeroreserve.destinations.City;
import com.aeroreserve.util.EntityManagerUtil;
import java.util.List;

/**
 *
 * @author Epistle
 */
public class FlightsApp {
    
    public class Rectangle
{
	private double length;
	private double width;

        public Rectangle() {
        }
        
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length)
	{
		if(length < 0.0 || length > 20.0)
			throw new IllegalArgumentException("length must be between 0.0 and 20.0");
		this.length = length;
	}
	public double getLength()
	{
		return length;
	}
	
	public void setWidth(double width)
	{
		if(width < 0.0 || width > 20.0)
			throw new IllegalArgumentException("width must be between 0.0 and 20.0");
		this.width = width;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea(double length, double width)
	{
		double area = length * width;
		return area;
	}
	
	public double getPerimeter(double length, double width)
	{
		double perimeter = length + width;
		return perimeter;
	}
    }
	

    public static void main(String[] args) {
//        CityService destinations = new CityService(EntityManagerUtil.getEntityManager());
//        
//        Flight flight1 = new Flight("8:00", "9:00", destinations.getCity("Rivers"), destinations.getCity("Abuja"));
//        Flight flight2 = new Flight("2:00", "2:50", destinations.getCity("Rivers"), destinations.getCity("Owerri"));
//        Flight flight3 = new Flight("7:00", "7:50", destinations.getCity("Rivers"), destinations.getCity("Lagos"));
//        Flight flight4 = new Flight("12:00", "1:00", destinations.getCity("Abuja"), destinations.getCity("Rivers"));
//        Flight flight5  = new Flight("11:00", "12:35", destinations.getCity("Abuja"), destinations.getCity("Owerri"));
//        Flight flight6 = new Flight("3:00", "4:00", destinations.getCity("Abuja"), destinations.getCity("Lagos"));
//        Flight flight7 = new Flight("12:00", "12:45", destinations.getCity("Lagos"), destinations.getCity("Rivers"));
//        Flight flight8 = new Flight("1:00", "2:45", destinations.getCity("Lagos"), destinations.getCity("Owerri"));
//        Flight flight9 = new Flight("7:00", "8:00", destinations.getCity("Lagos"), destinations.getCity("Abuja"));
//        Flight flight10 = new Flight("12:00", "12:45", destinations.getCity("Owerri"), destinations.getCity("Rivers"));
//        Flight flight11 = new Flight("9:00", "10:00", destinations.getCity("Owerri"), destinations.getCity("Lagos"));
//        Flight flight12 = new Flight("1:00", "2:30", destinations.getCity("Owerri"), destinations.getCity("Abuja"));
//
//
////        Flight flights = new Flight(flightTime, arrivaldate, departuredate, origin, destination);
//        
//        FlightService flightService = new FlightService(EntityManagerUtil.getEntityManager());
//        
//        flightService.addFlights(flight1);
//        flightService.addFlights(flight2);        
//        flightService.addFlights(flight3);
//        flightService.addFlights(flight4);
//        flightService.addFlights(flight5);
//        flightService.addFlights(flight6);        
//        flightService.addFlights(flight7);        
//        flightService.addFlights(flight8);        
//        flightService.addFlights(flight9);        
//        flightService.addFlights(flight10);        
//        flightService.addFlights(flight11);        
//        flightService.addFlights(flight12);



//            String origin = "Lagos";
//            String destination = "Rivers";
//            Flight time = flightService.getFlight(origin, destination);
//            Flight time2 = flightService.getArrivalTime(origin, destination);
//            List<Flight> flights = flightService.getFlights(origin, destination);
//            
//            System.out.println(time.getFlightTime());
//            System.out.println(time2.getArrivaldate());
//            System.out.println(flights);


        double length = 12.5;
        double width = 2.4;
                Rectangle rect = new Rectangle();
        
		double rectArea = rect.getArea(length, width);
		System.out.println("Area of Rectangle: " + rectArea);
		
    }
}
