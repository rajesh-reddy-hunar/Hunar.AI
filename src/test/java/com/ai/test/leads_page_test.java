package com.ai.test;

import org.testng.annotations.Test;
import com.ai.baselib.baselib;
import com.ai.pages.leads_page;
import com.ai.pages.login_page;

public class leads_page_test extends baselib{

	@Test (priority = 1)
	public void login_validation() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario6();

	}
	@Test (priority = 2)
	public void leads_page() throws InterruptedException {
		leads_page LP= new leads_page(driver);
		LP.scneario1();

	}
	@Test (priority = 3)
	public void Customize() throws InterruptedException {
		leads_page LP= new leads_page(driver);
		LP.scneario2();
}
	
	@Test (priority = 3)
	public void pagination() throws InterruptedException {
		leads_page LP= new leads_page(driver);
		LP.scneario2();
}
}