package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PhoneNumberPage {

	WebDriver driver;

	public PhoneNumberPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}

	// New Phone Number Button
	@FindBy(xpath="//span[text()='New Phone Number']")
	WebElement newPhoneNumber;
	public WebElement clickOnNewPhnNumber() {
		return newPhoneNumber;
	}

	// Phn Country
	@FindBy(xpath = "//input[@aria-label='Country, Lookup']")
	WebElement phnCountry;
	public WebElement enterPhnCountry() {
		return phnCountry;
	}

	// AreaCode
	@FindBy(xpath = "//input[@aria-label='Area Code']")
	WebElement areaCode;
	public WebElement enterAreaCode() {
		return areaCode;
	}

	// Number
	@FindBy(xpath = "//input[@aria-label='Number']")
	WebElement number;
	public WebElement enterNumber() {
		return number;
	}
	
	//Phone Type
	@FindBy(xpath = "//select[@aria-label='Phone Type']")
	WebElement phoneType;
	public WebElement selectPhoneTypeDealer() {
		Select phoneTypeDropdown = new Select(phoneType);
		phoneTypeDropdown.selectByVisibleText("DEALER PHONE");
		return phoneType;
	}
	
	public WebElement selectPhoneTypeBusiness() {
		Select phoneTypeDropdown = new Select(phoneType);
		phoneTypeDropdown.selectByVisibleText("BUSINESS PHONE");
		return phoneType;
	}
}
