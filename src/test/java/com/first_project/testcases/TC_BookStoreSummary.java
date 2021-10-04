package com.first_project.testcases;

import org.testng.annotations.Test;

import com.first_project.pages.BookStoreSummaryPageObject;

public class TC_BookStoreSummary extends Base {

	@Test(description = "Verify all books are getting displayed on Book Store Summary ")
	public void verifyAllBooks() {

		BookStoreSummaryPageObject bookStore = new BookStoreSummaryPageObject(driver);
		js.executeScript("window.scrollBy(0,1000)");
		// loginObj.hideElement(loginObj.adds);
		bookStore.clickBookStoreAppTab();
		js.executeScript("window.scrollBy(0,5000)");
		bookStore.clickBookStore();
		bookStore.getAllBookRecords();
	}
}
