package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import com.pageobjectmodel.loginpage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	WebDriver driver;
	
	@Given("Open the Browser")
	public void open_the_browser() {
		 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	}
	   @Given("Go to Application")
	public void go_to_Application() throws Throwable {
		   System.out.println(BaseConfig.getConfig("URL"));
			driver.navigate().to(BaseConfig.getConfig("URL"));
		   
		}
		

	@When("valid user name")
	public void valid_user_name() throws Throwable {

		driver.findElement(loginpage.getUser()).click();
		System.out.println(BaseConfig.getConfig("Username"));
		
		driver.findElement(loginpage.getUser()).sendKeys(BaseConfig.getConfig("Username")); 
	   
	   
	}

	@When("valid password")
	public void valid_password() throws Throwable {
		driver.findElement(loginpage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("Password"));
		driver.findElement(loginpage.getPassword()).sendKeys(BaseConfig.getConfig("Password"));	
		
		
	   
	   
	}



	@Then("Check singout button there or not")
	public void check_singout_button_there_or_not() throws Exception {
		
		SoftAssert sf = new SoftAssert();
	    sf.assertTrue(driver.findElement(loginpage.getLogoutBtn()).isDisplayed());
	    System.out.println("Hellow");
	    sf.assertAll();
	   
	   
	}

	@When("put invalid user name")
	public void put_invalid_user_name() throws Throwable {

		driver.findElement(loginpage.getUser()).click();
		System.out.println(BaseConfig.getConfig("Invalid_User"));
		
		driver.findElement(loginpage.getUser()).sendKeys(BaseConfig.getConfig("Invalid_User")); 
	   
		
	   
	   
	}

	@When("put invalid password")
	public void put_invalid_password() throws Throwable {
		driver.findElement(loginpage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("Invalid_Password"));
		driver.findElement(loginpage.getPassword()).sendKeys(BaseConfig.getConfig("Invalid_Password"));	
		
		
	   
	   
	}

	@When("Click sign in")
	public void click_sign_in() throws Exception {
		//code
		System.out.println("Now click sign in button........................");
		driver.findElement(loginpage.getLogin()).click();
	   
	}

	@When("Accept Alert")
	public void accept_Alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	   
	}

	@Then("Signout button should not visible")
	public void signout_button_should_not_visible() {
		
		
	
		SoftAssert sf = new SoftAssert();
	    sf.assertTrue(!driver.findElement( loginpage.getLogoutBtn()).isDisplayed());
	    System.out.println("Hellow");
	    sf.assertAll();
	   
		
	   
	   
	}


	
	
	
}
