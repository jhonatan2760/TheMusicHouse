package com.jhonatansouza.musichouse.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class JPAConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean fb = new LocalContainerEntityManagerFactoryBean();
			
		JpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
		fb.setJpaVendorAdapter(vendor);
	
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/houseofmusic");
		dataSource.setUsername("postgres");
		dataSource.setPassword("root");
		dataSource.setDriverClassName("org.postgresql.Driver");
		
		fb.setDataSource(dataSource);
		
		Properties props = new Properties();
		props.setProperty("dialect", "org.hibernate.dialect.postgresqldialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl", "update");
		
		fb.setJpaProperties(props);
		
		fb.setPackagesToScan("com.jhonatansouza.model");
		
		return fb;
	}
	
}
