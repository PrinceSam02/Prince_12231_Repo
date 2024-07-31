package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	public String addProduct(Product product);
	public Product getProduct(int id);
	public List<Product> getAllProduct();
	public String updateProduct(Product product);
	public String deleteProduct(int id);
	public List<Integer> getProductIds();
	
}
