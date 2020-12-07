package com.row_star.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.row_star.demo.dao.homeRepo;
import com.row_star.demo.model.Alien;

@Controller
public class homeController {

	@Autowired
	homeRepo rep;

	@RequestMapping("/")
	public String view() {
	  System.out.println("I am in controller right now");
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		 rep.save(alien);
		 return "home.jsp";
	}
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(@RequestParam("aid")int id) {
		rep.deleteById(id);
		ModelAndView mv = new ModelAndView("displayAllAlien");
		return mv;
	}	
	@RequestMapping("/editAlien")
	public ModelAndView editAlien(@RequestParam("aid")int id) {
		ModelAndView mv = new ModelAndView();
		Alien alien = rep.findById(id).orElse(new Alien());
		mv.setViewName("edit.jsp");
		mv.addObject("AlienData",alien);
		return mv;
	}
	@RequestMapping("/searchAlien")
	public ModelAndView searchAlien(@RequestParam("aid") int id) {
		ModelAndView mv = new ModelAndView();
	    Alien alien = rep.findById(id).get();
	    System.out.println(alien.getAid());
	    mv.addObject("AlienData",alien);
		mv.setViewName("ShowAliens.jsp");
		return mv;
	}
	@RequestMapping("/displayAllAlien")
	public ModelAndView searchAllAlien() {
		ModelAndView mv = new ModelAndView();
		List<Alien> AlienData = (List<Alien>)rep.findAll();
		mv.addObject("AlienData",AlienData);
		mv.setViewName("ShowAllAlien.jsp");
		return mv;
	}

	
}
