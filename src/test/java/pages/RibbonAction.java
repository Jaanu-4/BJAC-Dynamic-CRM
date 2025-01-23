package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RibbonAction {
	
	WebDriver driver;

	public RibbonAction(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	//New Button
	@FindBy(xpath="//span[text()='New']")
	WebElement newButton;
	public WebElement newCustomer() {
		return newButton;
	}

	//+New Consignment Opportunity Button -- Acc Level
	@FindBy(xpath="//span[text()='New Consignment Opportunity']")
	WebElement newOpportunityButton;
	public WebElement newOpportunity() {
		return newOpportunityButton;
	}
	
	// + start Consignment Oppotunity -- Opportunity level
	@FindBy(xpath="//span[text()='Start Consignment Opportunity']")
	WebElement startOpportunity;
	public WebElement startOpportunity() {
		return startOpportunity;
	}
	
	//Save Button
	@FindBy(xpath="//span[text()='Save']")  
	WebElement saveButton;
	public WebElement saveButton() {
		return saveButton;
	}	
		
	//Save and Close Button
	@FindBy(xpath="//span[text()='Save & Close']")
	WebElement saveCloseButton;
	public WebElement saveCloseButton() {
		return saveCloseButton;
	}
	
	//+New Bodder Opportunity Button -- Acc Level
	@FindBy(xpath="//span[text()='Bidder Registration']")
	WebElement newBidderButton;
	public WebElement newBidder() {
		return newBidderButton;
	}
	
	// + start Bidder Oppotunity -- Bidder level
	@FindBy(xpath="//span[text()='Start Bidder Opportunity']")
	WebElement startBidder;
	public WebElement startBidder() {
		return startBidder;
	}
}
