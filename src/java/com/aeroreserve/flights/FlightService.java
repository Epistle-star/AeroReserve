/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.flights;

import com.aeroreserve.destinations.CityService;
import com.aeroreserve.destinations.City;
import com.aeroreserve.util.EntityManagerUtil;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class FlightService {
    
     private final EntityManager entityManager;

    public FlightService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void addFlights(Flight flights){
        if(flights.getFlightTime() == null)
            throw  new IllegalArgumentException("flightTime Cannot be blank");
        if(flights.getArrivaldate()== null)
            throw  new IllegalArgumentException("Arrival Date Cannot be blank");
        if(flights.getDestination()== null)
            throw  new IllegalArgumentException("Destinations Cannot be blank");
        if(flights.getOrigin() == null)
            throw new IllegalArgumentException("Origin Cannot be Blank");
        
        
        entityManager.getTransaction().begin();
	entityManager.persist(flights);
	entityManager.getTransaction().commit();
    }
    
    public Flight getFlightbyId(int id){
        
        String queryStr = "SELECT u FROM Flight u WHERE u.id = :id";
		
		TypedQuery<Flight> query = entityManager.createQuery(queryStr, Flight.class);
		query.setParameter("id", id);
		
		try
		{
			return query.getSingleResult();
		}
		catch(NoResultException ex)
		{
			return null;
		}
    }
    
   public List<Flight> getFlights(String origin, String destination) {
    if (origin == null || destination == null) {
        // Handle the case where either origin or destination is null
        throw new IllegalArgumentException("Origin and destination must be provided");
    }

     CityService destinationService = new CityService(EntityManagerUtil.getEntityManager());

    City originObj = destinationService.getCity(origin);
    City destinationObj = destinationService.getCity(destination);

    if (originObj == null || destinationObj == null) {
        // Handle the case where either origin or destination is not found
        return null;
    }
    
    String queryStr = "SELECT f FROM Flight f WHERE f.origin = :origin AND f.destination = :destination";

    TypedQuery<Flight> query = entityManager.createQuery(queryStr, Flight.class);
    query.setParameter("origin", originObj);
    query.setParameter("destination", destinationObj);

    try {
        return query.getResultList();
    } catch (NoResultException e) {
        // Handle the case where no matching flights are found
        return Collections.emptyList(); // or return null, depending on your preference
    }
}
   
   
 public Flight getFlight(String origin, String destination) {
    if (origin == null || destination == null) {
        // Handle the case where either origin or destination is null
        throw  new IllegalArgumentException("Origin and destination must be provided");
        
    }
    
     CityService destinationService = new CityService(EntityManagerUtil.getEntityManager());

    City originObj = destinationService.getCity(origin);
    City destinationObj = destinationService.getCity(destination);

    if (originObj == null || destinationObj == null) {
        // Handle the case where either origin or destination is not found
        return null;
    }
    
    String queryStr = "SELECT f FROM Flight f WHERE f.origin = :origin AND f.destination = :destination";

    TypedQuery<Flight> query = entityManager.createQuery(queryStr, Flight.class);
    query.setParameter("origin", originObj);
    query.setParameter("destination", destinationObj);

    try {
        return query.getSingleResult();
    } catch (NoResultException e) {
        // Handle the case where no matching flight is found
        return null;
    } catch (NonUniqueResultException e) {
        // Handle the case where multiple flights are found (though this is not expected)
        e.printStackTrace();
        return null;
    }
}
  
   public Flight getArrivalTime(String origin, String destination) {
    if (origin == null || destination == null) {
        throw new IllegalArgumentException("Origin and destination must be provided");
    }
    
    CityService destinationService = new CityService(EntityManagerUtil.getEntityManager());

    City originObj = destinationService.getCity(origin);
    City destinationObj = destinationService.getCity(destination);

    if (originObj == null || destinationObj == null) {
        // Handle the case where either origin or destination is not found
        return null;
    }
    
        String queryStr = "SELECT d FROM Flight d WHERE d.origin = :origin AND d.destination = :destinations";

    TypedQuery<Flight> query = entityManager.createQuery(queryStr, Flight.class);
    query.setParameter("origin", originObj);
    query.setParameter("destinations", destinationObj);

    try {
        List<Flight> flightTimes = query.getResultList();

        if (flightTimes.isEmpty()) {
            return null;
        }

        return flightTimes.get(0);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
   
   public Flight getDestination(City destination){
       if(destination == null)
           throw new IllegalArgumentException("Flights does not Exists");
       
         String queryStr = "SELECT d FROM Flight d WHERE  d.destination = :destinations";

    TypedQuery<Flight> query = entityManager.createQuery(queryStr, Flight.class);
    query.setParameter("destinations", destination);

    try {
        List<Flight> flightTimes = query.getResultList();

        if (flightTimes.isEmpty()) {
            return null;
        }

        return flightTimes.get(0);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
        }
   } 
}
