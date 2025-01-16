package testscripts;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreateBusinessOpportunity extends CreateBusinessAcc {
	
	@Test
	void createBusinessOpportunityTest() throws InterruptedException, IOException {
		
		log.info("****Create Personal, Business and Opportunity****");
		
		log.info("****Creating the Business Opportunity****");
		
		ribbonAction.newOpportunity().click();
		Thread.sleep(6000);
		
		fillform.vehicleText().click();
		Thread.sleep(4000);
		
		fillform.clickOnNewVehicle().click();
		Thread.sleep(4000);
		
		log.info("****Create the New Vehicle****");
		
		vehicleform.enterVIN().sendKeys(Keys.ENTER,Keys.ENTER,Keys.ENTER);
		vehicleform.enterVIN().sendKeys(properties.getString("VIN"),Keys.ENTER);
		
		vehicleform.enterYear().sendKeys(Keys.ENTER,Keys.ENTER,Keys.ENTER);
		vehicleform.enterYear().sendKeys(properties.getString("year"),Keys.ENTER);
		
		vehicleform.enterMake().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vehicleform.selectMake().click();
		Thread.sleep(2000);
		
		vehicleform.enterModel().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vehicleform.selectModel().click();
		Thread.sleep(2000);
		
		vehicleform.selectTransType();
		Thread.sleep(2000);
		
		vehicleform.selectTransSpeeds();
		Thread.sleep(2000);
		
		vehicleform.saveVehicle().click();
		Thread.sleep(6000);
		
		log.info("****Create the New Vehicle is Succesfully****");
		
		fillform.selectSaleType();
		Thread.sleep(2000);
		
		fillform.enterOwnerEstimated().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterOwnerEstimated().click();
		fillform.enterOwnerEstimated().sendKeys(properties.getString("ownerEstimatedValue"));
		Thread.sleep(3000);
		
		fillform.enterBjValue().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterBjValue().click();
		fillform.enterBjValue().sendKeys(properties.getString("bjValue"));
		Thread.sleep(3000);
		
		fillform.enterResponsibleAccount().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterResponsibleAccount().click();
		fillform.enterResponsibleAccount().sendKeys(properties.getString("personalFirstName"));
		Thread.sleep(2000);
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
		
		fillform.enterAccountAddress().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterAccountAddress().click();
		fillform.enterAccountAddress().sendKeys(properties.getString("streetAddress"));
		Thread.sleep(2000);
		fillform.enterAccountAddress().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		fillform.enterTitledTo().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterTitledTo().click();
		fillform.enterTitledTo().sendKeys(properties.getString("personalFirstName") + " Business");
		Thread.sleep(2000);
		
		fillform.selectOdometer();
		Thread.sleep(3000);
		
		fillform.enterMileage().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterMileage().sendKeys(properties.getString("mileage"),Keys.ENTER);
		Thread.sleep(3000);
		
		fillform.enterEvent().sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		fillform.enterEvent().sendKeys(properties.getString("event"));
		Thread.sleep(5000);
		fillform.enterEvent().sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		
		fillform.moveToAccElement();
		Thread.sleep(3000);
		
		captureScreenshot("createBusinessOpportunityTest");
		Thread.sleep(2000);
		
		fillform.documentationTab().click();
		Thread.sleep(4000);
		
		HashMap<String, String> vehicleDocs = new HashMap<>();
		vehicleDocs.put("Title Front", 				"C:\\Automation_Photos_Docs\\Title Front.jpg");
		vehicleDocs.put("Title Back", 				"C:\\Automation_Photos_Docs\\Title Back.jpg");
		vehicleDocs.put("Registration", 			"C:\\Automation_Photos_Docs\\Registration.jpg");
//		vehicleDocs.put("NMVITS Report", 			"C:\\Automation_Photos_Docs\\NMVITS Report.jpg");
//		vehicleDocs.put("CarFax", 					"C:\\Automation_Photos_Docs\\CarFax.jpg");
//		vehicleDocs.put("fillform Agreement", 	"C:\\Automation_Photos_Docs\\fillform Agreement.jpeg");
//		vehicleDocs.put("VIN Decode", 				"C:\\Automation_Photos_Docs\\VIN Decode.jpeg");
//		vehicleDocs.put("LIEN Release", 			"C:\\Automation_Photos_Docs\\LIEN Release.jpg");
//		vehicleDocs.put("Power of Attorney", 		"C:\\Automation_Photos_Docs\\Power of Attorney.jpg");
//		vehicleDocs.put("Title Reassignment", 		"C:\\Automation_Photos_Docs\\Title Reassignment.jpeg");
//		vehicleDocs.put("VIN History", 				"C:\\Automation_Photos_Docs\\VIN History.jpeg");
//		vehicleDocs.put("DYNO Sheet", 				"C:\\Automation_Photos_Docs\\DYNO Sheet.jpeg");
		
		for(String vehicleDocType:vehicleDocs.keySet()) {
			
			fillform.addDoc().click();
			Thread.sleep(3000);
			
			driver.switchTo().frame("FullPageWebResource");
			Thread.sleep(2000);
			
			fillform.vehiDocTypeDocument(vehicleDocType.toString());
			Thread.sleep(2000);
			
			createAcc.datePicker().click();
			Thread.sleep(1000);
		
			createAcc.nextArrow().click();Thread.sleep(1000);
			createAcc.nextArrow().click();Thread.sleep(1000);
		
			createAcc.selectDate().click();
			Thread.sleep(2000);
			
			createAcc.browseDoc().sendKeys(vehicleDocs.get(vehicleDocType));
			Thread.sleep(3000);
		
			createAcc.uploadButton().click();
			Thread.sleep(10000);
		
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
		
			fillform.vehicleDocRefresh().click();
			Thread.sleep(4000);
		}
		
		fillform.photoTab().click();
		Thread.sleep(5000);
		
		driver.switchTo().frame("WebResource_uploadphotos");
		
		fillform.addPhoto().click();
		Thread.sleep(3000);
		
		List<String> filePaths = Arrays.asList(
		"C:\\Automation_Photos_Docs\\1Front3by4th.jpg",
		"C:\\Automation_Photos_Docs\\2Rear3by4th.png.png",
		"C:\\Automation_Photos_Docs\\3SideView.jpeg.jpeg",
		"C:\\Automation_Photos_Docs\\4InteriorView.jpg",
		"C:\\Automation_Photos_Docs\\5EngineView.jpg",
		"C:\\Automation_Photos_Docs\\6VINNumber.jpg");
		
		String paths = String.join("\n", filePaths);
		
		fillform.uploadPhotos().sendKeys(paths);
		
		fillform.clickOnUploadButton().click();
		Thread.sleep(8000);
		
		fillform.clickOnCrossMark().click();
		Thread.sleep(4000);
		
		fillform.refreshButton().click();
		Thread.sleep(3000);
		
		fillform.photoCount().getText();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		log.info("****Creating the Business Opportunity is Saved Successfully****");
		
		log.info("****Create Personal, Business and Opportunity is done****");
	}
}
