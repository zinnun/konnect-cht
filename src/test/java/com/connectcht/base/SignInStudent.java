package com.connectcht.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInStudent {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://cht.konnect.csttestserver.com/student/login");
	
	Thread.sleep(5000);
	
	WebElement signIn= driver.findElement(By.xpath("//button[@id='nav-home-tab']"));
	WebElement loginPhoneNo= driver.findElement(By.xpath("//input[@name='login_phone_number']"));
	WebElement loginPass= driver.findElement(By.xpath("//input[@name='login_password']"));
	
	WebElement signInButton= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]"));
	
	
	signIn.click();
	Thread.sleep(2000);
	loginPhoneNo.sendKeys("01936546321");
	loginPass.sendKeys("654321");

	signInButton.click();
	
	driver.quit();
	}
}
