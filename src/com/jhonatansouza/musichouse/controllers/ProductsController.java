package com.jhonatansouza.musichouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhonatansouza.dto.ProductDTO;

@Controller
public class ProductsController {

	@RequestMapping("products/add")
	public String form() {
		return "products/form";
	}
	
	@RequestMapping(method= {RequestMethod.POST}, name = "products/insert")
	public String save(ProductDTO product) {
		
		System.out.println(product);
		
		return "helpers/ok";
	}
	
	
	public ModelAndView receiver() {
		
		ModelAndView md = new ModelAndView();
		md.addObject("nome", "");
		
		return md;
	}
}
