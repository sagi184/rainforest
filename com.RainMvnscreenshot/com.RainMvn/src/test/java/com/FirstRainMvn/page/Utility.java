package com.FirstRainMvn.page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public static String Capturescreenshot(WebDriver driver,String screenshotname)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String dest="./screenshot/"+screenshotname+".png";
			File destination=new File(dest);
			FileUtils.copyFile(source, destination);
			System.out.println("\nScreenshot taken\n");
			return dest;
		} catch (Exception e) 
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
			return e.getMessage();
		} 

	}

}
