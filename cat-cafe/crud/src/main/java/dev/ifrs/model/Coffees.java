package dev.ifrs.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Coffees extends PanacheEntity {  //This class extends PanacheEntity, which provides basic CRUD operations
    private String name;
    private String description;
    private double price;
    
   // Constructors, getters, and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Coffees(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Coffees(){
    }
    
    
    
}
