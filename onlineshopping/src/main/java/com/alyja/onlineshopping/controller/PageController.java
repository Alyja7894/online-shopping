package com.alyja.onlineshopping.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "Home");
		mv.addObject("userClickHome", true);/* */
		
		return mv;
	}
	@RequestMapping(value= {"/about"})
	public ModelAndView about(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "About Us");
		mv.addObject("userClickAbout", true);/* */
		
		return mv;
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "Contact Us");
		mv.addObject("userClickContact", true);/* */
		
		return mv;
	} 
	
	@RequestMapping(value= {"/listProducts"})
	public ModelAndView listProducts(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "listProducts Us");
		mv.addObject("userClicklistProducts", true);/* */
		
		return mv;
	} 
	
	//test?greeting=Welcome%20Albert -> "/onlineshopping says- Welcome Albert"
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting",required = false)String greeting) {
		
		if (greeting==null) {
			greeting = "Hello there";
		}
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}*/
	
	//http://localhost:8089/onlineshopping/test/Hola   -> /onlineshopping says- Hola mundo
	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting")String greeting) {
		
		if (greeting==null) {
			greeting = "Hello there";
		}
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}*/
}
