package com.FirstRainMvn.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.FirstRainMvn.base;
import com.FirstRainMvn.page.RainforestObjectsRepository;

public class Test_02_Addbugs extends RainforestObjectsRepository{
	
WebDriver driver;
	
	@Test		//To verify wrong answer
	public void Negative_Addbugs() throws Exception
	{
		base browser = new base();
		WebDriver driver = browser.getBrowser("Chrome");

		String url="http://west.cdn.mathletics.com/html/rainforest/index.html#/home/a/menu/number/add-bugs";
		driver.get(url);
		
		for(int l=1;l<=10;l++)
		{
			int i= driver.findElements(LeftLeafBugs).size();
			int j= driver.findElements(RightLeafBugs).size();
			int k=i+j;
			
			System.out.println("Total bugs on both leafs are: "+k);
			
			Thread.sleep(3000);
			
			String NumCard1 = driver.findElement(NumberCard1).getText();
			String NumCard2 = driver.findElement(NumberCard2).getText();
			String NumCard3 = driver.findElement(NumberCard3).getText();
			
			if(k!=Integer.parseInt(NumCard1))
			{
				driver.findElement(NumberCard1).click();
				System.out.println("First option clicked");
			}
			if(k!=Integer.parseInt(NumCard2))
			{
				driver.findElement(NumberCard2).click();
				System.out.println("Second option clicked");
			}
			if(k!=Integer.parseInt(NumCard3))
			{
				driver.findElement(NumberCard3).click();
				System.out.println("Third option clicked");
			}
			
			WebElement Cross = driver.findElement(CrossSign);
			if(Cross.isDisplayed())
			{
				System.out.println("Cross sign is displayed\n");
			}else{
				System.out.println("Cross sign not displayed\n");
			}
			Thread.sleep(3000);
			driver.findElement(NextButton).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	

}
