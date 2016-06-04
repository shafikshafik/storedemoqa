package com.storedemoqa.testcases;

import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoqa.exceldtos.EmployeeLogin;
import com.demoqa.selenium.BaseDriverInitilization;
import com.demoqa.testngdataprovider.ExcelReadDataProvider;
import com.storedemoqa.pageobjects.HomePageObject;
import com.storedemoqa.pageobjects.LoggedOutPageObject;
import com.storedemoqa.pageobjects.PageFooter;
import com.storedemoqa.pageobjects.UserLoginHomePage;
import com.storedemoqa.pageobjects.YourAccountPageObject;

public class LoginTest extends BaseDriverInitilization {
	HomePageObject homePageObject;
	PageFooter pageFooter;

	@BeforeMethod
	public void SetUp() {
		pageFooter = new PageFooter(driver, wait);
		homePageObject = new HomePageObject(driver, wait, pageFooter);
	}

	// Test Case 2
	@Test(dataProvider = "data-source")
	public void loginTestCase(final EmployeeLogin emp) {
		System.out.println("in side the test case");
		System.out.println(emp.getEmployeedPassword());
		System.out.println(emp.getEmployeeLogin());
		System.out.println("***********************");
		// Ctrl+shift+C
		driver.get(readProp.readProperty("baseurl"));
		YourAccountPageObject yourAccountPage = homePageObject.clickMyAccount();
		yourAccountPage.verifyPageLoaded();
		UserLoginHomePage userLoginHome = yourAccountPage.login(emp.getEmployeeLogin(), emp.getEmployeedPassword(),
				emp.getIsValidUser());
		if (emp.getIsValidUser()) {
			userLoginHome.verifyPageLoaded();
			LoggedOutPageObject loggedOutPageObject = userLoginHome.logout();
			loggedOutPageObject.verifyPageLoaded();
		}
	}

	// Test Case 7
	@Test(dataProvider = "data-source")
	public void loggedFromPopMenu(final EmployeeLogin emp) {
		System.out.println("in side the test case");
		System.out.println(emp.getEmployeedPassword());
		System.out.println(emp.getEmployeeLogin());
		System.out.println("***********************");
		// Ctrl+shift+C
		driver.get(readProp.readProperty("baseurl"));
		YourAccountPageObject yourAccountPage = homePageObject.clickMyAccount();
		yourAccountPage.verifyPageLoaded();
		UserLoginHomePage userLoginHome = yourAccountPage.login(emp.getEmployeeLogin(), emp.getEmployeedPassword(),
				emp.getIsValidUser());
		if (emp.getIsValidUser()) {
			userLoginHome.verifyPageLoaded();
			LoggedOutPageObject loggedOutPageObject = userLoginHome.verifyLogoutFromPopUp();
			loggedOutPageObject.verifyPageLoaded();
		}
	}

	// Lazy initialization of the data provide of excel data
	// Normal initialization --> not used
	@DataProvider(name = "data-source")
	public Iterator<Object[]> dataOneByOne() {
		System.out.println("in data One by One");
		return new ExcelReadDataProvider("employee_login.xlsx", "Sheet1");
	}
}
