/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.destinations;

import com.aeroreserve.flights.Flight;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class CityService {
    
     private final EntityManager entityManager;

    public CityService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void addDestination(City city){
        if(city.getName().isEmpty() || city.getName() == null)
            throw new IllegalArgumentException("Name cannot be Blank");
        
        entityManager.getTransaction().begin();
	entityManager.persist(city);
	entityManager.getTransaction().commit();
    }
    
    public City getCity(String cityName) {
    if (cityName == null) {
        throw new IllegalArgumentException("City cannot be null");
    }

    String queryStr = "SELECT c FROM City c WHERE c.name = :name";

    TypedQuery<City> query = entityManager.createQuery(queryStr, City.class);
    query.setParameter("name", cityName);

    try {
        List<City> destinationsList = query.getResultList();
        return destinationsList.isEmpty() ? null : destinationsList.get(0);
    } catch (NoResultException e) {
        return null;
    }
}
    
//    public City getOrgin(String origin) {
//    if (origin == null) {
//        throw new IllegalArgumentException("Origin cannot be null");
//    }
//
//    String queryStr = "SELECT d FROM Destinations d WHERE d.origin = :origin";
//
//    TypedQuery<City> query = entityManager.createQuery(queryStr, City.class);
//    query.setParameter("origin", origin);
//
//    try {
//        List<City> destinationsList = query.getResultList();
//        return destinationsList.isEmpty() ? null : destinationsList.get(0);
//    } catch (NoResultException e) {
//        return null;
//    }
//}
    
}
