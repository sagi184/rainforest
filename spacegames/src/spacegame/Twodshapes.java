package spacegame;

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
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

public class Twodshapes {
    ExtentReports reports;
    
	WebDriver driver = null;
	By twodshapes = By.xpath("//div[@class='category-number menu-container space']/img[2]");
	
	
	

	public Twodshapes(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void matching() throws InterruptedException, HeadlessException, AWTException, IOException 
	{
	    driver.findElement(twodshapes).click();
	    BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("D:/rainforestsnapshots/shapesgames/2Dshapesscreenshot/Landing.png"));
		for(int k=0;k<=15;k++){
	    for(int j=0;j<4;j++)
		{
			WebElement dest = driver.findElement(By.xpath("//div[@class='display-dropbox ng-scope']//img[@id='undefined'][@group="+j+"]")); 
	      WebElement source= driver.findElement(By.xpath("//div[@class='ng-scope']/img[@id="+k+"]"));  
                   
	Actions action =new Actions(driver);
	action.dragAndDrop(source, dest).build().perform();
	 BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image1, "png", new File("D:/rainforestsnapshots/shapesgames/2Dshapesscreenshot/shape"+k+".png"));
     Thread.sleep(2000);
	
	}
		}
	}
}