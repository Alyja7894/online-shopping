package com.alyja.onlineshopping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alyja.shopping.dao.CategoryDAO;
import com.alyja.shopping.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "Home");
		//passing 
		mv.addObject("categories",categoryDAO.List());
		
		
		mv.addObject("userClickHome", true);/* */
		
		return mv;
	}
	@RequestMapping(value= "/about")
	public ModelAndView about(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "About Us");
		mv.addObject("userClickAbout", true);/* */
		
		return mv;
	}
	@RequestMapping(value= "/contact")
	public ModelAndView contact(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "Contact Us");
		mv.addObject("userClickContact", true);/* */
		
		return mv;
	} 
	
	/* @RequestMapping(value= {"/listProducts"})
	public ModelAndView listProducts(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "listProducts Us");
		mv.addObject("userClicklistProducts", true);
		
		return mv;
	}  */
	/*
	 * Method to load all the products and based on cetegory - 
	 * Metodo que cargará todos los productos y basado en la categoria
	 * 
	 * */
	
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts(){
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", "All Products");
		//passing the list categoryDAO
		mv.addObject("categories",categoryDAO.List());
		
		
		mv.addObject("userClickAllProducts", true);/* */
		
		return mv;
	}
	/* @PathVariable recoge la variable asignada 
	 * 
	 * */
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		
		ModelAndView mv = new ModelAndView("page");
		//categoryDAO to fetch a single category  - Buscamos solo una categoria
				// para estom tenemos que igual el ID DAO
				
				Category category = null;
				
				category = categoryDAO.get(id);
				
		//mv.addObject("greeting", "Welcome to Spring Web MVC");
		
		mv.addObject("tittle", category.getName());
		//passing eh list of categories
		mv.addObject("categories",categoryDAO.List());
		
		//passing eh list of categories
		mv.addObject("category",category);
		
		
		mv.addObject("userClickCategoryProducts", true);/* */
		
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
