package com.LearnSelenium.Advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesExamples {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

		List<WebElement> lstOfColumns = driver.findElementsByTagName("th");
		int columnCount = lstOfColumns.size();
		System.out.println("Total Number of Columns: " + columnCount);

		List<WebElement> lstOfRows = driver.findElementsByTagName("tr");
		int rowCount = lstOfRows.size();
		System.out.println("Total Number of Rows: " + rowCount);

		String learnInteractXpath = "//td[text()='Learn to interact " + "with Elements']//following::td[1]";
		String progressValueLIE = driver.findElementByXPath(learnInteractXpath).getText();
		System.out.println("The progress value of Learn " + "to interact with Elements is: " + progressValueLIE);
		List<WebElement> progressValues = driver.findElementsByXPath("//td[2]");
		List<Integer> numbersList = new ArrayList<Integer>();

		for (WebElement progressValue : progressValues) {
			String replace = progressValue.getText().replace("%", "");
			numbersList.add(Integer.parseInt(replace));
		}
		Integer minimum = Collections.min(numbersList);

		String stringMinimum = minimum.toString() + "%";
		//System.out.println(stringMinimum);
		// td[normalize-space()='30%']//following::td[1]
		WebElement minimumValueChechBox = driver
				.findElementByXPath("//td[normalize-space()="+"\'"+ stringMinimum + "\'"+"]"+"//following::td[1]");
		minimumValueChechBox.click();
		driver.close();
		driver =null;

	}
}
