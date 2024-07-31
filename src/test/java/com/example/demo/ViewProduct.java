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

class ViewProduct {

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
	void ViewProducttest() {	
		driver.get("http://localhost:3000/");
	    driver.findElement(By.linkText("GET STARTED")).click();
	}
	
	@Test
	void ViewProducttest1() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Product Details")).click();
	    driver.findElement(By.linkText("View Product")).click();	
	}
	
	@Test
	void AddProducttest() {
		driver.get("http://localhost:3000/");
	    driver.findElement(By.linkText("GET STARTED")).click();
	    driver.findElement(By.linkText("Add +")).click();
    driver.findElement(By.name("productname")).click();
    driver.findElement(By.name("productname")).click();
    {
      WebElement element = driver.findElement(By.name("productname"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("productname")).sendKeys("key");
    driver.findElement(By.name("category")).click();
    driver.findElement(By.name("category")).sendKeys("key chain");
//    driver.findElement(By.name("description")).click();
//    driver.findElement(By.name("description")).sendKeys("White colors");
    driver.findElement(By.cssSelector("div:nth-child(4) > .form-control")).click();
    driver.findElement(By.cssSelector("div:nth-child(4) > .form-control")).sendKeys("white color");
    driver.findElement(By.name("price")).click();
    driver.findElement(By.name("price")).sendKeys("1200");
    driver.findElement(By.id("value")).click();
	}
	
	@Test
	void AddProducttest1() {
		driver.get("http://localhost:3000/");
		driver.findElement(By.linkText("Product Details")).click();
	    driver.findElement(By.linkText("Add Product")).click();
	    driver.findElement(By.name("productname")).click();
	    driver.findElement(By.name("productname")).click();
	    {
	      WebElement element = driver.findElement(By.name("productname"));
	      Actions builder = new Actions(driver);
	      builder.doubleClick(element).perform();
	    }
	    driver.findElement(By.name("productname")).sendKeys("Pot");
	    driver.findElement(By.name("category")).click();
	    driver.findElement(By.name("category")).sendKeys("pottery");
//	    driver.findElement(By.name("description")).click();
//	    driver.findElement(By.name("description")).sendKeys("White colors");
	    driver.findElement(By.cssSelector("div:nth-child(4) > .form-control")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .form-control")).sendKeys("Brown color");
	    driver.findElement(By.name("price")).click();
	    driver.findElement(By.name("price")).sendKeys("100");
	    driver.findElement(By.id("value")).click();
	}

	@Test
	void UpdateProductTest() {
		driver.get("http://localhost:3000/");

	    driver.findElement(By.linkText("Product Details")).click();
	    driver.findElement(By.linkText("View Product")).click();
	    driver.findElement(By.xpath("//*[@id=\"body\"]/div/table/tbody/tr[1]/td[6]/a")).click();
	    driver.findElement(By.name("productname")).click();
	    driver.findElement(By.name("productname")).sendKeys("keys ");
	    driver.findElement(By.name("category")).click();
	    driver.findElement(By.name("category")).sendKeys("key chains");
	    driver.findElement(By.name("price")).click();
	    driver.findElement(By.name("price")).sendKeys("1200");
	    driver.findElement(By.id("value")).click();
	}
	
	@Test
	void DeleteProductTest() {
		driver.get("http://localhost:3000/");
	    driver.findElement(By.linkText("Product Details")).click();
	    driver.findElement(By.linkText("View Product")).click();
		driver.findElement(By.xpath("//*[@id=\"body\"]/div/table/tbody/tr[1]/td[6]/button")).click();
		driver.switchTo().alert().accept();
	}
}
