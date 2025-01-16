package testscripts;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import testbase.BaseClass;

public class CreatePersonalBidderOpportunity extends CreatePersonalAcc{
	
	@Test
	void createPersonalBidderTest() throws InterruptedException, IOException {
		
//		ribbonAction.newBidder().click();
//		Thread.sleep(6000);
		
		signin.opportunitiesDropdown().click();
		Thread.sleep(1000);
		signin.selectBidders().click();
		Thread.sleep(10000);
		ribbonAction.startBidder().click();
		Thread.sleep(7000);
		
		fillform.enterResponsibleAccount().clear();
		fillform.enterResponsibleAccount().click();
		fillform.enterResponsibleAccount().sendKeys(properties.getString("personalFirstName"));
		Thread.sleep(4000);
		fillform.enterResponsibleAccount().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		fillform.enterEvent().sendKeys(Keys.ENTER);
		//fillform.enterEvent().sendKeys(properties.getString("event"));
		fillform.enterEvent().sendKeys("Scottsdale Fall 2024");
		Thread.sleep(4000);
		fillform.enterEvent().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		fillform.selectBidderPackage().sendKeys(Keys.ENTER,Keys.ENTER,Keys.ENTER);
		fillform.selectBidderPackage().sendKeys(properties.getString("bidderPackageType"));
		Thread.sleep(4000);
		fillform.selectBidderPackage().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		fillform.bidLimitType();
		Thread.sleep(2000);
		
		fillform.bidLimitValue().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.bidLimitValue().sendKeys(properties.getString("bidLimitValue"));
		Thread.sleep(2000);
	
		fillform.bidLimitEstimated().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.bidLimitEstimated().sendKeys(properties.getString("bidLimitEstimated"));
		Thread.sleep(2000);
		
		fillform.mailingAddress().click();
		fillform.mailingAddress().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		fillform.chooseAddressLookUp().click();
		Thread.sleep(3000);
		
		fillform.vehicleTitlingAddress().click();
		fillform.vehicleTitlingAddress().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		fillform.chooseAddressLookUp().click();
		Thread.sleep(3000);
		
//		fillform.titlePaperworkAddress().click();
//		fillform.titlePaperworkAddress().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		fillform.chooseAddressLookUp().click();
//		Thread.sleep(3000);
//		
//		fillform.biddingCollateralAddress().click();
//		fillform.biddingCollateralAddress().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		fillform.chooseAddressLookUp().click();
//		Thread.sleep(3000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(10000);
		
		//Bid Limit Deposit Card
		
//		fillform.addEnvelope().click();
//		Thread.sleep(4000);
//		
//		fillform.envelopeNumber().click();
//		Thread.sleep(1000);
//		fillform.envelopeNumber().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//		fillform.envelopeNumber().sendKeys(properties.getString("envelopeNumber"));
//		Thread.sleep(2000);
//		
//		fillform.depositType();
//		Thread.sleep(2000);
//		
//		fillform.depositAmount().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//		Thread.sleep(1000);
//		fillform.depositAmount().sendKeys(properties.getString("depositAmount"));
//		Thread.sleep(2000);
//		
//		fillform.dateOfDeposit().click();
//		Thread.sleep(1000);
//		
//		fillform.paymentNumberLabel().click();
//		Thread.sleep(1000);
//		
////		fillform.depositDate().click();
////		Thread.sleep(1000);
//		
//		fillform.paymentNumber().sendKeys(properties.getString("paymentNumber"));
//		Thread.sleep(2000);
//		
//		ribbonAction.saveButton().click();
//		Thread.sleep(4000);
//		
//		ribbonAction.saveCloseButton().click();
//		Thread.sleep(5000);
//		
//		fillform.clickOnTick().click();
//		Thread.sleep(3000);
//		
//		fillform.returnTypeField().click();
//		Thread.sleep(2000);
//		
//		fillform.returnTypeDropdown().click();
//		Thread.sleep(2000);
//		
////		driver.switchTo().frame("ClientApiFrame_id-16443");
////		Thread.sleep(3000);
//		
//		fillform.selectReturnType().click();
//		Thread.sleep(3000);
//		
//		//Absentee Bid Card
//		
//		fillform.moveToElementAbsenteeBid();
//		Thread.sleep(1000);
//		
//		fillform.newAbsenteeBid().click();
//		Thread.sleep(5000);
//		
//		fillform.absenteeBidsDropdown();
//		Thread.sleep(3000);
//		
//		fillform.enterLotNumber().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//		Thread.sleep(1000);
//		fillform.enterLotNumber().sendKeys(properties.getString("lotNumber"));
//		Thread.sleep(2000);
//		
////		fillform.enterContactNumber().sendKeys(properties.getString("contactNumber"));
////		Thread.sleep(2000);
////		
////		fillform.enterAlternatePhone().sendKeys(properties.getString("alternateNumber"));
////		Thread.sleep(2000);
//		
//		fillform.enterMaximumBid().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//		Thread.sleep(1000);
//		fillform.enterMaximumBid().sendKeys(properties.getString("maximumBid"));
//		Thread.sleep(2000);
//		
//		fillform.absenteeSaveClose().click();
//		Thread.sleep(5000);
//		
//		ribbonAction.saveButton().click();
//		Thread.sleep(6000);
//		
//		captureScreenshot("createPersonalBidderTest");
//		Thread.sleep(2000);
		
//		fillform.documentationTab().click();
//		Thread.sleep(4000);
//		
//		HashMap<String, String> registrationDocs = new HashMap<>();
//		//registrationDocs.put("Bidder Agreement", 			"C:\\Automation_Photos_Docs\\Bidder Agreement.jpg");
//		//registrationDocs.put("Square Payment Receipt", 		"C:\\Automation_Photos_Docs\\Square Payment Receipt.jpg");
//		registrationDocs.put("Authorization to Bid", 		"C:\\Automation_Photos_Docs\\Authorization to Bid.jpg");
//		registrationDocs.put("Funds Letter", 				"C:\\Automation_Photos_Docs\\Funds Letter.png");
//		//registrationDocs.put("Additional Funds Letter", 	"C:\\Automation_Photos_Docs\\Additional Funds Letter.jpg");
//		registrationDocs.put("Bidding Collateral", 			"C:\\Automation_Photos_Docs\\Bidding Collateral.png");
//		//registrationDocs.put("OFAC", 						"C:\\Automation_Photos_Docs\\OFAC.jpg");
//		
//		for(String registrationDocType:registrationDocs.keySet()) {
//			
//			fillform.addDoc().click();
//			Thread.sleep(3000);
//			
//			driver.switchTo().frame("FullPageWebResource");
//			Thread.sleep(2000);
//			
//			fillform.registrationDocuments(registrationDocType.toString());
//			Thread.sleep(2000);
//			
//			createAcc.datePicker().click();
//			Thread.sleep(1000);
//		
//			createAcc.nextArrow().click();Thread.sleep(1000);
//			createAcc.nextArrow().click();Thread.sleep(1000);
//		
//			createAcc.selectDate().click();
//			Thread.sleep(2000);
//			
//			createAcc.browseDoc().sendKeys(registrationDocs.get(registrationDocType));
//			Thread.sleep(3000);
//		
//			createAcc.uploadButton().click();
//			Thread.sleep(10000);
//		
//			driver.switchTo().alert().accept();
//			Thread.sleep(2000);
//		
//			driver.switchTo().defaultContent();
//			Thread.sleep(2000);
//		
//			fillform.registrationDocRefresh().click();
//			Thread.sleep(4000);
//		}
//		
//		fillform.opportunityProductsTab().click();
//		Thread.sleep(4000);
//		
//		fillform.addProducts().click();
//		Thread.sleep(6000);
//		
//		fillform.existingProduct().click();
//		Thread.sleep(1000);
//		fillform.existingProduct().sendKeys(properties.getString("existingProduct"));
//		Thread.sleep(2000);
//		fillform.existingProduct().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		ribbonAction.saveButton().click();
//		Thread.sleep(4000);
//		
//		ribbonAction.saveCloseButton().click();
//		Thread.sleep(4000);
		
		fillform.invoicesTab().click();
		Thread.sleep(5000);
		
//		fillform.invoiceRefresh().click();
//		Thread.sleep(4000);
//		
//		fillform.generateInvoice().click();
//		Thread.sleep(7000);
		
		fillform.firstRow();
		Thread.sleep(5000);
		
//		ribbonAction.saveButton().click();
//		Thread.sleep(3000);
//		
//		ribbonAction.saveCloseButton().click();
//		Thread.sleep(3000);
		
//		fillform.overviewTab().click();
//		Thread.sleep(5000);
//		
//		captureScreenshot("createPersonalBidderTest");
//		Thread.sleep(3000);
	}
}
