package com.example.f1_api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Car car;

    @ManyToMany(mappedBy = "drivers")
    private List<Race> races;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }

    public List<Race> getRaces() { return races; }
    public void setRaces(List<Race> races) { this.races = races; }
}
