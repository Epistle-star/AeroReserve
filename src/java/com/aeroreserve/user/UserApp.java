/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.user;

import com.aeroreserve.util.EntityManagerUtil;

/**
 *
 * @author Epistle
 */
public class UserApp {
    
    public static void main(String[] args) {
//        User user1 = new User("John Doe", "Doe", "john123@example.com", "secret");        
        User user2 = new User("Jane Doe", "Jane", "jane234@example.com", "secret");
        ContactInfo contact = new ContactInfo("John Doe", "john123@example.com", "09027815857");

        
//        ContactInfo contact1 = new ContactInfo("John Doe", "john@example.com", "08038869833");
		
	UserService userService = 
				new UserService(EntityManagerUtil.getEntityManager());
        
        ContactService contactService = new ContactService(EntityManagerUtil.getEntityManager());
		
        contactService.addContact(contact);
                
                
    }
    
    
}
