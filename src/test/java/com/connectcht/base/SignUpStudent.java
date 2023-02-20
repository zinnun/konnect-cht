package com.connectcht.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpStudent{

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://cht.konnect.csttestserver.com/student/login");
	
	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
	WebElement phoneNo= driver.findElement(By.xpath("//input[@name='phone_number']"));
	WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
	WebElement cPass= driver.findElement(By.xpath("//input[@name='password_confirmation']"));
	WebElement signUpButton= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]"));
	
	Thread.sleep(5000);
	name.sendKeys("John");
	phoneNo.sendKeys("01936546321");
	pass.sendKeys("654321");
	cPass.sendKeys("654321");
	signUpButton.click();
	
	}
}
