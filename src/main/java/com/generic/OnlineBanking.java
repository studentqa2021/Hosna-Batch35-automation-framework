package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class OnlineBanking {
public static void getLongin() throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/ahmed/Desktop/Online%20banking_dev.html");
	//put user
	driver.findElement(By.xpath("//*[@id='username']")).click();
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch35");
	//put pass
	driver.findElement(By.xpath("//*[@id='password']")).click();
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
	//click login
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
	
	
}

