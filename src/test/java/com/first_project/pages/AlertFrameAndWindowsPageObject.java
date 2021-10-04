package com.first_project.pages;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.first_project.testcases.TC_AlertFrameAndWindows;

public class AlertFrameAndWindowsPageObject {
	WebDriver driver;
	Logger logger = LogManager.getLogger(TC_AlertFrameAndWindows.class);
//	Random random = new Random();
	WebDriverWait wait;
	
	
	// locators for AlertFrameWindows Tab
	By alertFrameAndWindows = By.xpath("//div[3]//div[1]//div[2]//*[local-name()='svg']");
	
	//Locators for Browser-Windows
	By browserWindowSubTab = By.xpath("//span[normalize-space()='Browser Windows']");
	By newTab = By.id("tabButton");
	By newTabText = By.xpath("//h1[normalize-space()='This is a sample page']");
	By newWindow = By.id("windowButton");
	By newWindowMessage = By.id("messageWindowButton");
	
	//Locators for Alert Section
	By alertTab = By.xpath("//span[normalize-space()='Alerts']");
	By clickMePromtButton = By.id("promtButton");
	
	//Locators for Frame Section
	By frameTab = By.xpath("//span[normalize-space()='Frames']");
	By textInFrame2 = By.xpath("//h1[normalize-space()='This is a sample page']");
	
	public AlertFrameAndWindowsPageObject(WebDriver driver)
	{
		this.driver = driver;		
		wait = new WebDriverWait(this.driver,8);
	}
	
	public void clickAlertFrameWindowsTab()
	{
		wait.until(ExpectedConditions.elementToBeClickable(alertFrameAndWindows));
		driver.findElement(alertFrameAndWindows).click();
		logger.info("Clicked alertFrameWindows Tab..");
	}
	
	public void clickBrowserWindowsTab()
	{
		wait.until(ExpectedConditions.elementToBeClickable(browserWindowSubTab));
		driver.findElement(browserWindowSubTab).click();
		logger.info("Clicked browserWindow Tab");
	}
	
	public void clickNewTabButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(newTab));
		String parent=driver.getWindowHandle();
		System.out.println("Value of Parent: "+parent);
		driver.findElement(newTab).click();
		logger.info("Clicked on new tab button");
		
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		
		logger.info(driver.getCurrentUrl());
		logger.info(driver.findElement(newTabText).getText());
		}
	  }
		driver.switchTo().window(parent);
	}
	
	public void clickNewWindowButton()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(newTab));
		String parent=driver.getWindowHandle();
		System.out.println("Value of Parent: "+parent);
		driver.findElement(newTab).click();
		logger.info("Clicked on NewWindow Button");
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		logger.info(driver.getCurrentUrl());
		logger.info(driver.findElement(newTabText).getText());
		}
	  }
		driver.switchTo().window(parent);
		driver.quit();
	}
	
	public void clickNewWindowMessageButton()
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(newTab));
		String parent=driver.getWindowHandle();
		System.out.println("Value of Parent: "+parent);
		driver.findElement(newTab).click();
		logger.info("Clicked on NewWindowMessage Button");
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		logger.info(driver.getCurrentUrl());
		logger.info("\n===================="+driver.findElement(By.xpath("//body")).getText());
		}
	  }
	}
	
	//methods use to perform operation on Alert
	public void clickOnAlertTab()
	{
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(alertTab));
		ele.click();
		logger.info("Clicked Alert Tab");
	}
	
	public void clickPromtClickMeButton()
	{
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(clickMePromtButton));
		ele.click();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		logger.info("perfromed accept event on alert");
	}
	
	// Methods use to perform actions on Frames
	
	public void clickOnFrameTab()	
	{
		wait.until(ExpectedConditions.elementToBeClickable(frameTab));
		driver.findElement(frameTab).click();
		logger.info("Clicked on Frame Tab");
	}
	
	public void getContentOfFrame1()
	{
		driver.switchTo().frame("frame1");
		String txt = driver.findElement(textInFrame2).getText();
		logger.info("Text inside the frame-1: ##"+txt);
	}
	
}
