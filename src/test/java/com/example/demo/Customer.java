package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Customer {
	private WebDriver driver;
	 
	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
	}
 
	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
	
	@Test
	void ViewCustomertest() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Customer Details")).click();
		driver.findElement(By.linkText("View Customer")).click();	
		}
	
	@Test
	void AddCustomertest1() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Customer Details")).click();
		driver.findElement(By.linkText("View Customer")).click();
		driver.findElement(By.linkText("Add +")).click();
	    driver.findElement(By.name("customername")).click();
	    driver.findElement(By.name("customername")).sendKeys("Senaa");
	    driver.findElement(By.name("address")).click();
	    driver.findElement(By.name("address")).sendKeys("Kovai");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("sena@gmail.com");
	    driver.findElement(By.cssSelector(".form-select")).click();
	    {
	      WebElement dropdown = driver.findElement(By.cssSelector(".form-select"));
	      dropdown.findElement(By.xpath("//option[. = '4']")).click();
	    }
	    driver.findElement(By.cssSelector("center")).click();
	}
	
	@Test
	void AddCustomertest() {
		driver.get("http://localhost:3000/");
	    
	    driver.findElement(By.linkText("Customer Details")).click();
	    driver.findElement(By.linkText("Add Customer")).click();
	    driver.findElement(By.name("customername")).click();
	    driver.findElement(By.name("customername")).sendKeys("Senathipathi");
	    driver.findElement(By.name("address")).click();
	    driver.findElement(By.name("address")).sendKeys("Coimbatore");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	    driver.findElement(By.cssSelector(".form-select")).click();
	    {
	      WebElement dropdown = driver.findElement(By.cssSelector(".form-select"));
	      dropdown.findElement(By.xpath("//option[. = '4']")).click();
	    }
	    driver.findElement(By.cssSelector("center")).click();
	}
	
	@Test
	void UpdateCustomertest() {
		driver.get("http://localhost:3000/");
		driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(1552, 832));
	    driver.findElement(By.linkText("Customer Details")).click();
	    driver.findElement(By.linkText("View Customer")).click();
	    driver.findElement(By.id("value1")).click();
	    driver.findElement(By.name("customername")).click();
	    driver.findElement(By.name("customername")).sendKeys("Prince S");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.cssSelector("form")).click();
	    driver.findElement(By.id("value")).click();
		
	 
	}
	
	@Test
	void DeleteCustomertest() {
		driver.get("http://localhost:3000/");
	    driver.findElement(By.linkText("Customer Details")).click();
	    driver.findElement(By.linkText("View Customer")).click();
		driver.findElement(By.xpath("//*[@id=\"body\"]/div/table/tbody/tr[1]/td[6]/button")).click();
		driver.switchTo().alert().accept();
	}
	
}
