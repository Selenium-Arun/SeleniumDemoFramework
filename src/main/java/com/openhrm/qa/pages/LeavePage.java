package com.openhrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.openhrm.qa.base.TestBase;

public class LeavePage extends TestBase {

	@FindBy (id = "menu_leave_viewLeaveModule")
	WebElement leave_module;
	
}
