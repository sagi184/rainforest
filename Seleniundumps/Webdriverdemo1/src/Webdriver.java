import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://192.168.10.62:3001/1283/html/index.html");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Enter value 10 in the first number of the percent Calculator

	      driver.findElement(By.xpath(".//*[@id='Activity']/input")).sendKeys("10");
	      Thread.sleep(5000);
	      
	      //click on submit
	      driver.findElement(By.xpath(".//*[@id='submit3p']")).click();
	      
	      
	      
	   
	      
		

	}

}
