import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Qademo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         //launch
         driver.navigate().to("http://192.168.10.70:3001/student/app-release/index.html?#/?env=qa");
         
         driver.manage().window().maximize();
         //enter uname
         driver.findElement(By.xpath(".//*[@id='login']/div[2]/input[1]")).sendKeys("DR-71894");
         
         driver.findElement(By.xpath(".//*[@id='login']/div[2]/input[2]")).sendKeys("ride20");
         
         driver.findElement(By.xpath(".//*[@id='login']/div[2]/button")).click();
         
         Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='classList']")));
         dropdown.selectByVisibleText("");

         
         Thread.sleep(4000);
         
         
       //  driver.close();
	}

}
