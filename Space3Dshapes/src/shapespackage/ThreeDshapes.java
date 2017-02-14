package shapespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThreeDshapes {
	                           WebDriver driver;
	 
	 @BeforeTest
	  public void setup()
	  {
	    
	     System.setProperty("webdriver.chrome.driver","D:/RAinforestAutomation/chromedriver.exe");
			driver = new ChromeDriver();
			
		String baseurl = "http://west.cdn.mathletics.com/html/rainforest/index.html#/home/a/menu";
	    // Alert Message handling
	    driver.get(baseurl);	
	  }

	 @Test(priority = 1 )
	 public void sorting() throws InterruptedException
	 {   
		 WebElement dshapes = driver.findElement(By.xpath("//div[@class='category-number menu-container space']/img[1]"));
		    dshapes.click();
		    for(int i= 0 ;i<32; i++)
		    {	
		    	WebElement source = driver.findElement(By.xpath("//div[@class='game-stage pos-relative']/img[@id="+i+"]"));
		        WebElement dest = driver.findElement(By.xpath("//div[@class='display-dropbox ng-scope']/img[@id='undefined'][@group='2']"));
		        WebElement dest2 = driver.findElement(By.xpath("//div[@class='display-dropbox ng-scope']/img[@id='undefined'][@group='1']"));
		       
		        Actions action = new Actions(driver);
		   // Thread.sleep(2000);
			    action.dragAndDrop(source, dest).build().perform();
		    //Thread.sleep(2000);
			    action.dragAndDrop(source, dest2).build().perform();
      		 	//  action.dragAndDrop(source1, dest2).build().perform();
	    Thread.sleep(2000);
		    if(i == 7 || i == 15 || i == 23){
		    WebElement nextclick = driver.findElement(By.xpath("//div[@class='buttons center']/a"));
		    nextclick.click();
		   	i = 0 + i;    	   
	    }	    
		    }
	 }
		   @AfterTest
		   public void teardown()
		   {
		   driver.quit();
		   } 
	 }