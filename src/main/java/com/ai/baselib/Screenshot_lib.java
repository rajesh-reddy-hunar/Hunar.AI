package com.ai.baselib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot_lib {
	
	public void getScreenshot(WebDriver driver,String fileName )
    {
        try
        {
            EventFiringWebDriver efw=new EventFiringWebDriver(driver);
            File srcFile=efw.getScreenshotAs(OutputType.FILE);
            // Open the current date and time
            String timestamp = new SimpleDateFormat("yyyy-MM-dd--hh-mm").format(new Date());
            File destFile=new File(".\\ScreenShots\\" + fileName +" "+ timestamp +".png");
            FileUtils.copyFile(srcFile, destFile);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
