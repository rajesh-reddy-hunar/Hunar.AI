package com.ai.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ai.baselib.baselib;
import com.ai.pages.Create_refferel_Campaign;
import com.ai.pages.login_page;

public class Create_refferal_Campaign_test extends baselib{

	@Test (priority = 1)
	public void login_validation() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario6();
	}
	@Test (priority = 2)
	public void Refferal_Test() throws InterruptedException, AWTException {
		Create_refferel_Campaign CRG = new Create_refferel_Campaign(driver);
		CRG.scneario1();

	}
}