package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {

	public String addCustomer(Customer customer);
	public Customer getCustomer(int id);
	public List<Customer> getAllCustomer();
	public String updateCustomer(Customer customer);
	public String deleteCustomer(int id);
}
