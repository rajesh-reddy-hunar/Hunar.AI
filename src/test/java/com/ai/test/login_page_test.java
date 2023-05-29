package com.ai.test;

import org.testng.annotations.Test;
import com.ai.baselib.baselib;
import com.ai.pages.login_page;

//public class login_page_test {

public class login_page_test extends baselib {
	@Test (priority = 1)
	public void login_validation() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario1();
	}
	@Test (priority = 2)
	public void Invalid_login() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario2();
	}
	@Test (priority = 3)
	public void emali_error_check() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario3();
	}
	@Test (priority = 4)
	public void password_error_check() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario4();
	}
	@Test (priority = 5)
	public void wrong_email() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario5();
	}
	@Test (priority = 6)
	public void valid_credientials() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario6();
	}
}
