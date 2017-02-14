package levelBNumber.Allgames;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilityrepo.Repository;
import Utilityrepo.Screenshot;

/**
 * Unit test for simple App.
 */
public class NumberTest 
    extends Repository
{
    ExtentReports report;
    ExtentTest logger;
    WebDriver driver;
    @Test
    public void NumberlevelBopening() throws InterruptedException
    {
    	report = new ExtentReports("D:\\Reports\\AllgameslevelBnumber.html",true);
    	logger = report.startTest("Verify position game");
    	Basebrowser browser = new Basebrowser();
    	driver = browser.getBrowser("Chrome");
    	logger.log(LogStatus.INFO, "Browesr is up and running");
        driver.get(url); 
       Thread.sleep(3000);
        	driver.findElement(checkgame).click();
        
        Screenshot.Capturescreenshot(driver, "All landing page");
        logger.log(LogStatus.INFO, "landing page");
        String landingpageposition = logger.addScreenCapture("D:/RainforestAutomation/Workspace/Allgames/screenshot/Landingpage.png");
        logger.log(LogStatus.PASS, "Landing page", landingpageposition);
        report.endTest(logger);
        report.flush();
    }
}
