package com.openhrm.qa.util;

import com.openhrm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT= 10;
	
	
	public void switchtoFrame() {
		driver.switchTo().frame("abc");
	}

}
