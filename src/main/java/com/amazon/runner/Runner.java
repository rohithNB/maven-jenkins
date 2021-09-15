package com.amazon.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.pageobject.Header;
import com.amazon.pageobject.LoginPage;
import com.amazon.reusablecomponent.ReusableComponents;
import com.amazon.reusablecomponent.ReusableMethods;
import com.amazon.utility.ExtentReportGenerator;
import com.amazon.utility.OpenReport;
import com.amazon.utility.PropertyFileReader;
import com.amazon.utility.SendEmail;
import com.amazon.utility.dataDriven;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Runner extends ReusableComponents{
	

	private dataDriven dd;
	ExtentReports reporter;
	static ExtentTest test;
	public static Logger log =  (Logger) LogManager.getLogger(Runner.class.getName());
	private Header h;
	private LoginPage l;
	WebDriver driver; 

	public Runner() throws IOException {
		super();
		driver = ReusableComponents.initializeDriver();
		h = new Header(driver);
		dd = new dataDriven();
		l = new LoginPage(driver);

	}
	@BeforeSuite
	public void suiteSetUp() {
		
		reporter = ExtentReportGenerator.generateReport();
		log.info("Test Suite setup is Complete");
		
	}
	
	@BeforeTest
	public void homePage() throws IOException {
		
		driver.manage().window().maximize();
		ReusableMethods.getURL(driver);
		

	}
	
	//Header Test
	
//	@Test (priority = 0)
//	public void BestSeller() throws IOException {
//		test = reporter.createTest("Header Test");
//		h.getBestSeller().click();
//		if(driver.getTitle().contains("Bestsellersssss")) {
//			log.info("BestSeller Located");
//			
//			//test.pass("BestSeller Located");
//		}
//		else {
//			//test.fail("BestSeller not Located");
//			log.error("BestSeller not Found!!");
//			Assert.assertTrue(false);
//
//		}
//	}
	
	@Test (priority = 1)
	public void Mobiles() {
		h.getMobiles().click();
		if(driver.getTitle().contains("Mobile Phones")) {
			log.info("Mobiles Located");
			//test.pass("Mobiles Located");
		}
		else {
			//test.fail("Mobile not Located");
			log.error("Mobiles not Found!!");
			Assert.assertTrue(false);

		}
	}
	
	@Test (priority = 2)
	public void AmazonPay() {
		h.getAmazonPay().click();
		if(driver.getTitle().contains("Amazon Pay")) {
			log.info("Amazon Pay Located");
			//test.pass("Amazon Pay Located");
		}
		else {
			//test.fail("Amazon Pay not Located");
			log.error("Amazon Pay not Found!!");
			Assert.assertTrue(false);

		}
	}

	@Test (priority = 3)
	public void Fashion() {
		h.getFashion().click();
		if(driver.getTitle().contains("Fashion")) {
			log.info("Fashion Located");
			//test.pass("Fashion Located");
		}
		else {
			//test.fail("Fashion not Located");
			log.error("Fashion not Found!!");
			Assert.assertTrue(false);

		}
	}
	
	@Test (priority = 4)
	public void Electronics() {
		h.getElectronics().click();
		if(driver.getTitle().contains("Electronics")) {
			log.info("Electronics Located");
			//test.pass("Electronics Located");
		}
		else {
			//test.fail("Electronics not Located");
			log.error("Electronics not Found!!");
			Assert.assertTrue(false);

		}
	}
	
	@Test (priority = 5)
	public void Prime() {
		h.getPrime().click();
		if(driver.getTitle().contains("Prime")) {
			log.info("Prime Located");
			//test.pass("Prime Located");
		}
		else {
			//test.fail("Prime not Located");
			log.error("Prime not Found!!");
			Assert.assertTrue(false);

		}
	}
	
	@Test (priority = 6)
	public void CustomerService() {
		h.getCustomerService().click();
		if(driver.getTitle().contains("Help")) {
			log.info("Customer Service Pay Located");
			//test.pass("Customer Service Pay Located");
		}
		else {
			//test.fail("Customer Service not Located");
			log.error("CustomerService not Found!!");
			Assert.assertTrue(false);

		}
	}
	
	@Test (priority = 7)
	public void NewReleases() {
		h.getNewReleases().click();
		if(driver.getTitle().contains("New Releases")) {
			log.info("New Releases Located");
			//test.pass("New Releases Located");
		}
		else {
			//test.fail("New Releases not Located");
			log.error("NewReleases not Found!!");
			Assert.assertTrue(false);

		}
	}
	
	//SEARCHBOX TEST
	@Test(priority = 9)
	public void searchSetUp() {

		test = reporter.createTest("SearchBox Test");
	}
	
	@Test(priority = 10,dataProvider="getSearchData")
	public void SearchBox(String search) {
		h.getSearchBox().click();
		h.getSearchBox().sendKeys(search);
		h.getSearchBox().sendKeys(Keys.ENTER);
		if(driver.getTitle().contains(search)) {
			log.info(search+" Searched");
		}
		else {
			log.error(search+" Error");
			Assert.assertTrue(false);
		}
		//test.pass(search+" Searched");
		h.getSearchBox().clear();
	}
	
	//Login Test
	@Test(priority = 12)
	public void OpenLoginPage() {
		test = reporter.createTest("Login Test");
		h.getLoginButton().click();
	}
	
//	@Test(priority = 13,dataProvider="getLoginData") 
//	public void loginTest(String email, String pass) {
//		
//		l.getEmailID().sendKeys(email);
//		log.info("Username Entered");
//		l.getContinue().click();		
//		l.getPassword().sendKeys(pass);
//		log.info("Password Entered");
//		//l.getSignin().click();
//		//test.pass("Login Pass");
//	}
	
	@AfterMethod
	public static void getResult(ITestResult result) {
	if (result.getStatus() == ITestResult.FAILURE) {
	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +  "Test case FAILED due to below issues:",
	ExtentColor.RED));
	test.fail(result.getThrowable());
	} else if (result.getStatus() == ITestResult.SUCCESS) {
	test.log(Status.PASS, MarkupHelper.createLabel(result.getName() +  "Test Case PASSED", ExtentColor.GREEN));
	} else {
	test.log(Status.SKIP,
	MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
	test.skip(result.getThrowable());
	}
	}
	
	@AfterTest
	public void closeDriver() throws InterruptedException, IOException {
		driver.close();
	}
	
	@AfterSuite
	public void endSuite() throws InterruptedException, IOException {
		reporter.flush();
		String report = OpenReport.openReport().getCanonicalPath();
		System.out.println(report);
		ReusableComponents.initializeDriver();
		driver.get(report);
	}
	
	@DataProvider
	public Object[][] getSearchData() throws IOException {
		ArrayList<String> h = dd.getData("TestData","Amazon");
		int ct = h.size();
		Object[][] data = new Object[ct-1][1];
		
		for(int i = 1; i < ct ; i++) {
			
			data[i-1][0] = h.get(i);
		}
		return data;
		
	}
	
	@DataProvider
	public Object[][] getLoginData() throws IOException {
		Object[][] data = new Object[1][2];
		data[0][0] = PropertyFileReader.loadFile().getProperty("id");
		data [0][1] = PropertyFileReader.loadFile().getProperty("pass");
		
		return data;
	}
	
//	@DataProvider
//	public Object[][] getHeaderData() {
//		Object[][] data = new Object[8][1];
//		
//		data[0][0] = h.getBestSeller();
//		data[1][0] = h.getMobiles();
//		data[2][0] = h.getFashion();
//		data[3][0] = h.getElectronics();
//		data[4][0] = h.getAmazonPay();
//		data[5][0] = h.getPrime();
//		data[6][0] = h.getCustomerService();
//		data[7][0] = h.getNewReleases();
//		
//		return data;
//
//	}	

}
