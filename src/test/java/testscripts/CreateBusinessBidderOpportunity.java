package testscripts;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreateBusinessBidderOpportunity extends CreateBusinessAcc {
	
	@Test
	void createBusinessBidderOpportunityTest() throws InterruptedException, IOException {
		
		ribbonAction.newBidder().click();
		Thread.sleep(6000);
		
		fillform.enterResponsibleAccount().clear();
		fillform.enterResponsibleAccount().click();
		fillform.enterResponsibleAccount().sendKeys(properties.getString("personalFirstName"));
		Thread.sleep(4000);
		fillform.enterResponsibleAccount().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		fillform.accText().click();
		
		fillform.deleteAcc();
		Thread.sleep(4000);
		
		fillform.enterAccount().click();
		Thread.sleep(2000);
		fillform.enterAccount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		fillform.chooseAccLookUp().click();
		Thread.sleep(2000);
		
		fillform.enterEvent().sendKeys(Keys.ENTER);
		fillform.enterEvent().sendKeys(properties.getString("event"));
		Thread.sleep(4000);
		fillform.enterEvent().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		fillform.selectBidderPackage().sendKeys(Keys.ENTER);
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
		
		fillform.titlePaperworkAddress().click();
		fillform.titlePaperworkAddress().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		fillform.chooseAddressLookUp().click();
		Thread.sleep(3000);
		
		fillform.biddingCollateralAddress().click();
		fillform.biddingCollateralAddress().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		fillform.chooseAddressLookUp().click();
		Thread.sleep(3000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(10000);
		
		captureScreenshot("createPersonalBidderTest");
		Thread.sleep(2000);
		
		fillform.documentationTab().click();
		Thread.sleep(4000);
		
		HashMap<String, String> registrationDocs = new HashMap<>();
		registrationDocs.put("Bidder Agreement", 			"C:\\Automation_Photos_Docs\\Bidder Agreement.jpg");
		//registrationDocs.put("Square Payment Receipt", 		"C:\\Automation_Photos_Docs\\Square Payment Receipt.jpg");
		registrationDocs.put("Authorization to Bid", 		"C:\\Automation_Photos_Docs\\Authorization to Bid.jpg");
		//registrationDocs.put("Funds Letter", 				"C:\\Automation_Photos_Docs\\Funds Letter.png");
		registrationDocs.put("Additional Funds Letter", 	"C:\\Automation_Photos_Docs\\Additional Funds Letter.jpg");
		//registrationDocs.put("Bidding Collateral", 			"C:\\Automation_Photos_Docs\\Bidding Collateral.png");
		//registrationDocs.put("OFAC", 						"C:\\Automation_Photos_Docs\\OFAC.jpg");
		
		for(String registrationDocType:registrationDocs.keySet()) {
			
			fillform.addDoc().click();
			Thread.sleep(3000);
			
			driver.switchTo().frame("FullPageWebResource");
			Thread.sleep(2000);
			
			fillform.registrationDocuments(registrationDocType.toString());
			Thread.sleep(2000);
			
			createAcc.datePicker().click();
			Thread.sleep(1000);
		
			createAcc.nextArrow().click();Thread.sleep(1000);
			createAcc.nextArrow().click();Thread.sleep(1000);
		
			createAcc.selectDate().click();
			Thread.sleep(2000);
			
			createAcc.browseDoc().sendKeys(registrationDocs.get(registrationDocType));
			Thread.sleep(3000);
		
			createAcc.uploadButton().click();
			Thread.sleep(10000);
		
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
		
			fillform.registrationDocRefresh().click();
			Thread.sleep(4000);
		}
		
		fillform.opportunityProductsTab().click();
		Thread.sleep(4000);
		
		fillform.addProducts().click();
		Thread.sleep(6000);
		
		fillform.existingProduct().click();
		Thread.sleep(1000);
		fillform.existingProduct().sendKeys(properties.getString("existingProduct"));
		Thread.sleep(2000);
		fillform.existingProduct().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(4000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(4000);
		
		fillform.invoicesTab().click();
		Thread.sleep(5000);
		
		fillform.generateInvoice().click();
		Thread.sleep(5000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(3000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(3000);
		
		fillform.overviewTab().click();
		Thread.sleep(5000);
		
		captureScreenshot("createBusinessBidderOpportunityTest");
		Thread.sleep(3000);
	}
}
