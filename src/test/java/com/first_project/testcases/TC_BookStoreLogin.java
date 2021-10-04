package com.first_project.testcases;

import java.io.IOException;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.first_project.pages.BookStoreLoginPageObject;
import com.first_project.util.Utility;
	
public class TC_BookStoreLogin extends Base
{
	
	@Test
	public void verifyUserLogin() throws InterruptedException, IOException {	
		
		BookStoreLoginPageObject loginObj = new BookStoreLoginPageObject(driver);
		Utility util = new Utility();
	    js.executeScript("window.scrollBy(0,1000)", "");
		loginObj.clickBookStoreAppTab();
	    js.executeScript("window.scrollBy(0,5000)", "");
		loginObj.clickLoginTab();
		loginObj.enterUserID();
		loginObj.enterLoginPassword();
		loginObj.clickLoginButton();
		util.addYourCookie(driver);
		System.out.println("\n================================================================================\n");
	//	util.getAllCookies(driver);
		Thread.sleep(3000);
		util.takeScreenshot("demoScreenshot",driver);
		
	}
	
	@Test
	public void verifyUserRegistration() throws InterruptedException
	{
		BookStoreLoginPageObject loginObj = new BookStoreLoginPageObject(driver);
		js.executeScript("window.scrollBy(0,1000)", "");
		loginObj.clickBookStoreAppTab();
		js.executeScript("window.scrollBy(0,5000)", "");
		loginObj.clickLoginTab();
		loginObj.clickNewUser();
		loginObj.enterFirstName();
		loginObj.enterLastName();
		loginObj.enterUserName();
		js.executeScript("window.scrollBy(0,5000)", "");
		loginObj.enterPassword();
		Thread.sleep(2000);
		loginObj.clickCaptcha();
		loginObj.clickRegister();
	}
	
}
