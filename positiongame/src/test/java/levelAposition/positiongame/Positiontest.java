package levelAposition.positiongame;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilityscreenshots.Utility;
import utilityscreenshots.positionrepo;

/**
 * Unit test for simple App.
 */
public class Positiontest 
    extends positionrepo
{
   ExtentReports report;
   ExtentTest logger;
   WebDriver driver;
   
   @Test
   public void Opengame()
   {
	   report = new ExtentReports("D:\\Reports\\Positionnew.html",true);
	   logger = report.startTest("Start the position game"); 
	   Browser br = new Browser();
	   br.Getbrowser("Chrome");
	   driver.get(url);
	   driver.findElement(Position).click();
	   //Utility ul = new Utility();
	   Utility.takescreensht(driver, "Positiongame");
	   logger.log(LogStatus.INFO, "landing page");
       String landingpageposition = logger.addScreenCapture("D:/RainforestAutomation/Workspace/position/rainforestsnapshot/Positiongame.png");
       logger.log(LogStatus.PASS, "Landing page", landingpageposition);
       
	   
   }
}
