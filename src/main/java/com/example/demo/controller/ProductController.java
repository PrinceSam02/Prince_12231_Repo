package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.serviceimpl.ProductServiceImpl;

@RestController
@RequestMapping("/Product")
@CrossOrigin("*")
public class ProductController {

	ProductServiceImpl service;
	
	public ProductController(ProductServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertProduct(@RequestBody Product pro)
	{
		String msg="";
		try {
			service.addProduct(pro);
			msg="Insertion Success";
		} 
		catch(Exception e) {
			msg="Insertion Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Product getProductById(@PathVariable("id") int id)
	{
	return service.getProduct(id);
	}

	@GetMapping("/all")
	public List<Product> getProduct()
	{
	return service.getAllProduct();
	}

	@PutMapping()
	public String updateProduct(@RequestBody Product pro)
	{
		String msg="";
		try {
			service.updateProduct(pro);
			msg="Updation Success";
		} 	
		catch(Exception e) {
			msg="Updation Failure";
		}
			return msg;
		}

	@DeleteMapping("{id}")
	public String deleteProductById(@PathVariable("id") int id)
	{
		String msg="";
		try {
			service.deleteProduct(id);
			msg="Deletion Success";
		} 
		catch(Exception e) {
			msg="Deletion Failure";
		}	
			return msg;
		}	
	
	@GetMapping("/getproductid")
	public List<Integer> getProductIds() {
		return service.getProductIds();
	}

}

