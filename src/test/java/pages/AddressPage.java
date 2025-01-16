package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	
	WebDriver driver;
	
	public AddressPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	//+ New Address Button
	@FindBy(xpath="//span[text()='New Address']")
	WebElement newAddressButton;
	public WebElement clickOnNewAddress() {
		return newAddressButton;
	}
	
	//Enter Customer Address
	
	//Enter Street Address
	@FindBy(xpath="//input[@aria-label='Street Address']")
	WebElement streetAddress;
	public WebElement enterStreetAddress() {
		return streetAddress;
	}
		
	//Country
	@FindBy(xpath="//input[@aria-label='Country, Lookup']")
	WebElement country;
	public WebElement enterCountry() {
		return country;
	}
		
	//StateProvince
	@FindBy(xpath="//input[@aria-label='State/Province, Lookup']")
	WebElement stateProvince;
	public WebElement enterState(){
		return stateProvince;	
	}
		
	//City
	@FindBy(xpath="//input[@aria-label='City']")
	WebElement city;
	public WebElement enterCity(){
		return city;	
	}
		
	//PostalCode
	@FindBy(xpath="//input[@aria-label='Postal Code']")
	WebElement postalCode;
	public WebElement enterPostalCode(){
		return postalCode;	
	}
		
	//County
	@FindBy(xpath="//input[@aria-label='County, Lookup']")
	WebElement county;
	public WebElement enterCounty(){
		return county;
	}
		
	//Status Drop down
	@FindBy(xpath="//select[@aria-label='Status']")
	WebElement status;
	public WebElement selectStatus() {
		Select statusDropdown = new Select(status);
		//statusDropdown.selectByValue("-1");
		statusDropdown.selectByValue("1");
		//statusDropdown.selectByValue("3");
		//statusDropdown.selectByValue("4");
		return status;
	}
}
