package homepagepackage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepageautomation {

 WebDriver driver;
	 
	 @BeforeTest
  public void setup()
  {
    
     System.setProperty("webdriver.chrome.driver","D:/RAinforestAutomation/chromedriver.exe");
		driver = new ChromeDriver();
		
	String baseurl = "http://west.cdn.mathletics.com/html/rainforest/index.html";
    // Alert Message handling
    driver.get(baseurl);	
  }

@Test(priority = 1)
public void testhomepage() throws InterruptedException
{
	WebElement homeplay = driver.findElement(By.xpath("//div[@class='container ar-16-9']/a[@class='play-button']"));
    homeplay.click();
    WebElement levelpage = driver.findElement(By.xpath("//div[@href='#/home/a/menu']"));
    Actions action = new Actions(driver);
    
    action.moveToElement(levelpage);
    Thread.sleep(2000);
    action.click().build().perform();;
    Thread.sleep(2000);
}
@Test(priority = 2)
public void testlevel() throws InterruptedException, HeadlessException, AWTException, IOException
{
	  for(int i=1;i<=6;i++)
	  {
	   driver.findElement(By.xpath("//div[@class='category-number menu-container number']/img["+i+"]")).click();
	   Thread.sleep(2000);
	   BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image1, "png", new File("D:/Allgameslandingpage/landingpage_number"+i+".png")); 
	   driver.findElement(By.xpath("//a[@class='menu-button hide-on-level-page']")).click();
	   Thread.sleep(2000);
	   
	  } 
	  
	  
	  for(int j=1;j<=4;j++)
	  {
	   driver.findElement(By.xpath("//div[@class='category-number menu-container algebra-patterns']/img["+j+"]")).click();
	   Thread.sleep(2000);
	   BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image1, "png", new File("D:/Allgameslandingpage/landingpage_Algebra"+j+".png")); 
	   driver.findElement(By.xpath("//a[@class='menu-button hide-on-level-page']")).click();
	   Thread.sleep(2000);
	  }
	  for(int k=1;k<=6;k++)
	  {
	   driver.findElement(By.xpath("//div[@class='category-number menu-container measurement']/img["+k+"]")).click();
	   Thread.sleep(2000);
	   BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image1, "png", new File("D:/Allgameslandingpage/landingpage_measurement"+k+".png")); 
	   driver.findElement(By.xpath("//a[@class='menu-button hide-on-level-page']")).click();
	   Thread.sleep(2000);
	  }
	  
	  for(int l=1;l<=5;l++)
	  {
	   driver.findElement(By.xpath("//div[@class='category-number menu-container space']/img["+l+"]")).click();
	   Thread.sleep(2000);
	   BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image1, "png", new File("D:/Allgameslandingpage/landingpage_space"+l+".png")); 
	   driver.findElement(By.xpath("//a[@class='menu-button hide-on-level-page']")).click();
	   Thread.sleep(2000);
	  }
	
}

/*@Test(priority = 3)
public void Length() throws InterruptedException
{   int counter1 = 0;
	int count = 0;
	WebElement lengthclick = driver.findElement(By.xpath("//div[@class='category-number menu-container measurement']/img[1]"));
    lengthclick.click();
    for(int i= 0 ;i<5; i++){
    WebElement source = driver.findElement(By.xpath("//div[@id='button-drag-0']"));
    WebElement dest= driver.findElement(By.xpath("//div[@id='drop0']"));
    Actions action = new Actions(driver);
    Thread.sleep(2000);
    action.dragAndDrop(source, dest).build().perform();
    Thread.sleep(2000);
    WebElement tick1 = driver.findElement(By.xpath("//img[@id='tick-1']"));
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
   WebElement source1 = driver.findElement(By.xpath("//div[@id='button-drag-1']"));
    WebElement dest1 = driver.findElement(By.xpath("//div[@id='drop1']"));
    Actions action1 = new Actions(driver);
    Thread.sleep(2000);
    action1.dragAndDrop(source1, dest1).build().perform();
    Thread.sleep(2000);
    WebElement nextclick = driver.findElement(By.xpath("//div[@class='buttons center']/a"));
    nextclick.click();  
    count++;
    if(count == 5)
    {
    	System.out.println("All question Passed");
    }
    else
    {
    	System.out.println(+count+ "question");   	
    }
  }    
}*/
@AfterTest
public void teardown()
{
driver.quit();
}
}
