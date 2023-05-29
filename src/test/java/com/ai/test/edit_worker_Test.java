package com.ai.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ai.baselib.baselib;
import com.ai.pages.edit_Worker;
import com.ai.pages.login_page;

public class edit_worker_Test extends baselib{

	@Test (priority = 1)
	public void login_validation() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario6();
	}
	@Test (priority = 2)
	public void Add_new_worker() throws InterruptedException, AWTException {
		edit_Worker ANW= new edit_Worker(driver);
		ANW.scneario1();

	}

	@Test (priority = 3)
	public void Add() throws InterruptedException, AWTException {
		edit_Worker ANW= new edit_Worker(driver);
		ANW.scneario2();

	}}



