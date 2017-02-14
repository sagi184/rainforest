package seliniumwithtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selmaintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void Fixed()
	{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String baseurl = "https://www.google.co.in/?gfe_rd=cr&ei=aphnV526GYSomQWy2ZP4Cw&gws_rd=ssl";
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@Test
	public void gmailogin() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
		driver.findElement(By.id("Email")).sendKeys("Sagichavan184");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("9422093996");
		driver.findElement(By.id("signIn")).click();
		
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")).click();
		Thread.sleep(3000);
		//String Actualtext = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[4]/div[7]/div[1]/div[4]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/div[1]")).getText();
		//  Assert.assertEquals(Actualtext, "Sachin tendulkar");
	 System.out.print("\n assertion_method_1() -> Part executed");
		
	}
	@Test
	public void logout()
	{
		driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.id("gb_71")).click();
		System.out.println("LOgout Sucessfully");
	}
	
	/*@AfterTest
	
	public void trash()
	{
		
      
		
	}*/
	
}
