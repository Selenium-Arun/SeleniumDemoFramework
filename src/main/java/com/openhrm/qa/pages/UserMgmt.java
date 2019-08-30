package com.openhrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.openhrm.qa.base.TestBase;

public class UserMgmt extends TestBase {

	@FindBy (id = "btnAdd")
	WebElement add_btn;
	
	@FindBy (id = "systemUser_employeeName_empName")
	WebElement emp_name;
	
	@FindBy (id = "systemUser_userName")
	WebElement usr_name;
	
	@FindBy (id = "systemUser_status")
	WebElement status;
	
	@FindBy (xpath = "//*[@id='systemUser_password']")
	WebElement password;
	
	@FindBy (id = "systemUser_confirmPassword")
	WebElement confrm_password;
	
	@FindBy (id = "btnSave")
	WebElement save_btn;
	
	public void createUser() {
		
	}
	
}
