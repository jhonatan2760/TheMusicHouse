package com.jhonatansouza.musichouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhonatansouza.daos.ProductDAO;
import com.jhonatansouza.dto.ProductDTO;

@Controller
public class ProductsController {

	@Autowired
	private ProductDAO dao;
	
	@RequestMapping("products/add")
	public String form() {
		return "products/form";
	}
	
	@RequestMapping(method= {RequestMethod.POST}, name = "products/insert")
	public String save(ProductDTO product) {
		
		System.out.println(product);
		this.dao.save();
		
		return "helpers/ok";
	}
	
	public ModelAndView receiver() {
		
		ModelAndView md = new ModelAndView();
		md.addObject("nome", "");
		
		return md;
	}
}
