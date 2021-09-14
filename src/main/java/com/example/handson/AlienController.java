package com.example.handson;

import com.example.handson.dao.AlienRepo;
import com.example.handson.model.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
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

    @RequestMapping("/aliens")
    public ModelAndView viewAlien(Alien alien) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("alien");        
        return mv;
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {
        repo.save(alien);
        return "home";
    }


    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid) {
        ModelAndView mv = new ModelAndView();
        Alien alien = repo.findById(aid).orElse(new Alien());
        mv.addObject(alien);
        mv.setViewName("showalien");;
        return mv;
    }
}