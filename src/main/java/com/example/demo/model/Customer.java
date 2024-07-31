package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_tbl")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="customername")
	private String customername;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@ManyToOne(cascade = CascadeType.MERGE,targetEntity = Product.class)
	@JoinColumn
	private Product product;
	public Customer() {
		super();
	}
	public Customer(int id, String customername, String address, String email, Product product) {
		super();
		this.id = id;
		this.customername = customername;
		this.address = address;
		this.email = email;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customername=" + customername + ", address=" + address + ", email=" + email
				+ ", product=" + product + "]";
	}
	

}
