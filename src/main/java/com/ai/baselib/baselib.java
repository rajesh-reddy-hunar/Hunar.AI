package com.ai.baselib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class baselib {

	public  WebDriver driver;
	@BeforeTest
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "exefile/chromedriver.exe"); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-notifications");

		//options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://qualification-module--resplendent-unicorn-271751.netlify.app/company/bluejay-work-11/signin");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String actualTitle = "Hunar";
		System.out.println("Landing Hunar Page");
		AssertJUnit.assertEquals(driver.getTitle(), actualTitle);
		String strTitle=driver.getTitle();
		System.out.println("Title =" + " " + strTitle);

	}
	@AfterMethod
	public void postCondition(ITestResult result)
	{
		if(result.isSuccess()){

		}
		else{
			String fileName=result.getMethod().getMethodName();
			Screenshot_lib sLib=new Screenshot_lib();
			sLib.getScreenshot(driver,fileName);
			Reporter.log("Screenshot has been taken",true);
		}



	}

}


