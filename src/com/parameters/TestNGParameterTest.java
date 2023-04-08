package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterTest {

WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url","browser"})
	public void setUP(String url, String browser )
	{
		if (browser.equals("chrome"))
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
		else {
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
			 }
		driver.get(url);
	}
	
	@Test
	@Parameters({"emailId"})
	public void login(String emailId) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}
	
	@AfterMethod
	public void logoff() {
		driver.close();
	}
}
