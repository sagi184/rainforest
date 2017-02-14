package measuregames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allgames {

	public class Homepageautomation {

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
 
    


		 
		 
		 
		 
		 
@Test(priority = 2)
public void Area() throws InterruptedException
{   int counter1 = 0;
	int count = 0;
	 driver.findElement(By.xpath("//a[@class='menu-button hide-on-level-page']")).click();
	   Thread.sleep(2000);
	WebElement lengthclick = driver.findElement(By.xpath("//div[@class='category-number menu-container measurement']/img[2]"));
    lengthclick.click();
    for(int i= 0 ;i<=9; i++){
    	for(int j = 0;j<2;j++){
    WebElement source = driver.findElement(By.xpath("//div[@id='drag"+j+"'][@group="+j+"]"));  
    WebElement dest1 = driver.findElement(By.xpath("//div[@id='dropZone0'][@group=0]"));
    WebElement dest2 = driver.findElement(By.xpath("//div[@id='dropZone1'][@group=1]"));
    Actions action = new Actions(driver);
    Thread.sleep(2000);
    action.dragAndDrop(source, dest1).build().perform();
    Thread.sleep(2000);
    action.dragAndDrop(source, dest2).build().perform();
    WebElement tick1 = driver.findElement(By.xpath("//img[@class='tick invisible ng-scope']"));
    if(tick1.isDisplayed()){
    counter1 = 1;
    }
    if(counter1 == 1)
    {
    	System.out.println("tick Passed");
    }
    else
    {
    	System.out.println("tick failed");	
    }   
     }
    	WebElement nextclick = driver.findElement(By.xpath("//div[@class='buttons center']/a"));
        nextclick.click();  
        count++;
        if(count == 9)
        {
        	System.out.println("All question Passed");
        }
        else
        {
        	System.out.println(+count+ "question");   	
        }
}
}
/*@Test(priority = 3 )
public void Volume() throws InterruptedException
{ 
  WebElement volume = driver.findElement(By.xpath("//div[@class='category-number menu-container measurement']/img[3]"));
  volume.click();
for (int j=0; j<=5; j++)
{
	
for(int i= 0;i<2;i++){
	
	WebElement source = driver.findElement(By.xpath("//div[@id='drag0'][@group="+i+"]"));
	WebElement source1 = driver.findElement(By.xpath("//div[@id='drag1'][@group="+i+"]"));
	WebElement dest = driver.findElement(By.xpath("//div[@id='dropZone"+i+"'][@group="+i+"]"));
    Actions action = new Actions(driver);
	    //Thread.sleep(2000);
		    action.dragAndDrop(source, dest).build().perform();
	   //Thread.sleep(2000);
		    action.dragAndDrop(source1, dest).build().perform();
		    
    //Thread.sleep(2000);

	}
WebElement nextclick = driver.findElement(By.xpath("//div[@class='buttons center']/a"));
nextclick.click();  
 }
	}
*/
@AfterTest
public void teardown()
{
  driver.quit();
}
}
}
