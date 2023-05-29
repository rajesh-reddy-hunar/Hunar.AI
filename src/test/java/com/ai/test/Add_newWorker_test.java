package com.ai.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ai.baselib.baselib;
import com.ai.pages.Add_New_Workers;
import com.ai.pages.login_page;

public class Add_newWorker_test extends baselib {

	@Test (priority = 1)
	public void login_validation() throws InterruptedException {
		login_page LP= new login_page(driver);
		LP.scneario6();
	}
	@Test (priority = 2)
	public void Add_new_worker() throws InterruptedException, AWTException {
		Add_New_Workers ANW= new Add_New_Workers(driver);
		ANW.scneario1();

	}

	@Test (priority = 3)
	public void Add() throws InterruptedException, AWTException {
		Add_New_Workers ANW= new Add_New_Workers(driver);
		ANW.scneario2();

	}}




























