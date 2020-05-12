package com.LearnSelenium.Advanced;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExamples {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.findElementById("tags").sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElementsByXPath("(//ul)[2]/li");
		for (WebElement webElement : options) {
			if (webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("You clicked Web Services");
				break;
			}

		}
		driver.close();
		driver = null;
	}
}
