package com.jhonatansouza.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void save() {
		
	}
	
	
}
