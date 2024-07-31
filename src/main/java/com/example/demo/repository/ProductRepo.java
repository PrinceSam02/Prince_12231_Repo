package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductRepo {
	List<Integer>fetchIdList();

	Product findById(int id);

	String update(Product product);

	String deleteById(int id);

	String save(Product product);

	List<Product> findAll();
}
