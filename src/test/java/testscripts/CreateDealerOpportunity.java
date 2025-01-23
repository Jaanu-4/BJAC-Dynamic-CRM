package testscripts;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreateDealerOpportunity extends CreateDealerAcc {

	@Test
	void createDealerOpportunityTest() throws InterruptedException, IOException {

		ribbonAction.newOpportunity().click();
		Thread.sleep(4000);

		fillform.vehicleText().click();
		Thread.sleep(4000);

		fillform.clickOnNewVehicle().click();
		Thread.sleep(4000);

		vehicleform.enterVIN().sendKeys(Keys.ENTER, Keys.ENTER, Keys.ENTER);
		vehicleform.enterVIN().sendKeys(properties.getString("VIN"), Keys.ENTER);
		Thread.sleep(1000);

		vehicleform.enterYear().sendKeys(Keys.ENTER, Keys.ENTER, Keys.ENTER);
		vehicleform.enterYear().sendKeys(properties.getString("year"), Keys.ENTER);
		Thread.sleep(1000);

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

		fillform.selectSaleType();
		Thread.sleep(2000);

		fillform.enterOwnerEstimated().clear();
		fillform.enterOwnerEstimated().click();
		fillform.enterOwnerEstimated().sendKeys(properties.getString("ownerEstimatedValue"));
		Thread.sleep(3000);

		fillform.enterBjValue().clear();
		fillform.enterBjValue().click();
		fillform.enterBjValue().sendKeys(properties.getString("bjValue"));
		Thread.sleep(3000);

		fillform.enterResponsibleAccount().clear();
		fillform.enterResponsibleAccount().click();
		fillform.enterResponsibleAccount().sendKeys(properties.getString("personalFirstName"));
		Thread.sleep(2000);
		fillform.enterResponsibleAccount().sendKeys(Keys.ENTER);
		Thread.sleep(4000);

		fillform.accText().click();

		fillform.deleteAcc();
		Thread.sleep(4000);

		fillform.enterAccount().click();
		Thread.sleep(2000);
		fillform.enterAccount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		fillform.chooseAccLookUp().click();
		Thread.sleep(2000);

		fillform.enterAccountAddress().clear();
		fillform.enterAccountAddress().click();
		fillform.enterAccountAddress().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		fillform.chooseAccAddress().click();
		Thread.sleep(2000);

		fillform.enterTitledTo().sendKeys(Keys.ENTER, Keys.ENTER, Keys.ENTER);
		fillform.enterTitledTo().click();
		fillform.enterTitledTo().sendKeys(properties.getString("personalFirstName") + " Dealer");
		Thread.sleep(2000);

		fillform.selectOdometer();
		Thread.sleep(3000);

		fillform.enterMileage().sendKeys(Keys.ENTER, Keys.ENTER, Keys.ENTER);
		fillform.enterMileage().sendKeys(properties.getString("mileage"), Keys.ENTER);
		Thread.sleep(3000);

		fillform.moveToElementEvent();
		Thread.sleep(3000);

		fillform.enterEvent().sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		fillform.enterEvent().sendKeys(properties.getString("event"));
		Thread.sleep(4000);
		fillform.enterEvent().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		fillform.saleDayTab().click();
		Thread.sleep(3000);
		
		fillform.enterOffsetTime().sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		fillform.enterOffsetTime().sendKeys(properties.getString("OffsetTime"),Keys.ENTER);
		Thread.sleep(2000);
		
		fillform.overviewTab().click();
		Thread.sleep(6000);
		
		ribbonAction.saveButton().click();
		Thread.sleep(6000);

		fillform.moveToAccElement();
		Thread.sleep(10000);

		captureScreenshot("createDealerOpportunityTest");
		Thread.sleep(2000);

		fillform.documentationTab().click();
		Thread.sleep(4000);

		HashMap<String, String> vehicleDocs = new HashMap<>();
		vehicleDocs.put("Title Front",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\Title Front.jpg");
		vehicleDocs.put("Title Back",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\Title Back.jpg");
		vehicleDocs.put("Registration",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\Registration.jpg");
//		vehicleDocs.put("NMVITS Report",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\NMVITS Report.jpg");
//		vehicleDocs.put("CarFax", 
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\CarFax.jpg");
//		vehicleDocs.put("fillform Agreement",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\FillFormAgreement.jpg");
//		vehicleDocs.put("VIN Decode",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\VIN Decode.jpeg");
//		vehicleDocs.put("LIEN Release",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\LIEN Release.jpg");
//		vehicleDocs.put("Power of Attorney",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\Power of Attorney.jpg");
//		vehicleDocs.put("Title Reassignment",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\Title Reassignment.jpeg");
//		vehicleDocs.put("VIN History",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\VIN History.jpeg");
//		vehicleDocs.put("DYNO Sheet",
//				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\DYNO Sheet.jpeg");

		for (String vehicleDocType : vehicleDocs.keySet()) {

			fillform.addDoc().click();
			Thread.sleep(3000);

			driver.switchTo().frame("FullPageWebResource");
			Thread.sleep(2000);

			fillform.vehiDocTypeDocument(vehicleDocType.toString());
			Thread.sleep(2000);

			createAcc.datePicker().click();
			Thread.sleep(1000);

			createAcc.nextArrow().click();
			Thread.sleep(1000);
			createAcc.nextArrow().click();
			Thread.sleep(1000);

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
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\1Front3by4th.jpg",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\2Rear3by4th.png.png",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\3SideView.jpeg.jpeg",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\4InteriorView.jpg",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\5EngineView.jpg",
				"C:\\Users\\tjahnavi\\eclipse-workspace\\crm\\Automation_Photos_Docs\\6VINNumber.jpg");

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
	}
}
