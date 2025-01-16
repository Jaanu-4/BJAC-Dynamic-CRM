package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	public SignInPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	//Microsoft Mail
	@FindBy(id="i0116")  
	WebElement microsoftMail;
	public WebElement microsoftMail() {
		return microsoftMail;
	}
	
	//Password
	@FindBy(id="i0118")  
	WebElement password;
	public WebElement password() {
		return password;
	}
	
	// Stay in SignIN
	@FindBy(id="idSIButton9")  
	WebElement staySignIn;
	public WebElement staySignIn() {
		return staySignIn;
	}
	
	//Management Drop down
	@FindBy(id="sitemap-entity-Management") 
	WebElement management;
	public WebElement managementDropdown() {
		return management;
	}
	
	//Select Customers
	@FindBy(id="sitemap-entity-subarea_ec1b1518")  
	WebElement customers;
	public WebElement clickOnCustomers() {
		return customers;
	}

	//Opportunity Drop down
	@FindBy(id="sitemap-entity-Opportunities") 
	WebElement opportunities;
	public WebElement opportunitiesDropdown() {
		return opportunities;
	}

	//Select Consignment
	@FindBy(id="sitemap-entity-NewSubArea_bf3b9ba3") 
	WebElement consignments;
	public WebElement selectConsignments() {
		return consignments;
	}
	
	//Select Bidders
	@FindBy(xpath="//span[text()='Bidders']") 
	WebElement bidders;
	public WebElement selectBidders() {
		return bidders;
	}
}
