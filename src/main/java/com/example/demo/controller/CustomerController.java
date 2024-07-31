package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/Customer")
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerServiceImpl service;
		
	@PostMapping
	public String insertCustomer(@RequestBody Customer cust)
	{
		String msg="";
		try {
			service.addCustomer(cust);
			msg="Insert Success";
		} 
		catch(Exception e) {	
			msg="Insert Failure";
		}
			return msg;
	}

	@GetMapping("{id}")
	public Customer getCustomerById(@PathVariable("id") int id)
	{
		return service.getCustomer(id);
		}

	@GetMapping("/all")
	public List<Customer> getCustomer()
	{
		return service.getAllCustomer();
		}

	@PutMapping()
	public String updateCustomer(@RequestBody Customer cust)
	{
		String msg="";
	try {
		service.updateCustomer(cust);
		msg="Update Success";
		} 	
			
	catch(Exception e) {
		msg="Updation Failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteCustomerById(@PathVariable("id") int id)
	{
		String msg="";
		try {
			service.deleteCustomer(id);
			msg="Deletion Success";
		} 
		catch(Exception e) {
			msg="Deletion Failure";
		}	
		return msg;
	}	
	
}
