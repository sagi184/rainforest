package LevelAspace;

import org.apache.commons.lang3.ObjectUtils.Null;
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
   
   public WebDriver getBrowser(String browsername)
   {
	   if(browsername=="Firefox")
	   {
		   System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
			  driver=new FirefoxDriver();                                      //  need to specify GekoDriver path   
	   }
	   
	   else if(browsername == "Chrome")
	   {   
		  System.setProperty("webdriver.chrome.driver", "D:/RainforestAutomation/chromedriver.exe");
		     driver = new ChromeDriver();
		     driver.manage().window().maximize();
	   }	   
	return driver;
   }

}