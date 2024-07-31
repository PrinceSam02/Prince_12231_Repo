package com.example.demo.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductRepoImpl implements ProductRepo{
	@Autowired
	EntityManager em;
	
	@Override
	public List<Integer> fetchIdList() {
		String jpql = "SELECT p.id FROM Product p";
		TypedQuery<Integer> query =em.createQuery(jpql, Integer.class);
		return query.getResultList();
	}

	@Override
	public String save(Product product) {
		if(product!=null) {
		em.persist(product);
		return "Success";
		}
		else {
			return "failure" ;
		}	
	}
	@Override
	public Product findById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		String hql="from Product";
		Query query= em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public String update(Product product) {
		if(product!=null) {
			em.merge(product);
			return "Success";
			}
			else {
				return "failure" ;
			}	
		
	}

	@Override
	public String deleteById(int id) {
		if(id!=0) {
			Product pro = em.find(Product.class, id);
			em.remove(pro);
			return "Deleted";
		}
			else {
				return "deletion Failure";
			}
		}
		
	}
