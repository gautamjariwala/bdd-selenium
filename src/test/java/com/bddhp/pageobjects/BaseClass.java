package com.bddhp.pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "src/main/resources/chromedriver.exe"); driver = new ChromeDriver();
		 */
		/*
		 * driver.get(prop.getProperty("url"));
		 * 
		 * 
		 * try { prop = new Properties(); FileInputStream input = new
		 * FileInputStream("src/main/java/test/seleniumeasy/config/config.properties");
		 * prop.load(input);
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

	}
	
	
	public static void initialization() {
		/*String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {*/
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			/*
			 * driver.get(prop.getProperty("url")); } else {
			 * System.setProperty("webdriver.chrome.driver",
			 * "src/main/resources/chromedriver.exe"); driver = new ChromeDriver(); //
			 * driver.get(prop.getProperty("url")); }
			 */

	}

}
