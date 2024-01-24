/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.trip;

import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class TripService {
    
     private final EntityManager entityManager;

    public TripService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public void addTrip(Trip trip){
        if(trip.getTripType() == null)
            throw new IllegalArgumentException("TripType Cannot Be Blank");
//        if(trip.getUserID() == null)
//            throw new IllegalArgumentException("user ID cannot be blank");
//        
        entityManager.getTransaction().begin();
        entityManager.persist(trip);
        entityManager.getTransaction().commit();
    }
    
    public Trip getTrip(TripType tripType){
       String queryStr = "SELECT a FROM Trip a WHERE a.tripType = :type";
		
	TypedQuery<Trip> query = entityManager.createQuery(queryStr, Trip.class);
	query.setParameter("type", tripType);
		
	try
        {
            return query.getSingleResult();
	}
	catch (NoResultException e)
	{
            return null;
	}
    }
    
    public Trip getTrip(String referenceCode){
       if(referenceCode == null)
           throw new IllegalArgumentException("Trip does not exist");
       
       String queryStr = "SELECT s FROM Trip s WHERE s.referenceCode = :number";
       
       TypedQuery<Trip> query = entityManager.createQuery(queryStr, Trip.class);
       query.setParameter("number", referenceCode);
       
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
       
    }
    
     public String getReferenceCode(){
        StringBuilder referenceCode = new StringBuilder();
        
        Random rand = new Random();
        do {    
            for(int i = 1; i <= 3; i++){
                int randomNum = rand.nextInt(9);
                referenceCode.append(randomNum);
            }
            
        } while (getTrip(referenceCode.toString()) != null);
        return referenceCode.toString();
    }
}
