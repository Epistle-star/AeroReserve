/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.categories;

import com.aeroreserve.destinations.CityService;
import com.aeroreserve.util.EntityManagerUtil;

/**
 *
 * @author Epistle
 */
public class CategoryApp {
    public static void main(String[] args) {
        CityService destination = new CityService(EntityManagerUtil.getEntityManager());
        
        Category category1 = new Category(Type.ECONOMY, 95000, destination.getCity("Abuja"), destination.getCity("Lagos"));
        Category category2 = new Category(Type.ECONOMY, 85000, destination.getCity("Lagos"), destination.getCity("Abuja"));
        Category category3 = new Category(Type.BUSINESS, 80000, destination.getCity("Lagos"), destination.getCity("Abuja"));
        Category category4 = new Category(Type.BUSINESS, 79000, destination.getCity("Abuja"), destination.getCity("Lagos"));
        Category category5 = new Category(Type.ECONOMY, 65000, destination.getCity("Abuja"), destination.getCity("Rivers"));
        Category category6 = new Category(Type.BUSINESS, 89000, destination.getCity("Abuja"), destination.getCity("Rivers"));        
        Category category7 = new Category(Type.BUSINESS, 72000, destination.getCity("Rivers"), destination.getCity("Abuja"));
        Category category8 = new Category(Type.ECONOMY, 69000, destination.getCity("Rivers"), destination.getCity("Abuja"));
        Category category9 = new Category(Type.BUSINESS, 89000, destination.getCity("Rivers"), destination.getCity("Owerri"));
        Category category10 = new Category(Type.ECONOMY, 82000, destination.getCity("Rivers"), destination.getCity("Owerri"));
        Category category11 = new Category(Type.BUSINESS, 89000, destination.getCity("Abuja"), destination.getCity("Owerri"));
        Category category12 = new Category(Type.ECONOMY, 80000, destination.getCity("Abuja"),destination.getCity("Owerri"));

        
        
        CategoryService categoryService = new CategoryService(EntityManagerUtil.getEntityManager());
        
        categoryService.addCategory(category4);
        categoryService.addCategory(category3);
        categoryService.addCategory(category2);        
        categoryService.addCategory(category1);        
        categoryService.addCategory(category5);
        categoryService.addCategory(category6);
        categoryService.addCategory(category7);
        categoryService.addCategory(category8);
        categoryService.addCategory(category9);        
        categoryService.addCategory(category10);
        categoryService.addCategory(category11);       
        categoryService.addCategory(category12);




//           Category price =  categoryService.getCategoryPrice(Type.ECONOMY, "Rivers", "Lagos");
           
//           System.out.println(price.getCategoryPrice());
            


    }
}
