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

public class Add_New_Workers {

	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Listing_menu;

	@FindBy(xpath="//div[1]/div[2]/ul[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement click_on_Leads;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement click_on_Add_New_Worker;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	private WebElement click_on_Bulkupload;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[3]/a[1]")
	private WebElement click_on_download_csv;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[3]/a[2]")
	private WebElement click_on_Guidelines;

	@FindBy(xpath="//div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")
	private WebElement click_on_UploadCSV;

	@FindBy(xpath="//body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]")
	private WebElement click_on_close;

	@FindBy(xpath="//div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")
	private WebElement click_on_Single_worker;

	@FindBy(xpath="//div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement click_on_Proceed_here_btn;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	private WebElement click_on_Send_on_Whatsapp;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_Name;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	private WebElement enter_mobile_number;

	@FindBy(xpath="//div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement click_on_Gender_dropdown;

	@FindBy(xpath="//*[@id=\":rqq:\"]")
	private WebElement enter_male;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement click_on_male;

	@FindBy(xpath="//div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/input[1]")
	private WebElement click_on_Year_of_birth;

	@FindBy(xpath="//div[2]/div[1]/div[1]/div[1]/div[1]/div[37]/button[1]")
	private WebElement click_on_year;

	@FindBy(xpath="//div[4]/div[3]/div[1]/div[2]/button[2]")
	private WebElement click_on_OK;

	@FindBy(xpath="//div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/input[1]")
	private WebElement Enter_aadhar_number;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[4]/div[6]/div[1]/div[1]/input[1]")
	private WebElement enter_Current_Address;

	@FindBy(xpath="//body/div[@id='single-entity-edit-drawer']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation16 MuiDrawer-paper MuiDrawer-paperAnchorRight css-1ab2xsx']/div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']/div[@id='single-entity-edit-drawer-container']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 MuiGrid-spacing-md-3 css-1d1j9k5']/div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6 css-iol86l']/div[@class='MuiAutocomplete-root MuiAutocomplete-hasPopupIcon css-1l6di18']/div[@class='MuiFormControl-root MuiFormControl-fullWidth MuiTextField-root css-feqhe6']/div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-o2woup']/div[@class='MuiAutocomplete-endAdornment css-2iz2x6']/button[1]//*[name()='svg']")
	private WebElement enter_District;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[4]/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_district;

	@FindBy(xpath="//li[@id=':r5s:-option-5']")
	private WebElement select_district;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[4]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_Education_qualification;

	@FindBy(xpath="//body[1]/div[5]/div[1]/ul[1]/li[6]")
	private WebElement select_education;

	@FindBy(xpath="//body[1]/div[3]/div[3]/div[1]/div[2]/div[4]/div[4]/div[1]/div[1]/div[1]/div[2]/button[2]/*[name()='svg'][1]")
	private WebElement Close_dropdown;

	@FindBy(xpath="//div[2]/div[5]/div[2]/div[1]/div[1]/label[1]/span[1]/input[1]")
	private WebElement Click_on_same_As_current_Address;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement Click_Martial_status_dropdown;

	@FindBy(xpath="//li[@id=':r61:-option-1']")
	private WebElement click_on_Single;

	@FindBy(xpath="//div[1]/div[2]/div[5]/div[2]/div[5]/div[1]/div[1]/input[1]")
	private WebElement enter_email_address;

	@FindBy(xpath="//div[1]/div[2]/div[5]/div[2]/div[6]/div[1]/label[1]/div[1]/div[1]")
	private WebElement upload_imeages;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement preferred_local_language_dropdown;

	@FindBy(xpath="//li[@id=':r64:-option-3']")
	private WebElement selecting_language;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/button[2]/*[name()='svg'][1]")
	private WebElement click_on_Closed_drodown;


	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[8]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement willing_to_move_dropdown;

	@FindBy(xpath="//li[@id=':r66:-option-1']")
	private WebElement click_on_Within_state;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[9]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_Job_roles_dropdown;

	@FindBy(xpath="//li[@id=':r68:-option-1']")
	private WebElement selecting_job;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[9]/div[1]/div[1]/div[1]/div[2]/button[2]/*[name()='svg'][1]")
	private WebElement close_dropdown;

	@FindBy(xpath="//div[5]/div[2]/div[10]/div[1]/div[1]/input[1]")
	private WebElement Enter_current_Salary;

	@FindBy(xpath="//div[2]/div[5]/div[2]/div[11]/div[1]/div[1]/input[1]")
	private WebElement enter_expected_slary;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[12]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement english_profiency;

	@FindBy(xpath="//li[@id=':r6c:-option-1']")
	private WebElement selecting_Intermediate;


	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement selecting_vehical_type;

	@FindBy(xpath="//body[1]/div[5]/div[1]/ul[1]/li[2]")
	private WebElement selecting_cycle;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[14]/div[1]/div[1]/input[1]")
	private WebElement Enter_EPF_number;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/div[1]/div[2]/div[5]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement Click_Years_of_experience;


	@FindBy(xpath="//div[1]/div[2]/div[5]/div[2]/div[16]/label[1]/span[1]/input[1]")
	private WebElement is_differently_Abled_checkbox;

	@FindBy(xpath="//div[1]/div[2]/div[5]/div[2]/div[17]/label[1]/span[1]/input[1]")
	private WebElement skill_certification_available_checkbox; ;

	@FindBy(xpath="//div[2]/div[5]/div[2]/div[18]/label[1]/span[1]/input[1]")
	private WebElement is_double_vaccinated;

	@FindBy(xpath="//div[1]/div[2]/div[6]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_Account_Holders_name;


	@FindBy(xpath="//div[1]/div[2]/div[6]/div[2]/div[3]/div[1]/div[1]/input[1]")
	private WebElement Enter_account_Number;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[6]/div[2]/div[4]/div[1]/div[1]/input[1]")
	private WebElement enter_IFSC_code;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
	private WebElement click_on_Save;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	private WebElement click_on_close1;



	public WebDriver driver;
	public Add_New_Workers(WebDriver driver) 
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

		/*click_on_Add_New_Worker.click();
		System.out.println("click on Add new Worker");
		Thread.sleep(3000);


		click_on_Bulkupload.click();
		System.out.println("CLICK ON BULK UPLOAD");
		Thread.sleep(3000);

		click_on_download_csv.click();
		System.out.println("click on download CSV");
		Thread.sleep(3000);

		click_on_Guidelines.click();
		System.out.println("click on Guidelines");
		Thread.sleep(3000);

		driver.get("https://qualification-module--resplendent-unicorn-271751.netlify.app/company/bluejay-work-11/workers?addBulk");
		Thread.sleep(3000);

		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

		click_on_UploadCSV.click();
		System.out.println("click on Upload CSV");
		Thread.sleep(3000);

		System.out.println("Click on the upload CSV button");
		String filePath = "\"C:\\Users\\rajesh reddy\\OneDrive - Nickelfox\\Desktop\\bulk-workers-template (40).csv\"";

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

		click_on_close.click();
		System.out.println("click on Close button");
		Thread.sleep(3000);*/


		click_on_Add_New_Worker.click();
		System.out.println("click again on Add new Worker");
		Thread.sleep(3000);
	}
	public void scneario2() throws InterruptedException, AWTException {


		click_on_Single_worker.click();
		System.out.println("click on single worker");
		Thread.sleep(3000);

		/*	click_on_Proceed_here_btn.click();
		System.out.println("Without entering anything,click here to proceed");
		Thread.sleep(3000);

		click_on_Send_on_Whatsapp.click();
		System.out.println("without entering any thing, clicking on Send On whatsapp");
		Thread.sleep(3000);
		 */

		Enter_Name.sendKeys("PUTLURI VENAKTA RAJESH REDDY");
		System.out.println("enter full name as per aadhar");
		Thread.sleep(3000);

		enter_mobile_number.sendKeys("9010870560");
		System.out.println("enter Mobile Number");
		Thread.sleep(3000);

		click_on_Send_on_Whatsapp.click();
		System.out.println("clicking on Send On whatsapp");

		click_on_close1.click();
		System.out.println("click on close btn");
		Thread.sleep(5000);

		click_on_Add_New_Worker.click();
		System.out.println("click again on Add new Worker");
		Thread.sleep(3000);

		click_on_Single_worker.click();
		System.out.println("click on single worker");
		Thread.sleep(3000);

		Enter_Name.sendKeys("PUTLURI VENAKTA RAJESH REDDY");
		System.out.println("enter full name as per aadhar");
		Thread.sleep(5000);

		enter_mobile_number.sendKeys("9010870560");
		System.out.println("enter Mobile Number");
		Thread.sleep(3000);

		click_on_Proceed_here_btn.click();
		System.out.println("click here to proceed");
		Thread.sleep(3000);

		click_on_Gender_dropdown.click();
		System.out.println("click on Gender Dropdown");
		Thread.sleep(3000);


		// Simulate pressing the down arrow key
		click_on_Gender_dropdown.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		click_on_Gender_dropdown.sendKeys(Keys.ENTER);



		click_on_male.click();
		System.out.println("click On Male");
		Thread.sleep(3000);

		click_on_Year_of_birth.click();
		System.out.println("click On Year of Birth");
		Thread.sleep(3000);

		click_on_year.click();
		System.out.println("Select Year");
		Thread.sleep(3000);

		click_on_OK.click();
		System.out.println("click on Ok");
		Thread.sleep(3000);

		Enter_aadhar_number.sendKeys("676519328943");
		System.out.println("enter AADHAR number");
		Thread.sleep(3000);

		click_on_Education_qualification.click();
		System.out.println("click on Education Qualification Type dropdown");
		Thread.sleep(3000);

		click_on_Education_qualification.sendKeys(Keys.ARROW_DOWN);
		System.out.println("click on Education Qualification Type");
		Thread.sleep(3000);

		click_on_Education_qualification.sendKeys(Keys.ENTER);


		select_education.click();
		System.out.println("Select edication by clicking on checkbox");
		Thread.sleep(3000);


		Close_dropdown.click();
		System.out.println("click on Close dropdown");
		Thread.sleep(3000);


		//	click_on_Education_qualificatiion.sendKeys(Keys.ARROW_DOWN);
		//	click_on_Education_qualificatiion.sendKeys(Keys.ENTER);


		enter_Current_Address.sendKeys("1-134-1,pamuru,Prakasam District");
		System.out.println("enter Current address");
		Thread.sleep(3000);

		click_on_district.click();
		System.out.println("click on district dropdown");
		Thread.sleep(3000);

		select_district.click();
		System.out.println("Select District");
		Thread.sleep(3000);




		/*// Simulate pressing the down arrow key
		click_on_district.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		click_on_district.sendKeys(Keys.ENTER);*/



		Click_on_same_As_current_Address.click();
		System.out.println("click on same As Current Address check box");
		Thread.sleep(3000);

		Click_Martial_status_dropdown.click();
		System.out.println("click on MArtial Status");
		Thread.sleep(3000);


		// Simulate pressing the down arrow key
		//Click_Martial_status_dropdown.sendKeys(Keys.ARROW_UP);

		// Hit the Enter key to select the option
		//Click_Martial_status_dropdown.sendKeys(Keys.ENTER);

		click_on_Single.click();
		System.out.println("Select Single");
		Thread.sleep(3000);

		enter_email_address.sendKeys("rajesh@hunar.ai");
		System.out.println("enter e-mail Address");
		Thread.sleep(3000);

		upload_imeages.click();
		System.out.println("click on Upload imeage");
		Thread.sleep(3000);

		System.out.println("Click on the upload imeage button");
		String filePath = "\"C:\\Users\\rajesh reddy\\OneDrive - Nickelfox\\Desktop\\7d664a82-eba5-4608-9b7d-3c8ff18a9ab7-image-3h0jyY1lMK4Lq2LC.png\"";

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
		System.out.println("Imeage selected successfully");
		Thread.sleep(10000);



		preferred_local_language_dropdown.click();
		System.out.println("click on Local language dropdown");
		Thread.sleep(3000);

		// Simulate pressing the down arrow key
		//	preferred_local_language_dropdown.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		//preferred_local_language_dropdown.sendKeys(Keys.ENTER);


		selecting_language.click();
		System.out.println("select language");
		Thread.sleep(3000);

		click_on_Closed_drodown.click();
		System.out.println("click on Local language dropdown again");
		Thread.sleep(3000);


		willing_to_move_dropdown.click();
		System.out.println("clciking on willing to move dropdown");
		Thread.sleep(3000);

		// Simulate pressing the down arrow key
		//	willing_to_move_dropdown.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		//	willing_to_move_dropdown.sendKeys(Keys.ENTER);

		click_on_Within_state.click();
		System.out.println("click on with in State");
		Thread.sleep(3000);

		click_on_Job_roles_dropdown.click();
		System.out.println("click on Job Roles Dropdown");
		Thread.sleep(3000);


		// Simulate pressing the down arrow key
		//	click_on_Job_roles_dropdown.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		//	click_on_Job_roles_dropdown.sendKeys(Keys.ENTER);


		selecting_job.click();
		System.out.println("Select Job role");
		Thread.sleep(3000);

		close_dropdown.click();
		Thread.sleep(3000);

		Enter_current_Salary.sendKeys("15000");
		System.out.println("enter current salary");
		Thread.sleep(3000);

		enter_expected_slary.sendKeys("20000");
		System.out.println("enter expected salary");
		Thread.sleep(3000);

		english_profiency.click();
		System.out.println("click on english profiency dropdown");
		Thread.sleep(3000);

		// Simulate pressing the down arrow key
		//english_profiency.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		//english_profiency.sendKeys(Keys.ENTER);


		selecting_Intermediate.click();
		System.out.println("selecting intermediate");
		Thread.sleep(3000);

		Enter_EPF_number.sendKeys("101806305262");
		System.out.println("entering EPF number");
		Thread.sleep(3000);


		Click_Years_of_experience.click();
		System.out.println("click years of experience");
		Thread.sleep(3000);

		is_differently_Abled_checkbox.click();
		System.out.println("click on is differently abled checkbox");
		Thread.sleep(3000);

		skill_certification_available_checkbox.click();
		System.out.println("click on skill certification available checkbox");
		Thread.sleep(3000);

		is_double_vaccinated.click();
		System.out.println("clciking on double vaccinated checkbox");
		Thread.sleep(3000);

		Enter_Account_Holders_name.sendKeys("VENKATA RAJESH REDDY");
		System.out.println("entering Account holder name");
		Thread.sleep(3000);

		Enter_account_Number.sendKeys("919010870560");
		System.out.println("enter account number");
		Thread.sleep(3000);

		enter_IFSC_code.sendKeys("PYTM0123456");
		System.out.println("Entering IFSC Code");
		Thread.sleep(3000);

		click_on_Save.click();
		System.out.println("click On save btn");
		Thread.sleep(3000);


	}

}




