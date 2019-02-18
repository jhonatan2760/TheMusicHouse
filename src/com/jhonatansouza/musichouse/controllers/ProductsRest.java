package com.jhonatansouza.musichouse.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.jhonatansouza.model.Product;

@RestController
public class ProductsRest {

	@RequestMapping(value = "/rest/products", method = RequestMethod.GET, 
			produces = "application/json")
	public ResponseEntity<String> retrieveProducts(){
		
		Product pd = new Product();
		pd.setId(2L);
		pd.setBand("Queen");
		pd.setTitle("We Will Rock you");
		pd.setYear("1982");
		
		Gson g = new Gson();
		
		return new ResponseEntity<String>(g.toJson(pd), HttpStatus.OK);
	}
}
