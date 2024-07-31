package com.example.demo.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;

@SpringBootTest
class CustomerServiceImplTest {
	
	@Autowired
	CustomerServiceImpl csi;

	@Test
	void testAddCustomer() {
		Product product = new Product(0,"gift","blabla", "lalalala",1000);
		Customer cus= new Customer(0,"Prince","ytg","sam@gmail.com",product);
		assertEquals("Success", csi.addCustomer(cus));
	}

	@Test
	void testGetCustomer() {
		assertNotNull(csi.getCustomer(8));
	}

	@Test
	void testGetAllCustomer() {
		assertNotNull(csi.getAllCustomer());
	}

	@Test
	void testUpdateCustomer() {
		Product product = new Product(1,"gift","bla bla", "lalalala",1000);
		Customer cus= new Customer(1,"Prince","Arappalayam","sam@gmail.com",product);
		assertEquals("Success", csi.updateCustomer(cus));
	}

	@Test
	void testDeleteCustomer() {
		assertEquals("Deleted", csi.deleteCustomer(6));
	}

}
