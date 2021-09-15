package com.example.handson.dao;

import java.util.List;

import com.example.handson.model.Alien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByAname(String aname);

    List<Alien> findByAidGreaterThan(int aid);

    @Query("from Alien where aname=?1 order by aid")
    List<Alien> findByAnameSorted(String aname);
}
