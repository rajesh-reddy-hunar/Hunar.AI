package com.ai.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_refferel_Campaign {

	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Listing_menu;

	@FindBy(xpath="//div[1]/div[2]/ul[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement click_on_Leads;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement click_on_Add_New_Worker;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]")
	private WebElement click_on_Create_refferel_campaign;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement enter_campaign_Name;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/button[1]")
	private WebElement Click_on_Save;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_Contact_Name;

	@FindBy(xpath="//div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	private WebElement enter_mobile_Number;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_Type_Dropdown;

	@FindBy(xpath="//html/body/div[5]/div/ul/li[2]/span")
	private WebElement select_Lead;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/span[1]")
	private WebElement click_on_Add_Contacts ;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/span[1]")
	private WebElement click_on_delete;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/button[1]")
	private WebElement Click_on_Save_btn;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/a[1]")
	private WebElement Click_on_Download_CSV;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")
	private WebElement click_on_Drag_and_Drop_CSV;

	@FindBy(xpath="//*[@id=\"single-entity-edit-drawer\"]/div[3]/div/div[3]/div/div/div[1]/a")
	private WebElement click_on_Save_and_Close;


	public WebDriver driver;
	public Create_refferel_Campaign(WebDriver driver) 
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

		click_on_Create_refferel_campaign.click();
		System.out.println("");
		Thread.sleep(3000);

		enter_campaign_Name.sendKeys("TESTING");
		System.out.println("enter campaign name");
		Thread.sleep(3000);

		Click_on_Save.click();
		System.out.println("click on Save btn");
		Thread.sleep(3000);

		Enter_Contact_Name.sendKeys("Rajesh REDDY");
		System.out.println("Enter Contact name");
		Thread.sleep(3000);

		enter_mobile_Number.sendKeys("9010870560");
		System.out.println("Enter Mobile Number");
		Thread.sleep(3000);

		click_on_Type_Dropdown.click();
		System.out.println("Click on Type Dropdown");
		Thread.sleep(2000);



		//click_on_Type_Dropdown.sendKeys(Keys.ARROW_DOWN);


		//click_on_Type_Dropdown.sendKeys(Keys.ENTER);


		select_Lead.click();
		System.out.println("Select Lead from dropdown list");
		Thread.sleep(3000);

		click_on_Add_Contacts.click();
		System.out.println("Now again click on Add Contacts");
		Thread.sleep(3000);

		click_on_delete.click();
		System.out.println("Delete the New Contact which was in blank state");
		Thread.sleep(3000);

		Click_on_Save_btn.click();
		System.out.println("Click on Save & Proceed btn");
		Thread.sleep(3000);

		Enter_Contact_Name.sendKeys("Rajesh REDDY");
		System.out.println("Enter Contact name");
		Thread.sleep(3000);

		enter_mobile_Number.sendKeys("9010870560");
		System.out.println("Enter Mobile Number");
		Thread.sleep(3000);

		click_on_Type_Dropdown.click();
		System.out.println("Click on Type Dropdown");
		Thread.sleep(10000);
		//
		click_on_Type_Dropdown.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		//	click_on_Type_Dropdown.sendKeys(Keys.ENTER);

		select_Lead.click();
		System.out.println("Select Lead from dropdown list");
		Thread.sleep(3000);

		Click_on_Save_btn.click();
		System.out.println("Click on Save & Proceed btn");
		Thread.sleep(3000);

		Click_on_Download_CSV.click();
		System.out.println("click on Download CSV");
		Thread.sleep(3000);

		click_on_Drag_and_Drop_CSV.click();
		System.out.println("Click on drage &Drop CSV");
		Thread.sleep(3000);

		System.out.println("Click on the upload CSV button");
		String filePath = "\"C:\\Users\\rajesh reddy\\OneDrive - Nickelfox\\Desktop\\bulk-workers-template (4).csv\"";

		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		//imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(50);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Document uploaded successfully");
		Thread.sleep(10000);


		click_on_Save_and_Close.click();
		System.out.println("CLick on Save/Skip and CLose");
		Thread.sleep(3000);


	}

}
