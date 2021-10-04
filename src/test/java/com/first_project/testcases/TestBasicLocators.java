package com.first_project.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestBasicLocators {

	public static void main(String[] args)throws InterruptedException,NoSuchElementException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().window().setSize(new Dimension(200,500));
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/text-box");
		 String url1 = driver.getCurrentUrl();
		 System.out.println("URL = "+url1);
		// driver.findElement(By.id("userName")).sendKeys("Pratik More");
		 driver.findElement(By.xpath("//div[@class=\"col-md-9 col-sm-12\"]/input[@id=\"userEmail\"]")).sendKeys("Pratik@gmail.com");
		 driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("pune");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
         driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Kolhapur");
	     driver.findElement(By.xpath("//button[@id='submit']")).click();
	     Thread.sleep(4000);
	    driver.close();
	}

}
