	package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_tbl")
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="productname")
	private String productname;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="price")
	private int price;
	public Product() {
		super();
	}
	public Product(int id, String productname, String category, String description, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.category = category;
		this.description = description;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", category=" + category + ", description="
				+ description + ", price=" + price + "]";
	}
	
}