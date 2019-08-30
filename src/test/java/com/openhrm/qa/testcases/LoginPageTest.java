	package com.openhrm.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.openhrm.qa.base.TestBase;
import com.openhrm.qa.pages.HomePage;
import com.openhrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	Logger logger = LogManager.getLogger(LoginPageTest.class);
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		logger.info("Login page test setup start");
		initialization();
		loginpage = new LoginPage();
		logger.info("setup complete");
	}
   @Test(priority = 1)
	public void loginpageTitleTest() {
	   logger.info("Validate Login Page title");
		assertEquals(loginpage.validatetitle(), "OrangeHRM", "Title Does Not Match");
		logger.info("Login page title validated");
	}
   
   @Test(priority =2)
   public void loginpagelogoTest() {
	   SoftAssert softassert = new SoftAssert();
	   logger.info("Validate Login Page Logo");
	   softassert.assertTrue(loginpage.validateLogo());
	   logger.info("Login Page Logo validated");
	   softassert.assertAll();
   }
   @Test(priority = 3)
   public void loginTest() {
	   
	   logger.info("username password provide");
	   homepage =  loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   logger.info("Login successful");
   }

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
