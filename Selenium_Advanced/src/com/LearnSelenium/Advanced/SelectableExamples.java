package com.LearnSelenium.Advanced;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		actions.click(item1).click(item2).click(item3).keyUp(Keys.CONTROL).build().perform();

		actions.clickAndHold(item1).clickAndHold(item2).clickAndHold(item3).build().perform();

		driver.close();
		driver = null;
	}

}
