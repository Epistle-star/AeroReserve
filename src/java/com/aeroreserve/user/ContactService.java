/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.user;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Epistle
 */
public class ContactService {
    private final EntityManager entityManager;

    public ContactService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public void addContact(ContactInfo contact){
        if(contact.getFullName().isEmpty() || contact.getFullName() == null)
            throw new IllegalArgumentException("Full name cannot be blank");
        if(contact.getEmail().isEmpty() || contact.getEmail() == null)
            throw new IllegalArgumentException("Email cannot be blank");
        if(contact.getPhone().isEmpty() || contact.getPhone() == null)
           throw new IllegalArgumentException("Phone Number cannot be Blank");
        
        entityManager.getTransaction().begin();
        entityManager.persist(contact);
        entityManager.getTransaction().commit();
    }
    
    public ContactInfo getContact(String fullName){
        if(fullName == null)
            throw new IllegalArgumentException("Contact Does not exist");
        
        String queryStr = "SELECT u FROM Contact_info u WHERE u.fullName = :username";
		
		TypedQuery<ContactInfo> query = entityManager.createQuery(queryStr, ContactInfo.class);
		query.setParameter("username", fullName);
		
		try
		{
			return query.getSingleResult();
		}
		catch(NoResultException ex)
		{
			return null;
		}
    }
}
