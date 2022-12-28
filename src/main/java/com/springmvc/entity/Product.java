package com.springmvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.protobuf.Method;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int id;
	private String productName;
	private String brand;
	private String description;
	private String price;
	public Product(int id, String productName, String brand, String description, String price) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.description = description;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", brand=" + brand + ", description="
				+ description + ", price=" + price + "]";
	}
	
	
	

}
