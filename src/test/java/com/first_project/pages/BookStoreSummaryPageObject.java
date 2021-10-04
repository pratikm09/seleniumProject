package com.first_project.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.first_project.testcases.TC_BookStoreSummary;

public class BookStoreSummaryPageObject {
	WebDriver driver;
	Logger logger = LogManager.getLogger(TC_BookStoreSummary.class);
	// Side Panel Locators
	By bookStoreApplication = By.xpath("//div[6]//div[1]//div[2]//*[local-name()='svg']");
    By bookStoreTab = By.xpath("//span[normalize-space()='Book Store']");
	
    By searchBox = By.id("searchBox");
    By userNameOnSummarypage = By.id("userName-value");
    
    By bookRecords = By.xpath("//div[@class=\"rt-tbody\"]/div");
    
    public BookStoreSummaryPageObject(WebDriver driver)
    {
  	  this.driver = driver;
    }
    
    public void clickBookStoreAppTab()
    {
  	  driver.findElement(bookStoreApplication).click();
  	  logger.info("clicked on book store application Tab");
    }
    
    public void clickBookStore()
    {
    	driver.findElement(bookStoreTab).click();
    	logger.info("clicked on book store sub Tab");
    }
    public void getAllBookRecords()
    {
    	List<WebElement> rows = driver.findElements(bookRecords);
    	logger.info("");
    	for(WebElement row: rows)
    	{
    		logger.info("Record##"+row.getText());
    	}
    	logger.info("All rows are displayed..");
    }
}
