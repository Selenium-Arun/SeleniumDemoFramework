package com.openhrm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openhrm.qa.base.TestBase;
import com.openhrm.qa.pages.HomePage;
import com.openhrm.qa.pages.LoginPage;
import com.openhrm.qa.pages.UserMgmt;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	UserMgmt usermgmt;

	Logger logger = LogManager.getLogger(HomePageTest.class);

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		logger.info("Home page Setup Start");
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("Setup finish");
	}

	@Test(priority = 1)
	public void userValidateTest() {
		logger.info("username validation start");
		String userlabel = homepage.userValidate();
		Assert.assertEquals(userlabel, "Welcome Admin", "User label difference");
		logger.info("username validation finish");
	}

	@Test(priority = 2)
	public void admintabClickTest() {
		logger.info("click on admintab");
		usermgmt = homepage.admintabclick();
		logger.info("return user management page");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
