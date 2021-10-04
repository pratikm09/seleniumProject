package com.first_project.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
     
	public void addYourCookie(WebDriver driver) {

		File file = new File("./Cookies.txt");
		Cookie name = new Cookie("FirstDemoCookie", "123456789123");
		Set<Cookie> cookiesSet = driver.manage().getCookies();
		try {
			file.delete();
			file.createNewFile();	
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			for (Cookie ck : cookiesSet) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getAllCookies(WebDriver driver) {
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("Size of cookie" + allCookies.size());
		System.out.println("===========================================");
		for (Cookie ck : allCookies) {
			System.out.println("Name: " + ck.getName() + "\nDomain: " + ck.getDomain());
			System.out.println("Name: " + ck.getPath() + "\nDomain: " + ck.getValue());
		}

	}
	
	public void takeScreenshot(String fileName,WebDriver driver) throws IOException
	{
		    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(file, new File("/home/pratik/Documents/Selenium-Workspace/TestingWithSeleniumProject/Screenshots/"+fileName+".png"));
	}
}
