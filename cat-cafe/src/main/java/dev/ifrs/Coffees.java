package dev.ifrs;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Coffees extends PanacheEntity {
    private String name;
    private String description;
    private double price;
    //This class extends PanacheEntity, which provides basic CRUD operations
    // Constructors, getters, and setters
    // ...
    
}
