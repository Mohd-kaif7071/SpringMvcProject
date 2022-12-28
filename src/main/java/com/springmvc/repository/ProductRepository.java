package com.springmvc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.entity.Product;

@Component
public class ProductRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product){
		hibernateTemplate.save(product);
		
	}
	
	public List<Product> getProducts(){
		
		List<Product> all = hibernateTemplate.loadAll(Product.class);
		return all;
	}
	
	@Transactional
	public void deleteProduct(int id){
		Product product = hibernateTemplate.get(Product.class, id);
		  this.hibernateTemplate.delete(product);
	}
	
	public Product getProduct(int id){
		return this.hibernateTemplate.get( Product.class,id);
		
	}

}
