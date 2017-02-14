package levelAposition.positiongame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class Browser 
{
  public static WebDriver driver = null;
   
   public WebDriver Getbrowser(String browsername)
   {
	  if(browsername == "firefox")
	  {
			System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
			  driver=new FirefoxDriver(); 
	  }
	   else if (browsername == "Chrome") {
		   System.setProperty("webdriver.chrome.driver", "D:/RainforestAutomation/chromedriver.exe");
			  driver=new ChromeDriver(); 
	}
	   else
	   {
		   
		   System.out.print("You have entered incorrect browser");
		   
	   }
	   
	   return driver;
	   
	   
   }
}


