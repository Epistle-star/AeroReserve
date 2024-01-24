/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Epistle
 */
public class EntityManagerUtil {
    private static final EntityManager entityManager = 
			Persistence
				.createEntityManagerFactory("AeroReservePU")
				.createEntityManager();

	public static EntityManager getEntityManager()
	{
		return entityManager;
	}
}
