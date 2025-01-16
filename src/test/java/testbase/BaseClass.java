package testbase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import pages.AddressPage;
import pages.FillForm;
import pages.MailPage;
import pages.CreateAccPage;
import pages.PhoneNumberPage;
import pages.RibbonAction;
import pages.SignInPage;
import pages.VehicleForm;
import org.apache.commons.io.FileUtils;

public class BaseClass {
	
	public EdgeDriver driver;
	public ResourceBundle properties;
	public  Logger log;
	public SignInPage signin;
	public CreateAccPage createAcc;
	public AddressPage newaddress;
	public PhoneNumberPage newphone;
	public MailPage newmail;
	public RibbonAction ribbonAction;
	public FillForm fillform;
	public VehicleForm vehicleform;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		log = LogManager.getLogger(this.getClass());
		properties=ResourceBundle.getBundle("config");

		driver = new EdgeDriver();
		driver.get(properties.getString("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		signin = new SignInPage(driver);
		createAcc = new CreateAccPage(driver);
		newaddress = new AddressPage(driver);
		newphone = new PhoneNumberPage(driver);
		newmail = new MailPage(driver);
		ribbonAction = new RibbonAction(driver);
		fillform = new FillForm(driver);
		vehicleform = new VehicleForm(driver);
		
		signin.microsoftMail().sendKeys(properties.getString("microsoftMail"),Keys.ENTER);
		Thread.sleep(2000);
		signin.password().sendKeys(properties.getString("password"),Keys.ENTER);
		Thread.sleep(2000);
		signin.staySignIn().click();
		Thread.sleep(12000);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.body.style.zoom='67%'");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreenshot(String tName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/screenshots/"+tName+".png");
		FileUtils.copyFile(source, target);		
	}		
}
	
