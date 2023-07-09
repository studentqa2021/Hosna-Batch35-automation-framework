package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.loginpage;
import com.util.BaseConfig;

public class Login{

	public void getLogin() throws Throwable  {
	
		// open the browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// go to the URL
				driver.get(BaseConfig.getConfig("URL"));
		
		driver.navigate().to(BaseConfig.getConfig("URL"));
		// go to the URL
		driver.get(BaseConfig.getConfig("URL"));
        //put user
		driver.findElement(loginpage.getUser()).click();
		System.out.println(BaseConfig.getConfig("User"));
		//first I pass my user, password, url from my baseconfig for this I use class name. mathod name from dev propertices
		driver.findElement(loginpage.getUser()).sendKeys(BaseConfig.getConfig("User"));
		//put password,
		driver.findElement(loginpage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("Password"));
		driver.findElement(loginpage.getPassword()).sendKeys(BaseConfig.getConfig("Password"));
		//click login
		driver.findElement(loginpage.getLogin()).click();
		  //Hard Assert
	    //Assert.assertTrue(driver.findElement(LoginPage.logoutBtn).isDisplayed());
	    //System.out.println("Hi");
	    //Soft Assert
	    SoftAssert sf = new SoftAssert();
	    sf.assertTrue(driver.findElement(loginpage.getLogoutBtn()).isDisplayed());
	    System.out.println("Hellow");
	    sf.assertAll();
	    
		//Close Browser
	   // driver.quit();
		
		
		
		
		
		
		
	}

}
