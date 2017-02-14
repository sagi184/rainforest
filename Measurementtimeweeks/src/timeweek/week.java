package timeweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class week {
	
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


	 @Test(priority=1)
	 public void sorting() throws InterruptedException
	 {   
		 WebElement weekdays = driver.findElement(By.xpath("//div[@class='panel-buttons center']/a[1]"));
		 weekdays.click();
	 for(int i=0;i<7;i++)		   
	   {
	    WebElement dest = driver.findElement(By.xpath("//div[@class='game-stage pos-relative']/div[@id='drop-zone-"+i+"']"));
	    WebElement source = driver.findElement(By.xpath("//div[@class='game-stage pos-relative']/div[@id='drag-item-"+i+"']"));
	    Actions dragAndDrop = new Actions(driver);
	    Action action = dragAndDrop.dragAndDrop(source, dest).build();
	    action.perform();	    
	    Thread.sleep(2000); 
}  	  
	 WebElement tick1 = driver.findElement(By.xpath("//*[@id='tick']/span/img"));
	    if(tick1.isDisplayed()){
	    	System.out.println("tick Passed");
	    }
	    else
	    {
	    	System.out.println("tick failed");	
	    }   
	 }
 @Test(priority = 0)
	 public void words() throws InterruptedException
	 {
		 WebElement word = driver.findElement(By.xpath("//div[@class='category-number menu-container measurement']/img[6]"));
		    word.click();
		    for (int j=0; j<=5; j++)
		    {
		    for(int i= 0 ;i<2; i++)
		    {	
		    	WebElement source = driver.findElement(By.xpath("//div[@id='drag-item-"+i+"'][@group="+i+"]"));
		        WebElement dest = driver.findElement(By.xpath("//div[@id='drop-zone-0'][@group='0']"));
		        WebElement dest1 = driver.findElement(By.xpath("//div[@id='drop-zone-1'][@group='1']"));
		        Actions action = new Actions(driver);
				    Thread.sleep(2000);
					    action.dragAndDrop(source, dest).build().perform();
				   Thread.sleep(2000);
					    action.dragAndDrop(source, dest1).build().perform();
		      		  
			    Thread.sleep(2000);
		  }
		    WebElement nextclick = driver.findElement(By.xpath("//div[@class='buttons center']/a"));
		    nextclick.click();  
		     }
 }

 @AfterTest
 public void teardown()
 {
 driver.quit();
 } 
}
