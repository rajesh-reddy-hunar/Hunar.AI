package com.ai.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login_page {

	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement Enter_Login_Email;

	@FindBy(xpath="//*[@id=\"password\"]")
	private  WebElement Enter_Password;

	@FindBy(xpath="//button[@type='button']")
	private WebElement click_on_Submit_btn;

	public WebDriver driver;
	public login_page(WebDriver driver) 
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void scneario1() throws InterruptedException {

		click_on_Submit_btn.click();
		System.out.println("clicking on the Submit button without entering an email and password. ");
		Thread.sleep(3000);
	}
	public void scneario2() throws InterruptedException {

		Enter_Login_Email.sendKeys("aniket@hunar.ai");
		System.out.println("entering a email without entering an password");
		Thread.sleep(3000);

		click_on_Submit_btn.click();
		System.out.println("clicking on the Submit");
		Thread.sleep(3000);

	}
	public void scneario3() throws InterruptedException {

		Enter_Login_Email.clear();
		Thread.sleep(1000);
		Enter_Login_Email.sendKeys(Keys.CONTROL+"A");

		//Enter_Password.clear();
		//Thread.sleep(1000);
		//Enter_Password.sendKeys(Keys.CONTROL+"A");

		Enter_Password.sendKeys("T48eadwa9");
		System.out.println("entering a password without entering an email");
		Thread.sleep(4000);

		click_on_Submit_btn.click();
		System.out.println("click on Submit Buutton");
		Thread.sleep(3000);
	}
	public void scneario4() throws InterruptedException {

		Enter_Login_Email.clear();
		Thread.sleep(1000);
		Enter_Login_Email.sendKeys(Keys.CONTROL+"A");


		Enter_Login_Email.sendKeys("anike@hunar.ai");
		System.out.println("entering invalid E-mail");
		Thread.sleep(3000);

		Enter_Password.clear();
		Thread.sleep(3000);
		Enter_Password.sendKeys(Keys.CONTROL+"A");

		Enter_Password.sendKeys("T48ead#wa9");
		System.out.println("entering correct password");
		Thread.sleep(3000);

		click_on_Submit_btn.click();
		System.out.println("click on Submit  Buutton");
		Thread.sleep(3000);
	}

	public void scneario5() throws InterruptedException {

		Enter_Login_Email.clear();
		Thread.sleep(1000);
		Enter_Login_Email.sendKeys(Keys.CONTROL+"A");


		Enter_Login_Email.sendKeys("aniket@hunar.ai");
		System.out.println("entering Correct E-mail");
		Thread.sleep(3000);

		Enter_Password.clear();
		Thread.sleep(3000);
		Enter_Password.sendKeys(Keys.CONTROL+"A");

		Enter_Password.sendKeys("48ead#wa9");
		System.out.println("entering invalid password");
		Thread.sleep(3000);

		click_on_Submit_btn.click();
		System.out.println("click on Submit  Buutton");
		Thread.sleep(3000);
		
		Enter_Login_Email.clear();
		Thread.sleep(1000);
		Enter_Login_Email.sendKeys(Keys.CONTROL+"A");
		
		Enter_Password.clear();
		Thread.sleep(3000);
		Enter_Password.sendKeys(Keys.CONTROL+"A");

	}

	public void scneario6() throws InterruptedException {

	

		Enter_Login_Email.sendKeys("aniket@hunar.ai");
		System.out.println("entering Correct E-mail");
		Thread.sleep(3000);

		Enter_Password.sendKeys("T48ead#wa9");
		System.out.println("entering correct password");
		Thread.sleep(3000);

		click_on_Submit_btn.click();
		System.out.println("click on Submit  Buutton");
		Thread.sleep(10000);
	}
}
















































