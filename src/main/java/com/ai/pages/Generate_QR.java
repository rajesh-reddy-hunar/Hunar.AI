package com.ai.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generate_QR {



	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Listing_menu;

	@FindBy(xpath="//div[1]/div[2]/ul[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement click_on_Leads;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement click_on_Add_New_Worker;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]")
	private WebElement click_on_Generate_QR;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_edit_Btn;

	@FindBy(xpath="//div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement enter_header_text;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_Save;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[3]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_Add_footer_btn;

	@FindBy(xpath="//div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	private WebElement enter_footer;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/a[1]")
	private WebElement click_on_whatsapp;

	@FindBy(xpath="//div[2]/div[3]/div[1]/div[3]/a[2]")
	private WebElement click_on_facebook;

	@FindBy(xpath="//div[2]/div[3]/div[1]/div[3]/a[3]")
	private WebElement click_on_linkedin;

	@FindBy(xpath="//div[2]/div[3]/div[1]/div[3]/button[1]")
	private WebElement click_on_Download;

	@FindBy(xpath="//div[2]/div[3]/div[1]/div[1]/div[1]/button[1]")
	private WebElement click_on_Close;



	public WebDriver driver;
	public Generate_QR(WebDriver driver) 
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void scneario1() throws InterruptedException, AWTException {

		Click_on_Listing_menu.click();
		System.out.println("click on Listing Menu");
		Thread.sleep(3000);

		click_on_Leads.click();
		System.out.println("click on leads from side menu");
		Thread.sleep(3000);

		click_on_Add_New_Worker.click();
		System.out.println("click on Add new Worker");
		Thread.sleep(3000);
		
		click_on_Generate_QR.click();
		System.out.println("Click on Generate QR code");
		Thread.sleep(3000);
		
		click_on_edit_Btn.click();
		System.out.println("Click on Edit Btn");
		Thread.sleep(3000);
		
		enter_header_text.sendKeys("Hunar");
		System.out.println("Enter Header");
		Thread.sleep(3000);
		
		click_on_Save.click();
		System.out.println("Clcik On Save(Tick btn)");
		Thread.sleep(3000);
		
		click_on_Add_footer_btn.click();
		System.out.println("click on Add Footer");
		Thread.sleep(3000);
		
		enter_footer.sendKeys("AI");
		System.out.println("Enter Footer text");
		Thread.sleep(3000);
		
		click_on_whatsapp.click();
		System.out.println("Click On Whats App");
		Thread.sleep(3000);
		
		click_on_facebook.click();
		System.out.println("Clcik On Facebook");
		Thread.sleep(3000);
		
		click_on_linkedin.click();
		System.out.println("Click on LinkedIn");
		Thread.sleep(3000);
		
		click_on_Download.click();
		System.out.println("Click on Download QR");
		Thread.sleep(3000);
		
		click_on_Close.click();
		System.out.println("Click on Close");
		Thread.sleep(3000);
	}


	}



























