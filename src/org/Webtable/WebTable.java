package org.Webtable;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WebTable {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Driver\\chromedriver.exe");
		//ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();	
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		//driver.quit();
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("alldata");
		for (WebElement data : alldata) {
			String text = data.getText();
			System.out.println(text);
			
		}
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println("columndata");
		for (WebElement column : columndata) {
			String text = column.getText();
			System.out.println(text);
			
		}
		WebElement pdata = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
		String text = pdata.getText();
		System.out.println(text);
	}

}
