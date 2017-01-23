package LevelAspace;

import java.sql.Driver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilityrepo.Repo;
import utilityrepo.Utility;

/**
 * Unit test for simple App.
 */
public class Testposition extends Repo
{
    ExtentReports report;
    ExtentTest logger;
    WebDriver driver;
   // report = new ExtentReports("D:\\Reports\\Position.html",true);
    @Test(priority=1)
    public void positionsetup() throws InterruptedException
    {
    	report = new ExtentReports("D:\\Reports\\Position.html",true);
    	logger = report.startTest("Verify position game");
    	Browser browser = new Browser();
    	driver = browser.getBrowser("Chrome");
    	logger.log(LogStatus.INFO, "Browesr is up and running");
        driver.get(url); 
        driver.findElement(Position).click();
        Utility.Capturescreenshot(driver, "Landingpage");
        logger.log(LogStatus.INFO, "landing page");
        String landingpageposition = logger.addScreenCapture("D:/RainforestAutomation/Workspace/position/rainforestsnapshots/Landingpage.png");
        logger.log(LogStatus.PASS, "Landing page", landingpageposition);
       
    	for(int i=1;i<=6;i++)
    	{
    	WebElement drag0= driver.findElement(draggroup0);
    	WebElement drag1= driver.findElement(draggroup1);
        WebElement dropzone0= driver.findElement(dropzonegroup0);
        WebElement dropzone1 =driver.findElement(dropzonegroup1);
        
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(drag0, dropzone0).build().perform();
        Thread.sleep(2000);
        Utility.Capturescreenshot(driver, "firstdrop"+i+"");
        logger.log(LogStatus.INFO, "FirstDrop done for question:"+i+"");
        String image1 = logger.addScreenCapture("D:/RainforestAutomation/Workspace/position/rainforestsnapshots/firstdrop"+i+".png");
        logger.log(LogStatus.PASS, "Firstdrop", image1);
        action.dragAndDrop(drag1, dropzone1).build().perform();
        Thread.sleep(2000);
        Utility.Capturescreenshot(driver, "Seconddrop"+i+"");
        logger.log(LogStatus.INFO, "seconddrop done for question:"+i+" with tick");
        String image2 = logger.addScreenCapture("D:/RainforestAutomation/Workspace/position/rainforestsnapshots/Seconddrop"+i+".png");
        logger.log(LogStatus.PASS, "Seconddrop and tick", image2);
        driver.findElement(Next).click();      
        report.endTest(logger);
        report.flush();  	
   }
     driver.get("D:\\Reports\\Position.html");
} 
}