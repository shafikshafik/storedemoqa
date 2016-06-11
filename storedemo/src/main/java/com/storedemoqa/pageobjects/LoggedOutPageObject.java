package com.storedemoqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class LoggedOutPageObject {

	@FindBy(xpath = ".//p[contains(text(),'You are now logged out')]")
	WebElement loggedOutText;
	WebDriver driver;
	Wait<WebDriver> wait;

	public LoggedOutPageObject(WebDriver driver, Wait<WebDriver> wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}

	public void verifyPageLoaded() {
		wait.until(ExpectedConditions.visibilityOf(loggedOutText));

	}
}
