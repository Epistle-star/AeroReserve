/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.user;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Epistle
 */
public class UserService {
    
	private final EntityManager entityManager;

    public UserService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    User user = new User();
    
//     String salt;
     String hashedPassword;
//        
    public void addUser(User user)
    {
        if(user.getFullName().isEmpty() || user.getFullName() == null)
            throw new IllegalArgumentException("Full name cannot be blank");
        if(user.getPassword().isEmpty() || user.getPassword()== null)
            throw new IllegalArgumentException("Password  cannot be blank");
        if(user.getEmail().isEmpty() || user.getEmail()== null)
            throw new IllegalArgumentException("Email  cannot be blank");
        if(user.getUsername().isEmpty() || user.getUsername()== null)
            throw new IllegalArgumentException("Username cannot be blank");
        
        if(getUser(user.getUsername()) != null)
		{
			String message = String.format(
					"User with username (%s) already exists", user.getUsername());
			throw new IllegalArgumentException(message);
		}
        
        
         hashedPassword = hashPassword(user.getPassword());
        
        user.setPassword(hashedPassword);
        

        entityManager.getTransaction().begin();
	entityManager.persist(user);
	entityManager.getTransaction().commit();
    }
    
    public User getUser(String username)
	{
		String queryStr = "SELECT u FROM User u WHERE u.username = :username";
		
		TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
		query.setParameter("username", username);
		
		try
		{
			return query.getSingleResult();
		}
		catch(NoResultException ex)
		{
			return null;
		}
	}
    
    
    public void updateUser(int userId, User newUser)
	{
		// Check if user with id exists
		User existingUser = entityManager.find(User.class, userId);
		
		if(existingUser == null)
		{
			String message = String.format(
					"User with id (%d) does not exist", userId);
			throw new IllegalArgumentException(message);
		}
		
		// Ensure that username and password are not blank
		if(newUser.getUsername() == null || newUser.getUsername().isEmpty())
			throw new IllegalArgumentException("Username cannot be blank");
			
		if(newUser.getPassword() == null || newUser.getPassword().isEmpty())
			throw new IllegalArgumentException("Password cannot be blank");
		
		// Update the username and password fields
		existingUser.setUsername(newUser.getUsername());
		// password hashing here
		existingUser.setPassword(newUser.getPassword());
		
		// Save the changes to the database
		entityManager.getTransaction().begin();
		entityManager.persist(existingUser);
		entityManager.getTransaction().commit();
	}
	
	public void deleteUser(int userId)
	{
		// Check if user with id exists
		User user = entityManager.find(User.class, userId);
		
		if(user == null)
		{
			String message = String.format(
					"User with id (%d) does not exist", userId);
			throw new IllegalArgumentException(message);
		}
		
		entityManager.getTransaction().begin();
		entityManager.remove(user);
		entityManager.getTransaction().commit();
	}
        
        
        public static String hashPassword(String plainPassword) {
            return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        }
         
        public boolean verifyPassword(String username, String enteredPassword) {
    User user = getUser(username);

    // Check if a user with the given username exists
    if (user != null) {
        // Retrieve the hashed password from the user entity
        String storedHashedPassword = user.getPassword();

        // Use BCrypt to check if the entered password matches the stored hashed password
        return BCrypt.checkpw(enteredPassword, storedHashedPassword);
    }

    // If no user with the given username is found
    return false;
}
        
         
          
        

   
}
