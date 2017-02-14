import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sanjaydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=TEndVvKsH6rv8weu4p5g&gws_rd=ssl");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("sachin tendulkar");
		
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		//Thread.sleep("1000");		

	}

}
