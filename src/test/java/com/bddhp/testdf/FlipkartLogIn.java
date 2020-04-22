package com.bddhp.testdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bddhp.pageobjects.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLogIn extends BaseClass{
	
	
	WebDriver driver;
	
	
	@Given("I am on Flipkart Homepage")
	public void i_am_on_Flipkart_Homepage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    
	}

	@When("I click on LOGIN button")
	public void i_click_on_LOGIN_button() {
		driver.findElement(By.cssSelector("._3Ep39l")).click();
	    
	}

	@When("Enter username and password and click log in")
	public void enter_username_and_password_and_click_log_in() {
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > div > div > div.Km0IJL.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("gautamjariwala1@gmail.com");
	    
	}

	@Then("I am logged in")
	public void i_am_logged_in() {
	   
	}
	
	
}
