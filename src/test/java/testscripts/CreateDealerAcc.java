package testscripts;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testbase.BaseClass;

public class CreateDealerAcc extends BaseClass {
	
	@Test
	void createDealerAccTest() throws InterruptedException, IOException {
		
		log.info("****Creating the Personal Account with all the Mandatory Fields****");
		
		signin.managementDropdown().click();
		signin.clickOnCustomers().click();
		Thread.sleep(10000);
		
		ribbonAction.newCustomer().click();
		Thread.sleep(6000);
		
		//Create Account
		
		createAcc.dropdownPer();
		Thread.sleep(2000);
		
		createAcc.enterFirstName().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		createAcc.enterFirstName().sendKeys(properties.getString("personalFirstName"));
		Thread.sleep(2000);
		
		createAcc.enterLastName().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		createAcc.enterLastName().sendKeys(properties.getString("personalLastName"));
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(7000);
		
		log.info("****Adding Address for an Account****");
		
		newaddress.clickOnNewAddress().click();
		Thread.sleep(5000);
		
		newaddress.enterStreetAddress().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterStreetAddress().sendKeys(properties.getString("streetAddress"));
		Thread.sleep(2000);
		
		newaddress.enterCountry().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterCountry().sendKeys(properties.getString("country"));
		Thread.sleep(3000);
		newaddress.enterCountry().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		newaddress.enterState().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterState().sendKeys(properties.getString("stateProvince"));
		Thread.sleep(3000);
		newaddress.enterState().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		newaddress.enterCity().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterCity().sendKeys(properties.getString("city"));
		
		newaddress.enterPostalCode().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterPostalCode().sendKeys(properties.getString("postalCode"));
		
		newaddress.enterCounty().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterCounty().sendKeys(properties.getString("county"));
		Thread.sleep(3000);
		newaddress.enterCounty().sendKeys(Keys.ENTER);
		
		newaddress.selectStatus();
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(2000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(5000);
		
		log.info("****Adding Address for an Account is Saved Successfully****");
		
		createAcc.moveToElementPhnNum();
		Thread.sleep(3000);
		
		log.info("****Adding Phone Number for an Account****");
		
		newphone.clickOnNewPhnNumber().click();
		Thread.sleep(5000);
		
		newphone.enterPhnCountry().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newphone.enterPhnCountry().sendKeys(properties.getString("country"));
		Thread.sleep(3000);
		newphone.enterPhnCountry().sendKeys(Keys.ENTER);
		
		newphone.enterAreaCode().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newphone.enterAreaCode().sendKeys(properties.getString("areaCode"),Keys.ENTER);
		Thread.sleep(1000);
		
		newphone.enterNumber().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newphone.enterNumber().sendKeys(properties.getString("number"),Keys.ENTER);
		Thread.sleep(1000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(2000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(5000);
		
		log.info("****Adding Phone Number for an Account is Saved Successfully****");
		
		createAcc.moveToElementEmail();
		Thread.sleep(3000);
		
		log.info("****Adding Email for an Account****");
		
		newmail.clickOnNewMail().click();
		Thread.sleep(5000);
		
		newmail.enterEmail().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newmail.enterEmail().sendKeys(properties.getString("email"));
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(2000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(6000);
		
		log.info("****Adding Email for an Account is Saved Successfully****");
		
		createAcc.documentTab().click();
		Thread.sleep(5000);
		
		HashMap<String, String> docs = new HashMap<>();
		//docs.put("Customer Photo", 		"C:\\Automation_Photos_Docs\\Customer Photo.jpg");
		//docs.put("Trust Documents", 	"C:\\Automation_Photos_Docs\\Trust Document.jpg");
		docs.put("Passport", 			"C:\\Automation_Photos_Docs\\Passport.jpg");
		//docs.put("Insurance", 			"C:\\Automation_Photos_Docs\\Insurance.jpg");
		docs.put("Driver's License", 	"C:\\Automation_Photos_Docs\\Driver's License.jpg");
		
		for(String documentType:docs.keySet()) {
			
			createAcc.clickOnAddDocument().click();
			Thread.sleep(3000);
		
			driver.switchTo().frame("FullPageWebResource");
			Thread.sleep(2000);
		
			createAcc.documentDropdown(documentType.toString());
			Thread.sleep(2000);
		
			createAcc.datePicker().click();
			Thread.sleep(1000);
		
			createAcc.nextArrow().click();Thread.sleep(1000);
			createAcc.nextArrow().click();Thread.sleep(1000);
		
			createAcc.selectDate().click();
			Thread.sleep(2000);
			
			createAcc.browseDoc().sendKeys(docs.get(documentType));
			Thread.sleep(3000);
		
			createAcc.uploadButton().click();
			Thread.sleep(8000);
		
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
		
			createAcc.doRefresh().click();
			Thread.sleep(4000);
		}
		
		//Click on New Customer to create Dealer Acc
		
		ribbonAction.newCustomer().click();
		Thread.sleep(4000);
		
		//Create Account
		
		createAcc.dropdownDea();
		Thread.sleep(2000);
		
		createAcc.enterCompany().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		createAcc.enterCompany().sendKeys(properties.getString("personalFirstName") + " Dealer",Keys.ENTER);
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(7000);
		
		log.info("****Adding Address for a Dealer Account****");
		
		newaddress.clickOnNewAddress().click();
		Thread.sleep(5000);
		
		newaddress.enterStreetAddress().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterStreetAddress().sendKeys(properties.getString("streetAddress"));
		Thread.sleep(2000);
		
		newaddress.enterCountry().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterCountry().sendKeys(properties.getString("country"));
		Thread.sleep(3000);
		newaddress.enterCountry().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		newaddress.enterState().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterState().sendKeys(properties.getString("stateProvince"));
		Thread.sleep(3000);
		newaddress.enterState().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		newaddress.enterCity().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterCity().sendKeys(properties.getString("city"));
		
		newaddress.enterPostalCode().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterPostalCode().sendKeys(properties.getString("postalCode"));
		
		newaddress.enterCounty().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newaddress.enterCounty().sendKeys(properties.getString("county"));
		Thread.sleep(3000);
		newaddress.enterCounty().sendKeys(Keys.ENTER);
		
		newaddress.selectStatus();
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(2000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(5000);
		
		log.info("****Adding Address for a Dealer Account is Saved Successfully****");
		
		createAcc.moveToElementPhnNum();
		Thread.sleep(3000);
		
		log.info("****Adding Phone Number for a Dealer Account****");
		
		newphone.clickOnNewPhnNumber().click();
		Thread.sleep(5000);
		
		newphone.selectPhoneTypeDealer();
		Thread.sleep(2000);
		
		newphone.enterPhnCountry().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newphone.enterPhnCountry().sendKeys(properties.getString("country"));
		Thread.sleep(3000);
		newphone.enterPhnCountry().sendKeys(Keys.ENTER);
		
		newphone.enterAreaCode().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newphone.enterAreaCode().sendKeys(properties.getString("areaCode"),Keys.ENTER);
		Thread.sleep(2000);
		
		newphone.enterNumber().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		newphone.enterNumber().sendKeys(properties.getString("number"),Keys.ENTER);
		Thread.sleep(2000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(2000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(5000);
		
		log.info("****Adding Phone Number for a Dealer Account is Saved Successfully****");
		
		createAcc.documentTab().click();
		Thread.sleep(5000);
		
		HashMap<String, String> dealerDocs = new HashMap<>();
		dealerDocs.put("Dealer License", 				"C:\\Automation_Photos_Docs\\Dealer License.jpg");
		dealerDocs.put("Resale License", 				"C:\\Automation_Photos_Docs\\Resale License.jpg");
//		dealerDocs.put("Operating Agreement", 			"C:\\Automation_Photos_Docs\\Operating Agreement.jpg");
//		dealerDocs.put("Verification of Ownership", 	"C:\\Automation_Photos_Docs\\Verification of Ownership.jpg");
//		dealerDocs.put("Wholesale License", 			"C:\\Automation_Photos_Docs\\Wholesale License.jpg");
		
		for(String deaDocType:dealerDocs.keySet()) {
			
			createAcc.clickOnAddDocument().click();
			Thread.sleep(3000);
		
			driver.switchTo().frame("FullPageWebResource");
			Thread.sleep(2000);
		
			createAcc.documentDropdown(deaDocType.toString());
			Thread.sleep(2000);
		
			createAcc.datePicker().click();
			Thread.sleep(1000);
		
			createAcc.nextArrow().click();Thread.sleep(1000);
			createAcc.nextArrow().click();Thread.sleep(1000);
		
			createAcc.selectDate().click();
			Thread.sleep(2000);
			
			createAcc.browseDoc().sendKeys(dealerDocs.get(deaDocType));
			Thread.sleep(3000);
		
			createAcc.uploadButton().click();
			Thread.sleep(10000);
		
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
		
			createAcc.deaDoRefresh().click();
			Thread.sleep(4000);
		}
		
		log.info("****Relating the Personal Acc to the Dealer Acc****");
		
		createAcc.relatedAccTab().click();
		Thread.sleep(5000);
		
		createAcc.addExistingAcc().click();
		Thread.sleep(3000);
		
		createAcc.selectExistingAcc().click();
		Thread.sleep(3000);
		
		createAcc.addNewButton().click();
		Thread.sleep(3000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(3000);

		captureScreenshot("createDealerAccTest");
		Thread.sleep(2000);
		
		ribbonAction.saveCloseButton().click();
		Thread.sleep(8000);
	
		log.info("****Personal Acc is Related to Dealer Acc****");
	}
}
