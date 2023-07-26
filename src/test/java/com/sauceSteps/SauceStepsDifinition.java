package com.sauceSteps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SauceStepsDifinition {
	
	
	
WebDriver driver;
	
	@Given("I will open ChromeDriver")
	public void i_will_open_chrome_driver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(10000));
	   
	}

	
//	public void i_will_go_to_url() {
		
//		driver.get("https://www.saucedemo.com/v1/");
		
		
	    
//	}

	@When("I will write username {string}")
	public void i_will_write_username(String string) {
	
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
	    userName.sendKeys("string");
	}

	@When("I will write password {string}")
	public void i_will_write_password(String pass ) {
		WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
	    passwordInput.sendKeys("pass");
	}
	  
	

	@When("I will click login button")
	public void i_will_click_login_button() {
		WebElement logInbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		logInbutton.click();
	   
	}

	@When("I will be redirected to the page reads products")
	public void i_will_be_redirected_to_the_page_reads_products() {
		
		WebElement pageElement =	driver.findElement(By.xpath("//span[@class='title']"));
		String pageName = pageElement.getText();
		String givenName = "Products";
		
		
	  
	}
	@Then("i will refresh the page")
	public void i_will_refresh_the_page() {
	    driver.navigate().refresh();
	
		
	}
	@Then("I will close Browser")
	public void i_will_close_browser() {
	    driver.close();
	}
	@After
	public void closeDriver () {
		driver.quit();
	}

}
