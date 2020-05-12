package com.LearnSelenium.Advanced;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipHandlingExamples {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement toolTip = driver.findElementById("age");
		String toolTipText = toolTip.getAttribute("title");
		System.out.println("The text in the ToolTip is: " + toolTipText);
		driver.close();
		driver = null;
	}
}
