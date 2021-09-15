package com.example.handson;

import java.util.Optional;

import com.example.handson.dao.AlienRepo;
import com.example.handson.model.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;
    
    @RequestMapping("/")
    public ModelAndView home(Alien alien) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");        
        return mv;
    }

    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable("aid") int aid) {
        Alien a = repo.getById(aid);
        repo.delete(a);
        return "deleted";
    }

    @PutMapping(path="/alien", consumes = {"application/json"})
    public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }

    @PostMapping(path="/alien", consumes = {"application/json"})
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }


    @GetMapping("/aliens")
    public List<Alien> getAliens() {
        return repo.findAll();
    }

    @RequestMapping("/aliens/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
        return repo.findById(aid);
    }
}