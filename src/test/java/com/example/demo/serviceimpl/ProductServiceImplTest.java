package com.example.demo.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
@SpringBootTest
class ProductServiceImplTest {
	@Autowired
	ProductServiceImpl psi;
	@Test
	void testAddProduct() {
		Product pro= new Product(0,"gift","category","description",1000);
		assertEquals("Success", psi.addProduct(pro));
	}

	@Test
	void testGetProduct() {
		assertNotNull(psi.getProduct(2));
	}

	@Test
	void testGetAllProduct() {
		assertNotNull(psi.getAllProduct());
	}

	@Test
	void testUpdateProduct() {
		Product pro= new Product(0,"gift","bla bla bla","something",1000);
		assertEquals("Success", psi.updateProduct(pro));
	}

	@Test
	void testDeleteProduct() {
		assertEquals("Deleted", psi.deleteProduct(8));
	}

	@Test
	void testGetProductIds() {
		assertNotNull(psi.getProductIds());
	}

}



