package com.storedemoqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class HomePageObject {
	@FindBy(xpath = ".//a[text()='My Account']")
	public WebElement myAccount;
	WebDriver driver;
	Wait<WebDriver> wait;
	@FindBy(xpath = ".//a[text()='Product Category']")
	WebElement productCatergoy;
	@FindBy(xpath = ".//a[text()='All Product']")
	WebElement allProductsPage;
	@FindBy(xpath = ".//ul[@id='slide_menu']")
	WebElement slideMenu;
	@FindBy(xpath = ".//a[text()='iMacs']")
	WebElement imacsCategory;
	@FindBy(xpath = ".//a[text()='iPads']")
	WebElement iPadsCategory;
	@FindBy(xpath = ".//a[text()='iPhones']")
	WebElement iPhonesCategory;
	@FindBy(xpath = ".//a[text()='iPods']")
	WebElement iPodsCategory;
	@FindBy(xpath = ".//a[text()='Checkout']")
	WebElement checkoutFromHome;
	PageFooter pageFooter;

	public HomePageObject(WebDriver driver, Wait<WebDriver> wait, PageFooter pageFooter) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		this.pageFooter = pageFooter;
	}

	public YourAccountPageObject clickMyAccount() {
		YourAccountPageObject yourAccountPageObject = new YourAccountPageObject(driver, wait, pageFooter);
		wait.until(ExpectedConditions.elementToBeClickable(myAccount));
		myAccount.click();
		return yourAccountPageObject;
	}

	public ProductCaterogyPageObject gotToProductCategory() {
		ProductCaterogyPageObject productCaterogyPageObject = new ProductCaterogyPageObject(driver, wait, pageFooter);
		wait.until(ExpectedConditions.visibilityOf(productCatergoy));
		productCatergoy.click();
		return productCaterogyPageObject;
	}

	public ImacsCaterogyPageObject goToImacsCategory() {
		ImacsCaterogyPageObject imacsCatergoryPageObject = new ImacsCaterogyPageObject(driver, wait, pageFooter);
		wait.until(ExpectedConditions.visibilityOf(productCatergoy));
		Actions action = new Actions(driver);
		action.moveToElement(productCatergoy).perform();
		wait.until(ExpectedConditions.visibilityOf(imacsCategory));
		imacsCategory.click();
		return imacsCatergoryPageObject;
	}

	public IPadsCaterogyPageObject goToIPadsCategory() {
		IPadsCaterogyPageObject iPadsCatergoryPageObject = new IPadsCaterogyPageObject(driver, wait, pageFooter);
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(productCatergoy));
		action.moveToElement(productCatergoy).perform();
		wait.until(ExpectedConditions.visibilityOf(iPadsCategory));
		iPadsCategory.click();
		return iPadsCatergoryPageObject;
	}

	public IPodsCaterogyPageObject goToIPodsCategory() {
		IPodsCaterogyPageObject iPodsCatergoryPageObject = new IPodsCaterogyPageObject(driver, wait, pageFooter);
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(productCatergoy));
		action.moveToElement(productCatergoy).perform();
		wait.until(ExpectedConditions.visibilityOf(iPodsCategory));
		iPodsCategory.click();
		return iPodsCatergoryPageObject;
	}

	public IPhonesCaterogyPageObject goToIPhonesCategory() {
		IPhonesCaterogyPageObject iPhonesCatergoryPageObject = new IPhonesCaterogyPageObject(driver, wait, pageFooter);
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(productCatergoy));
		action.moveToElement(productCatergoy).perform();
		wait.until(ExpectedConditions.visibilityOf(iPhonesCategory));
		iPhonesCategory.click();
		return iPhonesCatergoryPageObject;
	}

	public CheckOutPageObject goToCheckOutPage() {
		CheckOutPageObject checkOutPageObject = new CheckOutPageObject(driver, wait);
		wait.until(ExpectedConditions.visibilityOf(checkoutFromHome));
		checkoutFromHome.click();
		return checkOutPageObject;
	}

	public void clickSpHomePageFooterLink() {
		wait.until(ExpectedConditions.visibilityOf(pageFooter.sPHome));
		pageFooter.sPHome.click();
	}

	public void verifyPageLoaded() {
		// wait.until(ExpectedConditions.visibilityOf(productCatergoy));
		wait.until(ExpectedConditions.visibilityOf(allProductsPage));
		wait.until(ExpectedConditions.visibilityOf(slideMenu));

	}
}
