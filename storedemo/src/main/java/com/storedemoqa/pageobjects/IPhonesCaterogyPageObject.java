package com.storedemoqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class IPhonesCaterogyPageObject {
	WebDriver driver;
	Wait<WebDriver> wait;
	PageFooter pageFooter;

	public IPhonesCaterogyPageObject(WebDriver driver, Wait<WebDriver> wait, PageFooter pageFooter) {
		this.driver = driver;
		this.wait = wait;
		this.pageFooter = pageFooter;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//a[text()='Magic Mouse']")
	WebElement magicMouse;

	@FindBy(xpath = ".//input[@value='Add To Cart'][@type='submit']")
	WebElement addToCard;

	@FindBy(xpath = ".//h1[text()='iPhones']")
	WebElement iPhones;

	public void verifyPageLoaded() {
		wait.until(ExpectedConditions.visibilityOf(iPhones));
		wait.until(ExpectedConditions.visibilityOf(addToCard));
	}

	public void clickSpHomeLink() {
		pageFooter.sPHome.click();
	}

	public SamplePageObject clickSamplePageLink() {
		SamplePageObject samplePageOject = new SamplePageObject(driver, wait, pageFooter);
		pageFooter.samplePage.click();
		return samplePageOject;
	}

	public void clickYourAccountLink() {
		pageFooter.yourAccount.click();
	}
}
