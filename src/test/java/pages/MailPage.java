package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
	
	WebDriver driver;

	public MailPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	// + New Mail Button
	@FindBy(xpath = "//span[text()='New Email']")  
	WebElement newMailButton;
	public WebElement clickOnNewMail() {
		return newMailButton;
	}
	
	// Enter Email
	@FindBy(xpath = "//input[@aria-label='Email']")
	WebElement email;
	public WebElement enterEmail(){
		return email;
	}
}
