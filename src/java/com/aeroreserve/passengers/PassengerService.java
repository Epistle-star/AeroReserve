/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.passengers;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class PassengerService {
    
    private final EntityManager entityManager;

    public PassengerService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void addPassengers(Passenger passengers){
        if(passengers.getFirstName() == null || passengers.getFirstName().isEmpty())
            throw new IllegalArgumentException("First Name cannot be blank");
        if(passengers.getLastName()== null || passengers.getLastName().isEmpty())
            throw new IllegalArgumentException("Last Name cannot be blank");
        if(passengers.getDateOfBirth()== null || passengers.getDateOfBirth().isEmpty())
            throw new IllegalArgumentException("DOB cannot be blank");
        if(passengers.getGender()== null || passengers.getGender().isEmpty())
            throw new IllegalArgumentException("Gender cannot be blank");
        
        entityManager.getTransaction().begin();
	entityManager.persist(passengers);
	entityManager.getTransaction().commit();
    }
    
    public Passenger getPassengers(String firstName){
        if(firstName == null)
            throw new IllegalArgumentException("Passenger Does not Exist");
        String querystr = "SELECT f FROM Passengers f WHERE f.firstName = :name";
        
        TypedQuery<Passenger> query = entityManager.createQuery(querystr, Passenger.class);
        query.setParameter("name", firstName);
        
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
