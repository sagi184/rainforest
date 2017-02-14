import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.navigate().to("http://au.mathletics.com/signin/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='menu-item-90771']/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='ppp-user-name']")).sendKeys("pt-1682");
		driver.findElement(By.xpath(".//*[@id='ppp-user-password']")).sendKeys("stage57");
		driver.findElement(By.xpath(".//*[@id='ppp-sign-in']")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		
		
		
	}

}
