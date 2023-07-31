package org.stepdefinitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.imageio.spi.RegisterableService;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.cli.Main;
import cucumber.api.java.en.*;

import maven.BaseClass;
import maven.Loginpage;
import maven.LoginpageTest;

public class LoginSteps extends BaseClass  {
	LoginpageTest li;
	@Given("The user should be in facebook login page")
	public void the_user_should_be_in_facebook_login_page() {
		
	launchBrowser("Chrome");
	
		
	   launchurl("https://www.facebook.com/");
	   driver.get("https://www.facebook.com/");
	}
	
	

@When("The user has to fill {string} , {string}")
public void the_user_has_to_fill(String user, String pass) throws InterruptedException {
   Thread.sleep(5000);
  Loginpage l=new Loginpage();
  fillTextBox(l.getTxtUsername().get(0),user );
  fillTextBox(l.getTxtpassword(), pass);
  
}

	@When("The user has to click login button")
	public void the_user_has_to_click_login_button() {
	  // driver.findElement(By.name("login")).click();
	}

	@Then("The user should navigate to invalid page")
	public void the_user_should_navigate_to_invalid_page() {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.quit();
	    
	}
	
	
	@When("The user should click create a page")
	public void the_user_should_click_create_a_page() {
		li= new LoginpageTest();
          btnClick(li.getBtncreate());
		
		}

	@When("The user should fill the boxes")
	public void the_user_should_fill_the_boxes() throws InterruptedException {
		Thread.sleep(5000);
		fillTextBox(li.getFirstname(), "dESIgan");
		fillTextBox(li.getLastname(), "eeigns");
		fillTextBox(li.getEmail(), "desigand57");
		fillTextBox(li.getFillpass(), "Desi@1435");
		
	   
	}

	@Then("The user Should click the signup button")
	public void the_user_Should_click_the_signup_button() {
		li.getSignup().click();
		driver.quit();
		
		
	   
	}

	
}
	
	