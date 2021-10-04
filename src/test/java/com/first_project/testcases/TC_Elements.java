package com.first_project.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.first_project.pages.ElementsPageObject;

public class TC_Elements extends Base{

	@Test(priority=1)	
	public void verifyTextBox() throws InterruptedException
	{
		ElementsPageObject elementsPage = new ElementsPageObject(driver);
		js.executeScript("window.scrollBy(0,350)", "");
		elementsPage.clickElementsTab();
		elementsPage.clickTextbox();
		elementsPage.enterUserName();
		elementsPage.enterEmail();
		elementsPage.enterCurrentAddress();
		js.executeScript("window.scrollBy(0,350)", "");
		elementsPage.enterPermanentAddress();
		elementsPage.clickSubmit();
	}
	
	@Test(priority=2)
	public void verifyCheckBoxFunctionality() throws InterruptedException
	{
		ElementsPageObject elementsPage = new ElementsPageObject(driver);
		js.executeScript("window.scrollBy(0,350)", "");
		elementsPage.clickElementsTab();
		js.executeScript("window.scrollBy(0,200)", "");
		elementsPage.clickOnCheckBoxTab();
		elementsPage.selectHome();
		Thread.sleep(4000);
		List<String> l = elementsPage.getCheckedOptionsUnderHome();
		System.out.println(l);
		elementsPage.expandHomeTree();
		Thread.sleep(4000);
		elementsPage.clickPlusIcon();
		Thread.sleep(4000);
		elementsPage.clickMinusIconToCollapseHomeTree();
		Thread.sleep(4000);   
	}
	
	@Test(priority=3)
	public void VerifyRadioButtonFunctionality() throws InterruptedException
	{
		ElementsPageObject elementsPage = new ElementsPageObject(driver);
		js.executeScript("window.scrollBy(0,350)", "");
		elementsPage.clickElementsTab();
		js.executeScript("window.scrollBy(0,200)", "");
		elementsPage.clickOnRadioButtonTab();
		elementsPage.selectRadioButton();
		elementsPage.getSelectedRadioButtonText();
		Thread.sleep(4000);
		Assert.assertEquals(password, baseURL);
	}
	
	//@Test
//	public void fileUploadCheck() throws AWTException, InterruptedException
//	{
//		ElementsPageObject elementsPage = new ElementsPageObject(driver);
//		js.executeScript("window.scrollBy(0,350)");
//		elementsPage.clickElementsTab();
//		js.executeScript("window.scrollBy(0,200)");
//		elementsPage.clickUploadAndDownloadTab();
//		elementsPage.clickChooseFile();
//		Thread.sleep(4000);
//	}
	
	
}
