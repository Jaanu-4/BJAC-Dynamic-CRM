package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccPage {
	
	WebDriver driver;
	
	public CreateAccPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	//Account Type Drop down 
	@FindBy(xpath = "//select[@aria-label='Account Type']")  
	WebElement selectPersonal;
	public WebElement dropdownPer() {
		Select personal = new Select(selectPersonal);
		personal.selectByValue("3");
		return selectPersonal;
	}
	
	//Account Type Drop down 
	@FindBy(xpath = "//select[@aria-label='Account Type']")  
	WebElement selectDealer;
	public WebElement dropdownDea() {
		Select dealer = new Select(selectDealer);
		dealer.selectByValue("8");
		return selectDealer;
	}
		
	//Account Type Drop down 
	@FindBy(xpath = "//select[@aria-label='Account Type']")  
	WebElement selectBusiness;
	public WebElement dropdownBus() {
		Select business = new Select(selectBusiness);
		business.selectByValue("4");
		return selectBusiness;
	}
	
	//First Name
	@FindBy(xpath = "//input[@aria-label='First Name']")  
	WebElement firstName;
	public WebElement enterFirstName() {
		return firstName;
	}
	
	//Last Name
	@FindBy(xpath = "//input[@aria-label='Last Name']")  
	WebElement lastName;
	public WebElement enterLastName() {
		return lastName;
	}
	
	//Find Source Element
	@FindBy(xpath = "//h2[text()='Source']")
	WebElement moveToElementSource;
	public WebElement moveToElementSource() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToElementSource).perform();
		return moveToElementSource;
	}
	
	//Source
	@FindBy(xpath = "//input[@aria-label='Source, Lookup']")
	WebElement source;
	public WebElement enterSource() {
		return source;
	}
	
	//Find Next Auction Comp Type text
	@FindBy(xpath = "//label[text()='Next Auction Comp Type']")
	WebElement moveToElementCompCtype;
	public WebElement moveToElementCompCtype() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToElementCompCtype).perform();
		return moveToElementCompCtype;
	}
		
	//Find Phone Number
	@FindBy(xpath = "//h3[text()='Phone Numbers']")
	WebElement moveToElementPhnNum;
	public WebElement moveToElementPhnNum() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToElementPhnNum).perform();
		return moveToElementPhnNum;
	}
		
	//Find Email
	@FindBy(xpath = "//h3[text()='Email']")
	WebElement moveToElementEmail;
	public WebElement moveToElementEmail() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToElementEmail).perform();
		return moveToElementEmail;
	}
		
	
	// Company Name
	@FindBy(xpath = "//input[@aria-label='Company Name']")
	WebElement companyName;
	public WebElement enterCompany() {
		return companyName;
	}
	
	//EIN
	@FindBy(xpath = "//input[@aria-label='Employee ID Number (EIN)']")
	WebElement ein;
	public WebElement enterEIN() {
		return ein;
	}
	
	//Related Accounts Tab
	@FindBy(xpath = "//li[@aria-label='Related Accounts']")
	WebElement relatedAccs;
	public WebElement relatedAccTab() {
		return relatedAccs;
	}
	
	// Add Existing Acc
	@FindBy(xpath="//span[text()='Add Existing Account']")
	WebElement addExistingAcc;
	public WebElement addExistingAcc() {
		return addExistingAcc;
	}
	
	//lookuprecords
	@FindBy(xpath="//ul[@aria-label='Lookup recently used results']/li")
	WebElement lookUpRecord;
	public WebElement selectExistingAcc() {
		return lookUpRecord;
	}
	
	//click new button to add the existing Acc to the Personal
	@FindBy(xpath="//span[text()='Add']")
	WebElement addNew;
	public WebElement addNewButton() {
		return addNew;	
	}
	
	//Documents Tab
	@FindBy(xpath = "//li[text()='Documents']")
	WebElement documentTab;
	public WebElement documentTab() {
		return documentTab;
	}
	
	//Click on Add Document
	@FindBy(xpath = "//span[text()='Add Document']")
	WebElement addDocument;
	public WebElement clickOnAddDocument() {
		return addDocument;
	}
	
	//document dropdown
	@FindBy(xpath = "//select[@id='documentType']")
	WebElement selectDocument;
	
	public WebElement documentDropdown(String documentType) {
		Select dropdown = new Select(selectDocument);
		dropdown.selectByValue(documentType);
		return selectDocument;
	}
	//BusinessDocument
	public WebElement busDocDropdown() {
		Select busDropdown = new Select(selectDocument);
		busDropdown.selectByValue("Operating Agreement");
		return selectDocument;
	}
	//DealerDocument
	public WebElement dealerDocDropdown(String deaDocType) {
		Select dealerDropdown = new Select(selectDocument);
		dealerDropdown.selectByValue(deaDocType);
		return selectDocument;
	}
	
	//ExpirationDate
	@FindBy(xpath = "//input[@id='date-picker']")
	WebElement datePicker;
	public WebElement datePicker() {
		return datePicker;
	}
	@FindBy(xpath = "//th[text()='»']")
	WebElement nextArrow;
	public WebElement nextArrow() {
		return nextArrow;
	}
	@FindBy(xpath = "//table[@class='table-condensed']/tbody/tr[3]/td[4]")
	WebElement selectDate;
	public WebElement selectDate() {
		return selectDate;
	}
	
	//Browser
	@FindBy(xpath = "//input[@type='file']")
	WebElement selectedDocument;
	public WebElement browseDoc() {
		return selectedDocument;
	}
	
	//Upload Document
	@FindBy(xpath = "//button[@id='uploadButton']")
	WebElement uploadButton;
	public WebElement uploadButton() {
		return uploadButton;
	}
	
	//Refresh Button
	@FindBy(xpath = "//section[@aria-label='Personal Documents']//span[text()='Refresh']")
	WebElement refreshButton;
	public WebElement doRefresh() {
		return refreshButton;
	}
	
	@FindBy(xpath = "//section[@aria-label='Business Documents']//span[text()='Refresh']")
	WebElement busiRefreshButton;
	public WebElement busiDoRefresh() {
		return busiRefreshButton;
	}
	
	@FindBy(xpath = "//section[@aria-label='Dealer Documents']//span[text()='Refresh']")
	WebElement deaRefreshButton;
	public WebElement deaDoRefresh() {
		return deaRefreshButton;
	}
}
