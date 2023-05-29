package com.ai.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ai.baselib.baselib;
import com.ai.pages.Generate_QR;
import com.ai.pages.login_page;

public class Generate_QR_Test extends baselib{

	@Test (priority = 1)
	public void login_validation() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario6();
	}

	@Test (priority = 2)
	public void QR() throws InterruptedException, AWTException {
		Generate_QR GQ = new Generate_QR(driver);
		GQ.scneario1();

	}
}
