package com.ai.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ai.baselib.baselib;
import com.ai.pages.Leads_filters;
import com.ai.pages.leads_page;
public class Leads_filters_test extends baselib{

	@Test (priority = 1)
	public void login_validation() throws InterruptedException, AWTException {
		Leads_filters LP= new Leads_filters(driver);
		LP.scneario1();

	}
	@Test (priority = 8)
	public void Customize() throws InterruptedException {
		leads_page LP= new leads_page(driver);
		LP.scneario2();
	}


	@Test (priority = 2)
	public void Full_name_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario2();
	}

	@Test (priority = 3)
	public void Mobile_number_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario3();
	}



	@Test (priority = 4)
	public void Gender_filter() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario4();
	}



	@Test (priority = 5)
	public void Education_Qualification_filter() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario5();
	}

	@Test (priority = 6)
	public void Created_On_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario6();
	}

	@Test (priority = 7)
	public void Updated_on_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario7();
	}



	@Test (priority = 9)
	public void English_proficiency_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario8();
	}

	@Test (priority = 10)
	public void Current_Address_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario9();
	}


	@Test (priority = 11)
	public void Current_state_filters() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario10();
	}


	@Test (priority = 12)
	public void Current_District_filter() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario11();
	}


	@Test (priority = 13)
	public void Years_of_Experience_filter() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario12();
	}

	@Test (priority = 14)
	public void Job_roles_filter() throws InterruptedException, AWTException {
		Leads_filters LF= new Leads_filters(driver);
		LF.scneario13();
	}




}







































































