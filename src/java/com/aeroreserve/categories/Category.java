/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.categories;

import com.aeroreserve.destinations.City;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Epistle
 */
@Entity
@Table(name = "categories")
public class Category implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Type categoryType;
    
    @Column(nullable = false)
    private double categoryPrice;
    
    @ManyToOne
    @JoinColumn(name = "origin", referencedColumnName = "id")
    private City origin;
    
    @ManyToOne
    @JoinColumn(name = "destination", referencedColumnName = "id")
    private City destination;

    public Category() {
    }

    public Category(Type categoryType, double categoryPrice, City origin, City destination) {
        this.categoryType = categoryType;
        this.categoryPrice = categoryPrice;
        this.origin = origin;
        this.destination = destination;
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Type categoryType) {
        this.categoryType = categoryType;
    }

    public double getCategoryPrice() {
        return categoryPrice;
    }

    public void setCategoryPrice(double categoryPrice) {
        this.categoryPrice = categoryPrice;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Categories{" + "id=" + id + ", categoryType=" + categoryType + ", categoryPrice=" + categoryPrice + ", destinationid=" + destination + '}';
    }
}
