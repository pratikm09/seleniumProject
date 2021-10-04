package com.first_project.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.Logger;

public class Base {

	public String baseURL = "https://demoqa.com/";
	public String userName = "admin";
	public String password = "Admin@123";
	public static WebDriver driver;
	JavascriptExecutor js;
	Properties prop = new Properties();
	                                   
	@BeforeClass
	public void setup() throws IOException {
		String path = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver");
			driver = new FirefoxDriver();
			DesiredCapabilities cap = DesiredCapabilities.firefox();
	        //cap.setCapability("marionette", true);
	        cap.setBrowserName("firefox");
		}
		js = (JavascriptExecutor) driver;
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.get(baseURL);
	}
	@BeforeMethod
	public void demo1()
	{
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@AfterClass
	public void quit() {
		driver.quit();
	}

}
