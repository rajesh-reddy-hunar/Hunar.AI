package com.ai.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class leads_page {

	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Listing_menu;

	@FindBy(xpath="//div[1]/div[2]/ul[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement click_on_Leads;

	@FindBy(xpath="//div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_Text_in_searchbox;

	@FindBy(xpath="//div/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	private WebElement click_on_Checkbox;

	@FindBy(xpath="//main/div/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/span")
	private WebElement click_on_blacklist;

	@FindBy(xpath="/html/body/div[3]/div[3]/div/div[2]/button[1]")
	private WebElement click_on_cancel_Btn;

	@FindBy(xpath="//button[contains(text(),'SURE')]")
	private WebElement click_on_Sure_btn;

	@FindBy(xpath="//span[contains(text(),'Customize')]")
	private WebElement click_on_Customize;

	@FindBy(xpath="//div[1]/div[3]/div[1]/div[3]/label[1]/span[1]/input[1]")
	private WebElement Mobile_number_checkbox;

	@FindBy(xpath="//*[@id=\"gender\"]")
	private WebElement gender_checkbox;

	@FindBy(xpath="//*[@id=\"educationalQualificationType\"]")
	private WebElement Education_qualification_checkbox;

	@FindBy(xpath="//*[@id=\"englishProficiency\"]")
	private WebElement English_proficiency_checkbox;

	@FindBy(xpath="//*[@id=\"workerStatus\"]")
	private WebElement WOrker_Status_checkbox;

	@FindBy(xpath="//*[@id=\"currentAddress\"]")
	private WebElement Current_address_checkbox;

	@FindBy(xpath="//*[@id=\"currentState\"]")
	private WebElement current_State_checkbox;

	@FindBy(xpath="//*[@id=\"currentDistrict\"]")
	private WebElement Current_district_checkbox;

	@FindBy(xpath="//*[@id=\"yearsOfExperience\"]")
	private WebElement Year_of_Experience_checkbox;

	@FindBy(xpath="//*[@id=\"jobRoles\"]")
	private WebElement Job_roles_checkbox;

	@FindBy(xpath="//*[@id=\"hasSkillCertification\"]")
	private WebElement Skill_Certification_checkbox ;

	@FindBy(xpath="//*[@id=\"otherDetails.currentSalary\"]")
	private WebElement Current_salary_checkbox;

	@FindBy(xpath="//*[@id=\"otherDetails.expectedSalary\"]")
	private WebElement expectedsalary_checkbox;

	@FindBy(xpath="//*[@id=\"preferredLanguages\"]")
	private WebElement Preferredlanguages_checkbox;

	@FindBy(xpath="//*[@id=\"otherDetails.email\"]")
	private WebElement Email_checkbox;

	@FindBy(xpath="//*[@id=\"maritalStatus\"]")
	private WebElement Martialstatus_checkbox;

	@FindBy(xpath="//*[@id=\"permanentAddress\"]")
	private WebElement Premanent_address_checkbox;

	@FindBy(xpath="//*[@id=\"permanentState\"]")
	private WebElement Premanent_State_checkbox;

	@FindBy(xpath="//*[@id=\"permanentDistrict\"]")
	private WebElement premanentdistrict_checkbox;

	@FindBy(xpath="//*[@id=\"ownedVehicle\"]")
	private WebElement Owned_vehical_checkbox;

	@FindBy(xpath="//*[@id=\"otherDetails.willingToMove\"]")
	private WebElement Willing_to_move_checkbox;

	@FindBy(xpath="//*[@id=\"isDoubleVaccinated\"]")
	private WebElement is_Double_vaccinated_checkbox;

	@FindBy(xpath="//*[@id=\"bankDetailsAvailable\"]")
	private WebElement bank_details_available_checkbox;

	@FindBy(xpath="//*[@id=\"aadhaarDetails.isAadhaarVerified\"]")
	private WebElement Is_aadhar_verified_checkbox;

	@FindBy(xpath="//*[@id=\"isBankAccountVerified\"]")
	private WebElement is_bank_Account_Verified_checkbox;

	@FindBy(xpath="//*[@id=\"otherDetails.isDifferentlyAbled\"]")
	private WebElement is_Differently_abled_checkbox;

	@FindBy(xpath="//*[@id=\"age\"]")
	private WebElement Age_checkbox;

	@FindBy(xpath="//*[@id=\"referrer\"]")
	private WebElement reffrer_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[2]/button")
	private WebElement Save_btn;

	@FindBy(xpath="//div[@id=':r24:']")
	private WebElement click_on_Pagination;

	@FindBy(xpath="//div[@id='root']")
	private WebElement click_on_back_btn;

	@FindBy(xpath="//div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]")
	private WebElement click_on_rows_perpage;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/ul[1]/li[1]")
	private WebElement click_on_10;

	@FindBy(xpath="/html[1]/body[1]/div[3]/div[3]/ul[1]/li[3]")
	private WebElement click_on_50;

	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li[4]")
	private WebElement click_on_100;

	public WebDriver driver;
	public leads_page(WebDriver driver) 
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void scneario1() throws InterruptedException {

		Click_on_Listing_menu.click();
		System.out.println("click on Listing Menu");
		Thread.sleep(3000);

		click_on_Leads.click();
		System.out.println("click on leads from side menu");
		Thread.sleep(3000);

		Enter_Text_in_searchbox.sendKeys("TEST");
		System.out.println("enter text in Search box");
		Thread.sleep(3000);

		Enter_Text_in_searchbox.clear();
		Thread.sleep(3000);
		Enter_Text_in_searchbox.sendKeys(Keys.CONTROL+"A");


		click_on_Checkbox.click();
		System.out.println("click on check bon listing menu");
		Thread.sleep(3000);

		click_on_blacklist.click();
		System.out.println("click on blacklist");
		Thread.sleep(3000);

		click_on_cancel_Btn.click();
		System.out.println("clicking on cancel button");
		Thread.sleep(3000);

		//	click_on_Checkbox.click();
		//System.out.println("click on check box again in listing menu");
		//	Thread.sleep(3000);

		click_on_blacklist.click();
		System.out.println("click on blacklist");
		Thread.sleep(3000);

		click_on_Sure_btn.click();
		System.out.println("click on sure btn");
		Thread.sleep(3000);

		click_on_Customize.click();
		System.out.println("click on customize btn");
		Thread.sleep(3000);

		Mobile_number_checkbox.click();
		System.out.println("clicking on  Mobile number checkbox");
		Thread.sleep(3000);

		gender_checkbox.click();
		System.out.println("clicking on gender checkbox");
		Thread.sleep(3000);

		Education_qualification_checkbox.click();
		System.out.println("click on education qualification checkbox");
		Thread.sleep(3000);

		English_proficiency_checkbox.click();
		System.out.println("click pn english proficiency cheeckbox");
		Thread.sleep(3000);

		WOrker_Status_checkbox.click();
		System.out.println("click on worker status checkbox");
		Thread.sleep(3000);

		Current_address_checkbox.click();
		System.out.println("click on current address checkbox");
		Thread.sleep(3000);

		current_State_checkbox.click();
		System.out.println("click on current state checkbox");
		Thread.sleep(3000);

		Current_district_checkbox.click();
		System.out.println("click on current district checkbox");
		Thread.sleep(3000);

		Year_of_Experience_checkbox.click();
		System.out.println("click on Year of experience checkbox");
		Thread.sleep(3000);

		Job_roles_checkbox.click();
		System.out.println("click on job roles checkbox");
		Thread.sleep(3000);

		Skill_Certification_checkbox.click();
		System.out.println("click on Skill certification checkbox");
		Thread.sleep(3000);

		Current_salary_checkbox.click();
		System.out.println("click on current salary checkbox");
		Thread.sleep(3000);

		expectedsalary_checkbox.click();
		System.out.println("click on expected salary checkbox");
		Thread.sleep(3000);

		Preferredlanguages_checkbox.click();
		System.out.println("click on Preferred languages checkbox");
		Thread.sleep(3000);

		Email_checkbox.click();
		System.out.println("click on e-mailcheckbox");
		Thread.sleep(3000);

		Martialstatus_checkbox.click();
		System.out.println("click on Martial Status checkbox");
		Thread.sleep(3000);

		Premanent_address_checkbox.click();
		System.out.println("click on permanent address checkbox");
		Thread.sleep(3000);

		Premanent_State_checkbox.click();
		System.out.println("click on Permanent state checkbox");
		Thread.sleep(3000);

		premanentdistrict_checkbox.click();
		System.out.println("click on permanent district checkbox");
		Thread.sleep(3000);

		Owned_vehical_checkbox.click();
		System.out.println("click on owned vehical checkbox");
		Thread.sleep(3000);

		Willing_to_move_checkbox.click();
		System.out.println("click on willing to move checkbox");
		Thread.sleep(3000);

		is_Double_vaccinated_checkbox.click();
		System.out.println("click on is double vaccinated checkbox");
		Thread.sleep(3000);

		bank_details_available_checkbox.click();
		System.out.println("click on bank details available checkbox");
		Thread.sleep(3000);

		Is_aadhar_verified_checkbox.click();
		System.out.println("click on is address verified checkbox");
		Thread.sleep(3000);

		is_bank_Account_Verified_checkbox.click();
		System.out.println("click on is bank account verified checkbox");
		Thread.sleep(3000);

		is_Differently_abled_checkbox.click();
		System.out.println("click on is differently abled checkbox");
		Thread.sleep(3000);

		Age_checkbox.click();
		System.out.println("click on  Age checkbox");
		Thread.sleep(3000);

		reffrer_checkbox.click();
		System.out.println("click on Refresh checkbox");
		Thread.sleep(3000);

		Save_btn.click();
		System.out.println("click on save btn");
		Thread.sleep(3000);

		click_on_Pagination.click();
		System.out.println("click on Pagination");
		Thread.sleep(4000);

		//click_on_back_btn.click();
		System.out.println("click on back btn to move back to orginal page");
		Thread.sleep(4000);

		click_on_rows_perpage.click();
		System.out.println("click on Rows per page Dropdown");
		Thread.sleep(3000);

		click_on_10.click();
		System.out.println("Click on 10 per page");
		Thread.sleep(3000);

		click_on_rows_perpage.click();
		System.out.println("click on Rows per page Dropdown");
		Thread.sleep(3000);

		click_on_50.click();
		System.out.println("click on 50 per page");
		Thread.sleep(3000);

		click_on_rows_perpage.click();
		System.out.println("click on Rows per page Dropdown");
		Thread.sleep(3000);

		click_on_100.click();
		System.out.println("clcik on 100 per page");
		Thread.sleep(3000);


	}
}





