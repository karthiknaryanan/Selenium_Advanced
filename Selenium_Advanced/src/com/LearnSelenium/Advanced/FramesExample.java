package com.LearnSelenium.Advanced;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

		// I am inside a frame
		WebElement frame1 = driver.findElementByXPath("//iframe[@src='default.html']");
		driver.switchTo().frame(frame1);
		driver.findElementById("Click").click();
		String resultText1 = driver.findElementById("Click").getText();
		System.out.println(resultText1);
		driver.switchTo().defaultContent();

		// I am inside a nested frame
		WebElement parentFrame = driver.findElementByXPath("//iframe[@src='page.html']");
		driver.switchTo().frame(parentFrame);
		WebElement childFrame = driver.findElementByXPath("//iframe[@src='nested.html']");
		driver.switchTo().frame(childFrame);
		driver.findElementById("Click1").click();
		String resultText2 = driver.findElementById("Click1").getText();
		System.out.println(resultText2);
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();

		// Find total number of frames.
		List<WebElement> lstOfFrames = driver.findElementsByTagName("iframe");
		int numOfFrames = lstOfFrames.size();
		System.out.println("Total Number of Frames: " + numOfFrames);
		Iterator<WebElement> lstiterator = lstOfFrames.iterator();
		while (lstiterator.hasNext()) {
			System.out.println(lstiterator.next().getAttribute("src"));
		}

		driver.close();
		driver = null;
	}

}
