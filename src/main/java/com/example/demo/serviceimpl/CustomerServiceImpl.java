package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo repo;
		
	@Override
	public String addCustomer(Customer customer) {
		return(repo.save(customer));
	}
	
	@Override
	public Customer getCustomer(int id) {		
		return repo.findById(id);
	}
	
	@Override
	public List<Customer> getAllCustomer(){
		return repo.findAll();
	}
	 
	@Override
	public String updateCustomer(Customer customer) {
		return (repo.save(customer));
	}
	
	public String deleteCustomer(int id) {
		return(repo.deleteById(id));
	}
	
}