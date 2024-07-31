package com.example.demo.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepoImpl implements CustomerRepo{

	@Autowired
	EntityManager em;
	
	@Override
	public String save(Customer customer) {
		if(customer!=null) {
			em.merge(customer);
			return "Success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public Customer findById(int id) {
		
		return em.find(Customer.class, id);
	}

	@Override
	public List<Customer> findAll() {
		String hql="from Customer";
		Query query= em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public String update(Customer customer) {
		if(customer!=null) {
			em.merge(customer);
			return "Success";
		}
		else {
			return "failure";
		}

		
	}

	@Override
	public String deleteById(int id) {
		if(id!=0) {
		Customer cust = em.find(Customer.class, id);
		em.remove(cust);
		return "Deleted";
	}
		else {
			return "deletion Failure";
		}
	}
}


