package org.Webtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FramesPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Driver\\chromedriver.exe");
		//ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY;
		//ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();	
		driver.get("http://demo.automationtesting.in/Frames.html");
		//driver.quit();
		
		WebElement frames = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(frames);

	}

}