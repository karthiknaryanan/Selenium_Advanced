package com.LearnSelenium.Advanced;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");

		driver.findElementByLinkText("Download Excel").click();
		Thread.sleep(3000);

		File file = new File("C:\\Users\\91701\\Downloads");

		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if (file2.getName().equals("testleaf.xlsx")) {
				System.out.println("File is Downloaded Successfully");
				break;
			}
		}

	}

}
