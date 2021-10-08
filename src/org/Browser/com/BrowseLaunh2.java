package org.Browser.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowseLaunh2 {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		//Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div/input"));
		Thread.sleep(2000);
		email.sendKeys("hello");
		
		
	}
}
	


		/*WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("ammachethivanta");
		WebElement icon = driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']"));
		icon.click();
		
		
	}
	
		
		/*WebElement women = driver.findElement(By.xpath("//a[contains(@data-group,'women')]"));
		women.click();
		Thread.sleep(1000);
		WebElement top = driver.findElement(By.xpath("//p[contains(@class,'class')]"));*/
		
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	
		File dest = new File("C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Screenshot\\google.png");
		//FileUtilsCopyToFileTestCase(source, dest);
		FileUtils.copyFile(source, dest);
		/*TakesScreenshot ts1 = (TakesScreenshot) driver;
		File hello = ts1.getScreenshotAs(OutputType.FILE);
		File go = new File("C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Screenshot");*/	

	

