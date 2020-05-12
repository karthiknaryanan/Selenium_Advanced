package com.LearnSelenium.Advanced;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExamples {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");

		/*
		 * Actions actions = new Actions(driver); actions.dragAndDrop(draggable,
		 * droppable).build().perform();
		 */
		Actions actions = new Actions(driver);
		actions.clickAndHold(draggable).moveToElement(droppable).click(droppable).build().perform();
		actions = null;
		driver.close();
		driver = null;

	}
}
