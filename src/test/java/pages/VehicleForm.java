package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VehicleForm {
	
	WebDriver driver;
	
	public VehicleForm(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	//VIN
	@FindBy(xpath = "//input[@aria-label='VIN']")
	WebElement vin;
	public WebElement enterVIN() {
		return vin;
	}

	//Year
	@FindBy(xpath = "//input[@aria-label='Year']")
	WebElement year;
	public WebElement enterYear() {
		return year;
	}
		
	//Make
	@FindBy(xpath = "//input[@aria-label='Make, Lookup']")
	WebElement make;
	public WebElement enterMake() {
		return make;
	}
	
	//SelectMake
	@FindBy(xpath = "//div[@aria-label='Make Lookup results']/ul/li[2]")
	WebElement selectMake;
	public WebElement selectMake() {
		return selectMake;
	}
	
	@FindBy(xpath = "//input[@aria-label='Model, Lookup']")
	WebElement model;
	public WebElement enterModel() {
		return model;
	}
	
	//SelectMake
	@FindBy(xpath = "//div[@aria-label='Model Lookup results']/ul/li[2]")
	WebElement selectModel;
	public WebElement selectModel() {
		return selectModel;
	}
	
	@FindBy(xpath = "//select[@aria-label='Transmission Type']")
	WebElement transmissionType;
	public WebElement selectTransType() {
		Select transTypeDropdown = new Select(transmissionType);
		transTypeDropdown.selectByValue("482");  // 284, 482, 8, 484
		return transmissionType;
	}
	
	@FindBy(xpath = "//select[@aria-label='Transmission Speeds']")
	WebElement transmissionSpeeds;
	public WebElement selectTransSpeeds() {
		Select transSpeedsDropdown = new Select(transmissionSpeeds);
		transSpeedsDropdown.selectByValue("694020000"); // 694020001,2,3,4,5,6,7,8,9  694020010,1,2,3
		return transmissionSpeeds;
	}
	
	@FindBy(xpath = "//span[text()='Save and Close']")
	WebElement saveVehicle;
	public WebElement saveVehicle() {
		return saveVehicle;
	}
}
