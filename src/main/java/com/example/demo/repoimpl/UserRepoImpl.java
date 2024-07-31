package com.example.demo.repoimpl;

import org.hibernate.NonUniqueResultException;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepo {
 
	EntityManager em;
 
	public UserRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}
 
	@Override
	public User save(User user) {
		return em.merge(user);
 
	}
 
	public User findByUserName(String userName) {
		String hql = "FROM User u WHERE u.userName = :userName";
		TypedQuery<User> query = em.createQuery(hql, User.class);
		query.setParameter("userName", userName);
		try {
			return query.getSingleResult();
		} catch (NoResultException | NonUniqueResultException e) {
			return null;
		}
	}
 
}