package org.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import maven.BaseClass;
import maven.Loginpage;

public class loginSteps2 extends BaseClass {
	Loginpage l;
	
	@When("The user has to fill  username and password")
	public void the_user_has_to_fill_username_and_password(io.cucumber.datatable.DataTable data) {
	    launchBrowser("Chrome");
	    launchurl("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		List<Map<String, String>> list = data.asMaps();
		    Map<String, String> mp = list.get(2);
		    String user = mp.get("username");
		    System.out.println(user);
		      String pass = mp.get("password");
		      System.out.println(pass);
		       
		        WebElement name = driver.findElement(By.id("email"));
		              name.sendKeys(list.get(2).get("username"));
		            WebElement mail = driver.findElement(By.id("pass"));
		                mail.sendKeys(list.get(2).get("password"));
		      
	} 

	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() throws InterruptedException {
		 WebElement btnlogin= driver.findElement(By.name("login"));
		 btnlogin.click();
		
	   
	}

	@Then("The user should navigate to invalid pages")
	public void the_user_should_navigate_to_invalid_pages() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	  
	}
	

}
