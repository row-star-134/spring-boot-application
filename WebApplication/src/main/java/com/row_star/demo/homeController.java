package com.row_star.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String Mname ,HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",Mname);
		mv.setViewName("home");
		return mv;
	}
}
