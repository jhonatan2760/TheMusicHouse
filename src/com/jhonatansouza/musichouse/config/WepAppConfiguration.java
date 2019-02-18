package com.jhonatansouza.musichouse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jhonatansouza.daos.ProductDAO;
import com.jhonatansouza.musichouse.controllers.HomeController;
import com.jhonatansouza.musichouse.controllers.ProductsRest;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, ProductDAO.class} )
public class WepAppConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		
		res.setPrefix("/WEB-INF/views/");
		res.setSuffix(".jsp");
		
		return res;
	}
}
