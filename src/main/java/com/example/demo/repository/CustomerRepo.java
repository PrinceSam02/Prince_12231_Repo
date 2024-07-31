package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerRepo {

	Customer findById(int id);

	String save(Customer customer);

	String update(Customer customer);

	String deleteById(int id);

	List<Customer> findAll();

}
