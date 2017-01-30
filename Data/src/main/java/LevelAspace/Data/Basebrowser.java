package LevelAspace.Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class Basebrowser 
{
public static WebDriver driver= null;
	
	public WebDriver getBrowser(String browsername)
	{
		if (browsername.equalsIgnoreCase("Firefox"))                                           
		  {
		
			System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
			  driver=new FirefoxDriver();                                      //  need to specify GekoDriver path
		  }
		  
		  else if(browsername.equalsIgnoreCase("Chrome"))
		  {
		      System.setProperty("webdriver.chrome.driver", "D:/RainforestAutomation/chromedriver.exe");
		      driver = new ChromeDriver();   
		   
		  }
		  else if (browsername.equalsIgnoreCase("IE"))
		  {
			  System.setProperty("webdriver.ie.driver", "E:\\webdriver\\IEDriverServer.exe");
			  driver=new InternetExplorerDriver();
		  }
		   
		   else
		   {
		    System.out.println("You have entered incorrect browser name");
		   }  
		//driver.manage().window().maximize();
		
		
		return driver;
	}
}
