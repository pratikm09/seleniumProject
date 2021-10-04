package com.first_project.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.first_project.pages.AlertFrameAndWindowsPageObject;

public class TC_AlertFrameAndWindows extends Base {


	@Test
	public void checkBrowserwindowsFunctionality() throws InterruptedException
	{
		AlertFrameAndWindowsPageObject alertFrameWindowsObj = new AlertFrameAndWindowsPageObject(driver);
		js.executeScript("window.scrollBy(0,350)", "");
		alertFrameWindowsObj.clickAlertFrameWindowsTab();
		alertFrameWindowsObj.clickBrowserWindowsTab();	
		alertFrameWindowsObj.clickNewTabButton();
//		Thread.sleep(5000);
		//alertFrameWindowsObj.clickNewWindowButton();
//		alertFrameWindowsObj.clickNewWindowMessageButton();
		Thread.sleep(7000);
	}
	
	@Test
	public void checkAlertFunctionality() throws InterruptedException
	{
		AlertFrameAndWindowsPageObject alertFrameWindowsObj = new AlertFrameAndWindowsPageObject(driver);
		js.executeScript("window.scrollBy(0,350)", "");
		alertFrameWindowsObj.clickAlertFrameWindowsTab();
		alertFrameWindowsObj.clickOnAlertTab();
		alertFrameWindowsObj.clickPromtClickMeButton();
		Thread.sleep(4000);
		
	}
	
	@Test
//	@Parameters("demo")
	public void checkFrameFunctionality(String s) throws InterruptedException
	{
		AlertFrameAndWindowsPageObject alertFrameWindowsObj = new AlertFrameAndWindowsPageObject(driver);
		//System.out.println("###  "+s);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(4000);
		alertFrameWindowsObj.clickAlertFrameWindowsTab();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,350)");
		alertFrameWindowsObj.clickOnFrameTab();
		Thread.sleep(4000);
		alertFrameWindowsObj.getContentOfFrame1();
		Thread.sleep(4000);
	}
}
