package com.bddhp.testdf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bddhp.pageobjects.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrpHpTest_StepDef {
	//BaseClass bs;
	WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	String str;
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
				driver.get("https://s1.demo.opensourcecms.com/wordpress/");
	   
	}

	@When("I scroll down")
	public void i_scroll_down() {
		driver.manage().window().maximize();
		//str = driver.findElement(By.cssSelector("#panel2 > div > div > header > h2")).getText();
		//System.out.println("Link name is " + str);
	   
	}

	/*
	 * @Then("I see {} link in footer") public void
	 * i_see_About_link_in_footer(String linkName) { assertEquals(linkName, str,
	 * "Notes link is not found"); driver.quit();
	 * 
	 * }
	 */
	//I see <link name> link in footer
	/*
	 * @Then("I see {string} link in footer") public void
	 * i_see_About_link_in_footer(String linkName) { assertEquals(linkName, str,
	 * "Notes link is not found"); driver.quit();
	 */
		
	/*
	 * @Then("I see link in footer") public void
	 * i_see_About_link_in_footer(DataTable dt) { List<String> list =
	 * dt.asList(String.class); System.out.println("List first word " +
	 * list.get(0)); System.out.println("List Second word " + list.get(1));
	 * System.out.println("List Third word " + list.get(2));
	 * //assertEquals(linkName, str, "Notes link is not found"); driver.quit();
	 * 
	 * }
	 */
	
	@Then("I see {} link in footer")
	public void i_see_About_link_in_footer(String linkName) 
	{
		System.out.println(linkName);
	driver.quit();
	}

}
