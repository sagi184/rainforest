package com.FirstRainMvn.page;

import org.openqa.selenium.By;

public class RainforestObjectsRepository {
	
	//Addbug bugs on leafs
	public By LeftLeafBugs = By.xpath("//div[@class='left-side-big-leaf ng-scope']/img");
	public By RightLeafBugs = By.xpath("//div[@class='right-side-big-leaf ng-scope']/img");

	//Number Cards
	public By NumberCard1 = By.xpath("//div[@class='action-buttons center-content']/div[1]");
	public By NumberCard2 = By.xpath("//div[@class='action-buttons center-content']/div[2]");
	public By NumberCard3 = By.xpath("//div[@class='action-buttons center-content']/div[3]");

	//Tick and Cross
	public By TickSign = By.xpath("//div[@class='center-content ng-scope']/img[1]");
	public By CrossSign = By.xpath("//div[@class='center-content ng-scope']/img[2]");
	
	//Next button
	public By NextButton = By.xpath("//a[@class='next-btn ng-scope']");

	
	
}
