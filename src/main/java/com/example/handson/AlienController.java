package com.example.handson;

import com.example.handson.dao.AlienRepo;
import com.example.handson.model.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/searchaliens")
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


    @RequestMapping("/aliens")
    @ResponseBody
    public String getAliens() {
        return repo.findAll().toString();
    }

    @RequestMapping("/aliens/{aid}")
    @ResponseBody
    public String getAlien(@PathVariable("aid") int aid) {
        return repo.findById(aid).toString();
    }
}