/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.categories;

import com.aeroreserve.destinations.CityService;
import com.aeroreserve.destinations.City;
import com.aeroreserve.flights.Flight;
import com.aeroreserve.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class CategoryService {
    
     private final EntityManager entityManager;

    public CategoryService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public void addCategory(Category category){
        if(category.getCategoryType() == null)
            throw new IllegalArgumentException("Category Type Cannot be blank");
        if(category.getDestination() == null)
            throw new IllegalArgumentException("Destination cannot be blank");
        if(category.getOrigin() == null)
            throw new IllegalArgumentException("Origin cannot be blank");
        
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
    }
    
    public Category getCategories(Type categoryType)
    {
        String queryStr = "SELECT a FROM Category a WHERE a.categoryType = :type";
		
		TypedQuery<Category> query = entityManager.createQuery(queryStr, Category.class);
		query.setParameter("type", categoryType);
		
		try
		{
			return query.getSingleResult();
		}
		catch (NoResultException e)
		{
			return null;
		}
    }
    
    public Category getCategory(Type categorType, String origin, String destination){
        CityService cityService = new CityService(EntityManagerUtil.getEntityManager());

    City originObj = cityService.getCity(origin);
    City destinationObj = cityService.getCity(destination);
        
        
        String queryStr = "SELECT c FROM Category c WHERE c.categoryType = :categoryType AND c.origin = :origin AND c.destination = :destination";
        TypedQuery<Category> query = entityManager.createQuery(queryStr, Category.class);
        query.setParameter("categoryType", categorType);
        query.setParameter("origin", originObj);
        query.setParameter("destination", destinationObj);
        
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return  null;
        }
    }
    
    public double getCategoryPrice(Type categoryType, String origin, String destinations){
        if(categoryType == null || origin == null || destinations == null){
            throw  new IllegalArgumentException("all fields should provided");
        }
        
        CityService cityService = new CityService(EntityManagerUtil.getEntityManager());

    City originObj = cityService.getCity(origin);
    City destinationObj = cityService.getCity(destinations);

    if (originObj == null || destinationObj == null) {
        // Handle the case where either origin or destination is not found
        return 0;
    }
        
        String queryStr = "SELECT c FROM Category c WHERE c.categoryType = :categoryType AND c.origin = :origin AND c.destination = :destinations";
        
        TypedQuery<Category> query = entityManager.createQuery(queryStr, Category.class);
    query.setParameter("origin", originObj);
    query.setParameter("destinations", destinationObj);
    query.setParameter("categoryType", categoryType);

    try {
        List<Category> categoryTimes = query.getResultList();

        if (categoryTimes.isEmpty()) {
            return 0;
        }

        return categoryTimes.get(0).getCategoryPrice();
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
    }
    
}
