package com.example.handson.dao;

import com.example.handson.model.Alien;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
    
}
