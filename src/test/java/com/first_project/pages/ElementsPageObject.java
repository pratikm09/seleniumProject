package com.first_project.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.first_project.testcases.TC_Elements;

public class ElementsPageObject {
	WebDriver driver;
	Logger logger = LogManager.getLogger(TC_Elements.class);
	Random random; 
	

	WebDriverWait wait;
	//Locators for common side panel

	By elementsTab = By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[local-name()='svg']");
	By formTab = By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[local-name()='svg']");
	By alertFrameAndWindows = By.xpath("//div[3]//div[1]//div[2]//*[local-name()='svg']");
	By widgets = By.xpath("//div[4]//div[1]//div[2]//*[local-name()='svg']");
	By interaction = By.xpath("//div[5]//div[1]//div[2]//*[local-name()='svg']");
	By bookStoreApplication = By.xpath("//div[6]//div[1]//div[2]//*[local-name()='svg']");
	
	//Locators for sub tabs under Elements Tab
	By textboxTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[1]/span[contains(text(),\"Text Box\")]");
	By checkBoxTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[2]/span[contains(text(),\"Check Box\")]");
	By radioButtonTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[3]/span[contains(text(),\"Radio Button\")]");
	By webTablesTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[4]/span[contains(text(),\"Web Tables\")]");
	By buttonsTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[5]/span[contains(text(),\"Buttons\")]");
	By linksTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[6]/span[contains(text(),\"Links\")]");
	By brokenLinksImagesTab = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[1]/span[contains(text(),\"Broken Links - Images\")]");
	By uploadAndDownload = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[1]/span[contains(text(),\"Upload and Download\")]");
	By dynamicPropertis = By.xpath("//div[@class = \"accordion\"]/div/div/ul[@class=\"menu-list\"]/li[1]/span[contains(text(),\"Dynamic Properties\")]");
	
	// locators for text-Box tab 
	By userName = By.id("userName");
	By userEmail = By.xpath("//div[@class=\"col-md-9 col-sm-12\"]/input[@id=\"userEmail\"]");
	By currentAddress = By.cssSelector("textarea.form-control");
	By permanentAddress = By.cssSelector("textarea#permanentAddress");
	By submitButton = By.xpath("//button[@id='submit']");

	// locators for check-Box tab
	By homecheckbox  = By.xpath("//span[contains(text(),'Home')]");
	By homeExpansionArrow  = By.xpath("//button[@title='Toggle']//*[local-name()='svg']");
	By desktopCheckboxOption  = By.id("tree-node-desktop");
	By expandAllPlusIconXpath  = By.xpath("//button[@title='Expand all']");
	By collapseAllMinusIconXpath  = By.xpath("//button[@title='Collapse all']");
    By selectedItemsUnderHome = By.xpath("//div[@class=\"check-box-tree-wrapper\"]//div[@id=\"result\"]//span");
	
    // locators for Radio-Button tab
	By RadioButtonWithTextYes  = By.xpath("//label[normalize-space()='Yes']");
	By RadioButtonWithTextImpressive = By.id("impressiveRadio");
	By RadioButtonWithTextNo = By.id("noRadio");
	By selectedRadioButtonText = By.cssSelector("p.mt-3");
		
	// Locators for web tables tab	
	By addButtonId = By.id("addNewRecordButton");
	By searchInputTextboxXpath = By.xpath("//input[@id='searchBox']");
	By allRecordsXpath = By.className("rt-tbody");  // Xpath = //div[@class="rt-tbody"]/div[
	
	// Locators for Registration form
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By userEmailForRegistrationForm = By.xpath("//input[@id='userEmail']");
	By age = By.id("age");
	By salary = By.id("salary");
	By department = By.id("department");
	By submitButtonForRegistrationForm = By.xpath("//button[normalize-space()='Submit']");
	By closeForm = By.className("close");
	
	// Locators for Uploading file
	By uploadAndDownloadTab = By.xpath("//span[normalize-space()='Upload and Download']");
	By chooseFile = By.xpath("//input[@id=\"uploadFile\"]");
	
	public ElementsPageObject(WebDriver driver)
	{
		this.driver = driver;	
		wait = new WebDriverWait(this.driver,5);
		random = new Random();
	}
	
	//=========BEGIN============== TextBox Section ====================BEGIN===============
	//========================== Methods use to click buttons =============================
	public void clickElementsTab()
	{
		wait.until(ExpectedConditions.elementToBeClickable(elementsTab));
		driver.findElement(elementsTab).click();
		logger.info("Clicked On Elements Tab..");
	}
	
	public void clickTextbox()
	{
		wait.until(ExpectedConditions.elementToBeClickable(textboxTab));
		driver.findElement(textboxTab).click();
		logger.info("Clicked On Textbox Tab..");
	}
	
	public void enterUserName()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		driver.findElement(userName).sendKeys("pratik More");
		logger.error("Entered UserName..");
	}
	
	public void enterEmail()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(userEmail));
		driver.findElement(userEmail).sendKeys("pratik@gmail.com");
		logger.info("Entered an email");
	}
	
	public void enterCurrentAddress()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddress));
		driver.findElement(currentAddress).sendKeys("Pune");
		logger.info("Entered Current Address");
	}
	
	public void enterPermanentAddress()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(permanentAddress));
		driver.findElement(permanentAddress).sendKeys("Kolhapur");
		logger.info("Entered Permanent Address");
	}
	
	public void clickSubmit()
	{
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		driver.findElement(submitButton).click();
		logger.info("Clicked on Submit button");
	}
	//=========END============== TextBox Section ====================END=======================
	
	//==========BEGIN============== Check Box Section ====================BEGIN=======================
	public void clickOnCheckBoxTab()
	{
		wait.until(ExpectedConditions.elementToBeClickable(checkBoxTab));
		driver.findElement(checkBoxTab).click();
		logger.info("clicked on checkBox tab");
	}
	
	public void selectHome()
	{
		wait.until(ExpectedConditions.elementToBeClickable(homecheckbox));
		driver.findElement(homecheckbox).click();
		logger.info("home option has been checked");
	}
	public void expandHomeTree()
	{
		wait.until(ExpectedConditions.elementToBeClickable(homeExpansionArrow));
		driver.findElement(homeExpansionArrow).click();
		logger.info("Home Option has been expanded");
	}
	
	public void clickPlusIcon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(expandAllPlusIconXpath));
		driver.findElement(expandAllPlusIconXpath).click();
		logger.info("Clicked on Plus Icon to Expand Home Option");
	}
	
	public void clickMinusIconToCollapseHomeTree()
	{
		wait.until(ExpectedConditions.elementToBeClickable(collapseAllMinusIconXpath));
		driver.findElement(collapseAllMinusIconXpath).click();
		logger.info("Clicked on Minus Icon to Collapse Home Option Tree");
	}
	
	public List<String> getCheckedOptionsUnderHome()
	{
		List<String> checkedList= new ArrayList<String>();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectedItemsUnderHome));
		List<WebElement> checkedOptionsList = driver.findElements(selectedItemsUnderHome);
		for(WebElement opt: checkedOptionsList)
		{
			checkedList.add(opt.getText());
		}
		return checkedList;
	}
	//==========END============== Check Box Section ====================END=============================
	
	//==========BEGIN============== Radio Button Section ====================BEGIN=======================
	
	public void clickOnRadioButtonTab()
	{
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonTab));
		driver.findElement(radioButtonTab).click();
		logger.info("Radio Button Tab is selected");
	}	
	public void selectRadioButton()
	{
		int num  =  0;    
//				random.nextInt(1);
		if(num == 0) {
		wait.until(ExpectedConditions.elementToBeClickable(RadioButtonWithTextYes));
		driver.findElement(RadioButtonWithTextYes).click();;
		logger.info("Yes Option has been selected");
		}
		else if (num==1)
		{
			wait.until(ExpectedConditions.elementToBeClickable(RadioButtonWithTextImpressive));
			driver.findElement(RadioButtonWithTextImpressive).click();;
			logger.info("Impressive Option has been selected");
		}
		
	}
	
	public void getSelectedRadioButtonText()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectedRadioButtonText));
		String txt = driver.findElement(selectedRadioButtonText).getText();
		logger.info("Got the selected Radio Button Text: ## "+txt);
	}	
	
	//==========END============== Radio Button Section ====================END===========================	
	
	
	//==========BEGIN==================Upload File Functionality===============BEGIN===========================
	
	
	public void clickUploadAndDownloadTab()
	{
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(uploadAndDownloadTab));
		ele.click();
		logger.info("Clicked on UploadAndDownload Tab");
	}
	
	public void clickChooseFile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(chooseFile));
		driver.findElement(chooseFile).click();
		logger.info("Clicked on UploadAndDownload Tab");
	}
}
