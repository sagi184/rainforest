package spacegame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setup {
             
	  public WebDriver driver=null;
	  
	  public void setufiles() throws IOException {
		
		  Properties p = new Properties();
		  FileInputStream fi= new FileInputStream("Global.properties");//Get url from properties file
		  p.load(fi);
		  
		  if(p.getProperty("browser").contains("firefox"))
			{
				driver=new FirefoxDriver();
				
			}
			else  if (p.getProperty("browser").contentEquals("Chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver","D:/RAinforestAutomation/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}	
			driver.get(p.getProperty("url"));
	}
	
	
}
