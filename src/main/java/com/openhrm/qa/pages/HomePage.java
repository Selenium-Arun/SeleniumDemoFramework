package com.openhrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openhrm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Object Repository
	@FindBy (xpath = "//a[contains(text(), 'Welcome Admin')]")
	WebElement userlabel;
	
	@FindBy (id = "menu_admin_viewAdminModule")
	WebElement admin_module;

	public HomePage() {
		PageFactory.initElements(driver, this);
	} 
	
	public String userValidate() {
		return userlabel.getText();
	}
	
		
	public UserMgmt admintabclick() {
		admin_module.click();
		return new UserMgmt();
	}
	
	
	

}
