package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillForm {
	
	WebDriver driver;
	
	public FillForm(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
		this.driver = rdriver;
	}
	
	@FindBy(xpath = "//select[@aria-label='Odometer Type']")
	WebElement odometer;
	public WebElement selectOdometer() {
		Select odometerDropdown = new Select(odometer);
		//odometerDropdown.selectByValue("-1");
		odometerDropdown.selectByValue("1");
		//odometerDropdown.selectByValue("2");
		return odometer;
	}
	
	@FindBy(xpath = "//input[@aria-label='Description Mileage']")
	WebElement mileage;
	public WebElement enterMileage() {
		return mileage;
	}
	
	// Event
	@FindBy(xpath = "//input[@type='text' and @aria-label='Event, Lookup']")
	WebElement event;
	public WebElement enterEvent() {
		return event;
	}
	
	//Bidder Package Type
	@FindBy(xpath = "//input[@aria-label='Bidder Package Type, Lookup']")
	WebElement bidderPackageType;
	public WebElement selectBidderPackage() {
		return bidderPackageType;
	}
	
	//Bid Limit Type
	@FindBy(xpath = "//select[@aria-label='Bid Limit Type']")
	WebElement bidLimitType;
	public WebElement bidLimitType() {
		Select bidLimitTypeDropdown = new Select(bidLimitType);
		bidLimitTypeDropdown.selectByValue("345"); //343, -1, 181, 22, 3, 61, 24, 342, 25, 344, 1, 2, 26, 142
		return bidLimitType;
	}
	
	//Bid Limit value
	@FindBy(xpath = "//input[@aria-label='Bid Limit Value']")
	WebElement bidLimitValue;
	public WebElement bidLimitValue() {
		return bidLimitValue;
	}
	
	//Bid Limit value
	@FindBy(xpath = "//input[@aria-label='Bid Limit Estimated']")
	WebElement bidLimitEstimated;
	public WebElement bidLimitEstimated() {
		return bidLimitEstimated;
	}
	
	//Mailing Address
	@FindBy(xpath = "//input[@aria-label='Mailing Address, Lookup']")
	WebElement mailingAddress;
	public WebElement mailingAddress() {
		return mailingAddress;
	}
	
	//Vehicle Titling
	@FindBy(xpath = "//input[@aria-label='Vehicle Titling, Lookup']")
	WebElement vehicleTitlingAddress;
	public WebElement vehicleTitlingAddress() {
		return vehicleTitlingAddress;
	}
	
	@FindBy(xpath = "//input[@aria-label='Title Paperwork, Lookup']")
	WebElement titlePaperworkAddress;
	public WebElement titlePaperworkAddress() {
		return titlePaperworkAddress;
	}
	
	@FindBy(xpath = "//input[@aria-label='Bidder Collateral Return, Lookup']")
	WebElement biddingCollateralAddress;
	public WebElement biddingCollateralAddress() {
		return biddingCollateralAddress;
	}
	
	//Choose Address from Look Up
	@FindBy(xpath = "//ul[@aria-label='Lookup results']/li")
	WebElement chooseAddressLookUp;
	public WebElement chooseAddressLookUp() {
		return chooseAddressLookUp;
	}
	
	//Sale Type
	@FindBy(xpath = "//select[@aria-label='Sale Type']")
	WebElement saleType;
	public WebElement selectSaleType() {
		Select saleTypeDropdown = new Select(saleType);
		//saleTypeDropdown.selectByValue("-1");
		saleTypeDropdown.selectByValue("0");
		//saleTypeDropdown.selectByValue("1");
		return saleType;
	}
	
	// Owner Estimated Value
	@FindBy(xpath = "//input[@aria-label='Owner Estimated Value']")
	WebElement ownerEstimated;
	public WebElement enterOwnerEstimated() {
		return ownerEstimated;
	}
	
	// Barrett Jackson Value
	@FindBy(xpath = "//input[@aria-label='Barrett-Jackson Value']")
	WebElement bjValue;
	public WebElement enterBjValue() {
		return bjValue;
	}
	
	//TaxType
	@FindBy(xpath ="//select[@aria-label='Tax Type']")
	WebElement taxType;
	public WebElement selectTaxType() {
		Select taxTypeDropdown = new Select(taxType);
		taxTypeDropdown.selectByValue("1"); // 1-> ALL, 4-> BOAT, 3-> MERCHANDISE, 2-> MOTOR VEHICLE, 5-> NON-TAXABLE
		return taxType;
	}
	
	//TitledTo Text Box
	@FindBy(xpath = "//input[@aria-label='Titled To']")
	WebElement titledTo;
	public WebElement enterTitledTo() {
		return titledTo;
	}
	
	//Enter Responsible Account
	@FindBy(xpath = "//input[@aria-label='Responsible Account, Lookup']")
	WebElement responsibleAccount;
	public WebElement enterResponsibleAccount() {
		return responsibleAccount;
	}
	
	//CLick on acc text
	@FindBy(xpath = "//label[text()='Account']")
	WebElement clickOnAccText;
	public WebElement accText() {
		return clickOnAccText;
	}
	
	//Hover on Account Field
	@FindBy(xpath = "//ul[@title='Account']")
	WebElement accField;
	
	//Delete Account
	@FindBy(xpath = "//ul[@title='Account']/li/button[contains(@aria-label,'Delete')]")
	WebElement deleteAcc;
	
	public WebElement deleteAcc() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(accField).build().perform();
		Thread.sleep(2000);
		action.moveToElement(deleteAcc).build().perform();
		Thread.sleep(3000);
		deleteAcc.click();
		return deleteAcc;
	}
	
	//Enter Account
	@FindBy(xpath = "//input[@aria-label='Account, Lookup']")
	WebElement account;
	public WebElement enterAccount() {
		return account;
	}
	
	//Choose Account from look up
	@FindBy(xpath = "//ul[@aria-label='Lookup results']/li/div[2]/span")
	WebElement chooseAcc;
	public WebElement chooseAccLookUp() {
		return chooseAcc;
	}
	
	//Enter Account Address
	@FindBy(xpath = "//input[@aria-label='Account Address, Lookup']")
	WebElement accountAddress;
	public WebElement enterAccountAddress() {
		return accountAddress;
	}
	
	//Choose Address from look up
	@FindBy(xpath = "//ul[@aria-label='Lookup results']/li")
	WebElement chooseAddress;
	public WebElement chooseAccAddress() {
		return chooseAddress;
	}
	
	//Vehicle
	@FindBy(xpath = "//input[@aria-label='Vehicle, Lookup']")
	WebElement vehicle;
	public WebElement vehicleText() {
		return vehicle;
	}
	
	//New Vehicle
	@FindBy(xpath = "//span[text()='New Vehicle']")
	WebElement newVehicle;
	public WebElement clickOnNewVehicle() {
		return newVehicle;
	}
	
	//Name Field
	@FindBy(xpath = "//label[text()='Account']")
	WebElement moveToAccElement;
	public WebElement moveToAccElement() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToAccElement).perform();
		return moveToAccElement;
	}
	
	//DocumentTab
	@FindBy(xpath="//li[@aria-label='Documentation']")
	WebElement documentationTab;
	public WebElement documentationTab() {
		return documentationTab;
	}
	
	//Add Document
	@FindBy(xpath="//span[text()='Add Document']")
	WebElement addDocument;
	public WebElement addDoc() {
		return addDocument;
	}
	
	//VehDocumentType
	@FindBy(xpath="//select[@id='documentType']")
	WebElement docTypeDropdown;
	public WebElement vehiDocTypeDocument(String vehicleDocType) {
		Select vehicleDropdown = new Select(docTypeDropdown);
		vehicleDropdown.selectByValue(vehicleDocType);
		return docTypeDropdown;
	}
	//Registration Documents
	public WebElement registrationDocuments(String registrationDocType) {
		Select registrationDropdown = new Select(docTypeDropdown);
		registrationDropdown.selectByValue(registrationDocType);	
		return docTypeDropdown;
	}
	
	//vehicleDoc Refresh
	@FindBy(xpath="//section[@aria-label='Vehicle Documents']//span[text()='Refresh']")
	WebElement vehicleDocRefresh;
	public WebElement vehicleDocRefresh() {
		return vehicleDocRefresh;
	}
	
	@FindBy(xpath="//section[@aria-label='Registration Documents']//span[text()='Refresh']")
	WebElement registrationDocRefresh;
	public WebElement registrationDocRefresh() {
		return registrationDocRefresh;
	}
	
	//PhotosTab
	@FindBy(xpath="//li[text()='Photos']")
	WebElement photosTab;
	public WebElement photoTab() {
		return photosTab;
	}
	
	//AddPhoto
	@FindBy(xpath="//button[text()=' + Add Photo ']")
	WebElement addPhoto;
	public WebElement addPhoto() {
		return addPhoto;
	}
	
	//uploadPhoto
	@FindBy(xpath="//input[@type='file']")
	WebElement uploadPhoto;
	public WebElement uploadPhotos() {
		return uploadPhoto;
	}
	
	//uploadbutton
	@FindBy(id = "uploadButton")
	WebElement clickOnUploadButton;
	public WebElement clickOnUploadButton() {
		return clickOnUploadButton;
	}
	
	//cross mark
	@FindBy(xpath = "//button[@aria-label='Close' and @id='refreshbuttoncan']/span[text()='×']")
	WebElement crossMark;
	public WebElement clickOnCrossMark() {
		return crossMark;
	}
	
	//refresh button
	@FindBy(id = "refreshbutton")
	WebElement refreshButton;
	public WebElement refreshButton() {
		return refreshButton;
	}
	
	//Count of photos
	@FindBy(xpath = "//span[@id='allphotosCounts']")
	WebElement photoCount;
	public WebElement photoCount() {
		return photoCount;
	}
	
	//Opportunity products
	@FindBy(xpath = "//li[@aria-label='Products']")
	WebElement opportunityProducts;
	public WebElement opportunityProductsTab() {
		return opportunityProducts;
	}
	
	//+ Add Product
	@FindBy(xpath = "//span[text()='Add product']")
	WebElement addProduct;
	public WebElement addProducts(){
		return addProduct;
	}
	
	//Existing Product
	@FindBy(xpath = "//input[@aria-label='Existing Product, Lookup']")
	WebElement existingProduct;
	public WebElement existingProduct() {
		return existingProduct;
	}
	
	//Invoices Tab
	@FindBy(xpath = "//li[@aria-label='Invoices']")
	WebElement invoices;
	public WebElement invoicesTab() {
		return invoices;
	}
	
	//Generate Invoice
	@FindBy(xpath = "//span[text()='Generate Invoice']")
	WebElement generateInvoice;
	public WebElement generateInvoice() {
		return generateInvoice;
	}
	
	//Overview tab
	@FindBy(xpath = "//li[@aria-label='Overview']")
	WebElement overviewTab;
	public WebElement overviewTab() {
		return overviewTab;
	}
	
	//Bid Limit Envelope 
	@FindBy(xpath="//span[text()='Add Envelope']")
	WebElement addEnvelope;
	public WebElement addEnvelope() {
		return addEnvelope;
	}
	
	//Envelope number
	@FindBy(xpath="//input[@aria-label='Envelope Number']")
	WebElement envelopeNumber;
	public WebElement envelopeNumber() {
		return envelopeNumber;
	}
	
	//Deposit Type
	@FindBy(xpath="//select[@aria-label='Deposit Type']")
	WebElement depositType;
	public WebElement depositType() {
		Select depositTypeDropdown = new Select(depositType);
		depositTypeDropdown.selectByValue("25"); //-1, 142, 25, 371, 1, 2, 62, 63, 64, 65
		return depositType;
	}
	
	//Deposit Amount
	@FindBy(xpath="//input[@aria-label='Deposit Amount']")
	WebElement depositAmount;
	public WebElement depositAmount() {
		return depositAmount;
	}
	
	//Date of Deposit
	@FindBy(xpath="//input[@aria-label='Date of Deposit Date']")
	WebElement dateOfDeposit;
	public WebElement dateOfDeposit() {
		return dateOfDeposit;
	}
	
	//Down Arrow
	@FindBy(xpath="//button[@class='headerIconButton-559']/i[text()='']")
	WebElement downArrow;
	public WebElement downArrow() {
		return downArrow;
	}
	
	//selectDate
	@FindBy(xpath="//table[@class='table-563']/tbody/tr[5]/td[4]")
	WebElement depositDate;
	public WebElement depositDate() {
		return depositDate;
	}
	
	@FindBy(xpath="//label[text()='Payment Number']")
	WebElement paymentNumberLabel;
	public WebElement paymentNumberLabel() {
		return paymentNumberLabel;
	}
	
	//payment number
	@FindBy(xpath="//input[@aria-label='Payment Number']")
	WebElement paymentNumber;
	public WebElement paymentNumber() {
		return paymentNumber;
	}
	
	//ClickOnTick
	@FindBy(xpath="//div[@class='cc-ds-header-buttons-left']")
	WebElement clickOnTick;
	public WebElement clickOnTick() {
		return clickOnTick;
	}
	
	//clickonReturnTypeField
	@FindBy(xpath="//div[@aria-label='Bid Limit Deposits']/div[@aria-label='Data']/div[7]")
	WebElement returnTypeField;
	public WebElement returnTypeField() {
		return returnTypeField;
	}
	
	//ReturnTypeDropdown
	@FindBy(xpath="//button[@aria-label='Toggle Dropdown']")
	WebElement returnTypeDropdown;
	public WebElement returnTypeDropdown() {
		return returnTypeDropdown;
	}
	
	//select from dropdown
	@FindBy(xpath="//div[@class='wj-listbox-item' and @role='option'][3]") //2-At Cashiering, 3-Onsite, 4-Mailing
	WebElement selectReturnType;
	public WebElement selectReturnType() {
		return selectReturnType;
	}
	
	//Absentee Bid card
	//Find Absentees Bids Text
	@FindBy(xpath = "//h3[text()='Absentees Bids']")
	WebElement moveToElementAbsenteeBid;
	public WebElement moveToElementAbsenteeBid() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToElementAbsenteeBid).perform();
		return moveToElementAbsenteeBid;
	}
	
	//New Absentee Bids
	@FindBy(xpath="//span[text()='New Absentee Bids']")
	WebElement newAbsenteeBid;
	public WebElement newAbsenteeBid() {
		return newAbsenteeBid;
	}
	
	//
	@FindBy(xpath="//select[@aria-label='Absentee Bids']")
	WebElement absenteeBidsDropdown;
	public WebElement absenteeBidsDropdown() {
		Select absenteeBidDropdown = new Select(absenteeBidsDropdown);
		absenteeBidDropdown.selectByValue("4"); // 1-Phone, 4-Absentee Representative, 2-Internet
		return absenteeBidsDropdown;
	}
	
	//When Select phone --> lotNumber, contactPhn, AltPhone
	@FindBy(xpath="//input[@aria-label='Lot Number']")
	WebElement lotNumber;
	public WebElement enterLotNumber() {
		return lotNumber;
	}
	@FindBy(xpath="//input[@aria-label='Contact Phone']")
	WebElement contactNumber;
	public WebElement enterContactNumber() {
		return contactNumber;
	}
	@FindBy(xpath="//input[@aria-label='Alternate Phone']")
	WebElement alternateNumber;
	public WebElement enterAlternatePhone() {
		return alternateNumber;
	}
	
	//When select AbsenteeRepresentative --> lotNumber, MaximumBid
	@FindBy(xpath="//input[@aria-label='Maximum Bid']")
	WebElement maximumBid;
	public WebElement enterMaximumBid() {
		return maximumBid;
	}
	
	//SaveandCloseButton
	@FindBy(xpath="//span[text()='Save and Close']")
	WebElement absenteeSaveClose;
	public WebElement absenteeSaveClose() {
		return absenteeSaveClose;
	}
	
	
	@FindBy(xpath="//section[@id='id-23394']//span[text()='Refresh']")
	WebElement invoiceRefresh;
	public WebElement invoiceRefresh() {
		return invoiceRefresh;
	}
	//
	@FindBy(xpath="//div[@aria-label='Press SPACE to select this row.']")
	WebElement firstRow;
	public WebElement firstRow() {
		Actions action = new Actions(driver);
		action.doubleClick(firstRow);
		return firstRow;
	}
	
	//saleDay tab
	@FindBy(xpath="//li[@aria-label='Sale Day']")
	WebElement saleDayTab;
	public WebElement saleDayTab() {
		return saleDayTab;
	}
	
	//SaleDay
	@FindBy(xpath="//input[@aria-label='Offset Time']")
	WebElement offSetTime;
	public WebElement enterOffsetTime() {
		return offSetTime;
	}
	
	// Find Email
	@FindBy(xpath = "//section[@aria-label='Application Information']")
	WebElement moveToElementEvent;
	public WebElement moveToElementEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToElementEvent).perform();
		return moveToElementEvent;
	}
}
