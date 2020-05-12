package com.LearnSelenium.Advanced;

import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInteractionExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		// Click button to open home page in New Window

		WebElement openHomePage = driver.findElementById("home");
		String parentWindow = driver.getWindowHandle();
		openHomePage.click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println("No of Windows Opend currently after clicking openHomePage: " + windowHandles1.size());
		for (String string : windowHandles1) {
			driver.switchTo().window(string);
		}
		driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[1]").click();
		// driver.close();
		driver.switchTo().window(parentWindow);

		// Find the number of opened windows
		WebElement openMultipleWindows = driver.findElementByXPath("//button[text()='Open Multiple Windows']");
		openMultipleWindows.click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out
				.println("No of Windows Opend currently after clicking openMultipleWindows: " + windowHandles2.size());

		// Close all except this window
		WebElement doNotCloseMe = driver.findElementByXPath("(//button[@id='color'])[1]");
		doNotCloseMe.click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		System.out.println("No of Windows Opend currently after clicking doNotCloseMe: " + windowHandles3.size());
		for (String string : windowHandles3) {
			driver.switchTo().window(string);
			driver.close();
		}

		/*
		 * // Wait for 2 new Windows to open WebElement waitFor5Seconds =
		 * driver.findElementByXPath("(//button[@id='color'])[2]"); WebDriverWait wait =
		 * new WebDriverWait(driver,1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(waitFor5Seconds));
		 * waitFor5Seconds.click(); driver.close();
		 */
	
	
	}

}
