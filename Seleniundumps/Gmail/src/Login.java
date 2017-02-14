import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com/intl/en/mail/help/about.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='gmail-sign-in']")).click();
	    driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("sagichavan184@gmail.com");
	    driver.findElement(By.xpath(".//*[@id='next']")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("9422093996");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id=':3a']/div")).click();
		
		driver.findElement(By.xpath(".//*[@id=':5']/div/div[1]/div[1]/div/div/div[2]/div[3]/div/div")).click();
		//driver.findElement(By.id("gs_taif50")).sendKeys("Istqb");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
        
	}

}
