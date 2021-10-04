package com.first_project.pages;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;

import com.first_project.testcases.TC_BookStoreLogin;
public class BookStoreLoginPageObject {
  WebDriver driver;	
  Logger logger = LogManager.getLogger(TC_BookStoreLogin.class);
  //WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
 // Locator for side panel menu item
  By bookStoreApplication = By.xpath("//div[6]//div[1]//div[2]//*[local-name()='svg']");
  By bookStoreLoginTab = By.xpath("//span[normalize-space()='Login']");
 // locator for login page
  By userName = By.id("userName");
  By password = By.id("password");
  By logingButton = By.id("login");
  By newUserButton = By.id("newUser");
  
  // Registration to book store
  By firstName = By.xpath("//input[@id='firstname']");
  By lastName = By.xpath("//input[@id='lastname']");
  By userNameTextfield = By.xpath("//input[@id='userName']");
  By passwd = By.xpath("//input[@id='password']");
  By captcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
  By registerButton = By.id("register");
  By backToLogin = By.id("gotologin");
  	
//  // Locators for Profile
//  By goToStoreButton = By.id("gotoStore");
//  By deleteAccountButton = By.xpath("//div[@class=\"text-center button\"]/button[@id=\"submit\"]");
  
  public BookStoreLoginPageObject(WebDriver driver)
  {
	  this.driver = driver;
  }
  
  //======================
  public void clickBookStoreAppTab()
  {
	  driver.findElement(bookStoreApplication).click();;
	  System.out.println("clicked on book store application Tab");
  }
  
  public void clickLoginTab()
  {
	  driver.findElement(bookStoreLoginTab).click();
	  System.out.println("clicked on Login sub-Tab");
  }
  
  //====================== book store regstration page =========================================
  // Methods use to enter info in textfields
  public void enterFirstName()
   {
     driver.findElement(firstName).sendKeys("sandip");;
   }
  
  public void enterLastName()
  {
    driver.findElement(lastName).sendKeys("chavan");;
  }
  
  public void enterUserName()
  {
    driver.findElement(userNameTextfield).sendKeys("admin1");
  }
  
  public void enterPassword()
  {
    driver.findElement(passwd).sendKeys("Qwerty@123");;
  }
  
  public void clickCaptcha()
  {
    driver.findElement(captcha);
  }
  
  public void clickRegister()
  {
    driver.findElement(registerButton);
  }
  
  public void clickBackToLogin()
  {
    driver.findElement(backToLogin);
  }
//=============END ======== book store registration ==================END==================
  	
//==========BEGIN============== Book store Login ===================BEGIN ================
  public void enterUserID()
  {
    driver.findElement(userName).sendKeys("admin");;
  }
  	
  public void enterLoginPassword()
  {
    driver.findElement(password).sendKeys("Admin@123");
    logger.info("Entered Login Password on login button...");
  }
  public void clickLoginButton()
  {
    driver.findElement(logingButton).click();
    logger.info("Clicked on login button...");
  }
  
  public void clickNewUser()
  {	
	  driver.findElement(newUserButton).click();;
  }
  public void hideElement(String xpath)
  {
      WebElement ele = driver.findElement(By.xpath(xpath));       
      ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", ele);
  }
  
  
}
