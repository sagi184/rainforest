package com.FirstRainMvn.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.FirstRainMvn.base;
import com.FirstRainMvn.page.RainforestObjectsRepository;
import com.FirstRainMvn.page.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test_01_Addbugs extends RainforestObjectsRepository
{
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	
	@Test(priority=1)		//To verify Right answer.
	public void Positive_Addbugs() throws Exception
	{
		report=new ExtentReports("D:\\Reports\\PositiveTests.html",true);
		logger=report.startTest("VerifyCorrectAnswer");
		
		base browser = new base();
		WebDriver driver = browser.getBrowser("Chrome");

		logger.log(LogStatus.INFO, "Browser started");
		
		
		String url="http://west.cdn.mathletics.com/html/rainforest/index.html#/home/a/menu/number/add-bugs";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.log(LogStatus.INFO, "Application is up and running");
		
		Utility.Capturescreenshot(driver, "Addbugs Landing page");
		String image=logger.addScreenCapture("D:\\worksspace\\com.RainMvn\\screenshot\\Addbugs Landing page.png");
		logger.log(LogStatus.PASS, "Answerverify", image);
		
		for(int l=1;l<=5;l++)
		{
			int i= driver.findElements(LeftLeafBugs).size();
			int j= driver.findElements(RightLeafBugs).size();
			int k=i+j;
			
			//System.out.println("Total bugs on both leafs are: "+k);
			logger.log(LogStatus.PASS, "Total bugs on both leafs are: "+k);
			
			//Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String NumCard1 = driver.findElement(NumberCard1).getText();
			String NumCard2 = driver.findElement(NumberCard2).getText();
			String NumCard3 = driver.findElement(NumberCard3).getText();
			
			if(k==Integer.parseInt(NumCard1))
			{
				driver.findElement(NumberCard1).click();
				//System.out.println("First option is correct");
				logger.log(LogStatus.PASS, "First option is correct");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			else if(k==Integer.parseInt(NumCard2))
				
			{
				driver.findElement(NumberCard2).click();
				//System.out.println("Second option is correct");
				logger.log(LogStatus.PASS, "Second option is correct");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			else if(k==Integer.parseInt(NumCard3))
			{
				driver.findElement(NumberCard3).click();
				//System.out.println("Third option is correct");
				logger.log(LogStatus.PASS, "Third option is correct");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			else if(k!=Integer.parseInt(NumCard1) || k!=Integer.parseInt(NumCard2) || k!=Integer.parseInt(NumCard3))
			{
				System.out.println("ERROR: Option not found");
				Utility.Capturescreenshot(driver, "Failed");
				logger.log(LogStatus.FATAL, "Unexpected error occured");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			
			
			WebElement Tick = driver.findElement(TickSign);
			if(Tick.isDisplayed())
			{
				//System.out.println("Tick sign is displayed\n");
				Utility.Capturescreenshot(driver, "Correct-"+l);
				
				String image1=logger.addScreenCapture("D:\\worksspace\\com.RainMvn\\screenshot\\Correct-"+l+".png");
				logger.log(LogStatus.PASS, "Answerverify", image1);
				logger.log(LogStatus.PASS, "Tick sign is displayed\n");
				
			}else
			{
				//System.out.println("Tick sign not displayed\n");
				
				Utility.Capturescreenshot(driver, "Incorrect-"+System.currentTimeMillis());
				logger.log(LogStatus.FAIL, "Tick sign is not displayed\n");
				String image2=logger.addScreenCapture("D:\\worksspace\\com.RainMvn\\screenshot\\Incorrect-"+System.currentTimeMillis()+".png");
				logger.log(LogStatus.PASS, "Answerverify", image2);
				logger.log(LogStatus.FAIL, "Tick sign is not displayed\n");
			}
			driver.findElement(NextButton).click();
			report.endTest(logger);
			report.flush();
			
		}driver.get("E:\\Reports\\PositiveTests.html");  Thread.sleep(5000);
	}
	
	
	/*@Test(priority=2)		//To verify wrong answer
	public void Negative_Addbugs() throws Exception
	{
		report=new ExtentReports("E:\\Reports\\PositiveTests2.html");
		logger=report.startTest("VerifyInCorrectAnswer");
		base browser = new base();
		WebDriver driver = browser.getBrowser("Chrome");
		logger.log(LogStatus.INFO, "Browser started");

		String url="http://west.cdn.mathletics.com/html/rainforest/index.html#/home/a/menu/number/add-bugs";
		driver.get(url);
		 
		for(int l=1;l<=10;l++)
		{
			int i= driver.findElements(LeftLeafBugs).size();
			int j= driver.findElements(RightLeafBugs).size();
			int k=i+j;
			
			
			logger.log(LogStatus.PASS, "Total bugs on both leafs are: "+k);
			
			Thread.sleep(1000);
			
			String NumCard1 = driver.findElement(NumberCard1).getText();
			String NumCard2 = driver.findElement(NumberCard2).getText();
			String NumCard3 = driver.findElement(NumberCard3).getText();
			
			if(k!=Integer.parseInt(NumCard1))
			{
				driver.findElement(NumberCard1).click();
				logger.log(LogStatus.PASS, "First option clicked");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			if(k!=Integer.parseInt(NumCard2))
			{
				driver.findElement(NumberCard2).click();
				logger.log(LogStatus.PASS, "Second option clicked");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			if(k!=Integer.parseInt(NumCard3))
			{
				driver.findElement(NumberCard3).click();
				logger.log(LogStatus.PASS, "Third option clicked");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			WebElement Cross = driver.findElement(CrossSign);
			if(Cross.isDisplayed())
			{
				logger.log(LogStatus.PASS, "Cross sign displayed\n");
			}else{
				logger.log(LogStatus.FAIL,"Cross sign not displayed\n");
			}
			Thread.sleep(3000);
			driver.findElement(NextButton).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(NextButton).click();
			
			report.endTest(logger);
			report.flush();
		}
		driver.get("E:\\Reports\\PositiveTests2.html");
	}*/
}














/*@AfterMethod
public void teardown(ITestResult result)
{
	if(result.getStatus()==ITestResult.SUCCESS)
	{
		String screenshot_path=Utility.Capturescreenshot(driver, result.getName());
		String image=logger.addScreenCapture(screenshot_path);
		logger.log(LogStatus.PASS, "Answerverify", image);
	}
	report.endTest(logger);
	report.flush();
	driver.get("E:\\Reports\\PositiveTests.html");
}*/
