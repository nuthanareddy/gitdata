package org.Browser.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	/*TakesScreenshot ts1 = (TakesScreenshot) driver;
	File face = ts1.getScreenshotAs(OutputType.FILE);
	File book = new File("C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Screenshot\\facebook.jpeg");
	FileUtils.copyFile(face, book);*/
	
	/*driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	WebElement fbemail = driver.findElement(By.id("email"));
	fbemail.sendKeys("vasanthreddy9505@gmail.com");
	WebElement fbpass = driver.findElement(By.name("pass"));
	fbpass.sendKeys("vasanthmadhav");
	WebElement fbbutton = driver.findElement(By.name("login"));
	fbbutton.click();*/
	WebElement crtbtn = driver.findElement(By.xpath("(//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'])[1]"));
	crtbtn.click();
	Thread.sleep(1000);
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("helo");
	//Thread.sleep(1000);
	TakesScreenshot ts2 = (TakesScreenshot) driver;
	File crt = ts2.getScreenshotAs(OutputType.FILE);
	File button = new File("C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Screenshot\\createbutton.png");
	FileUtils.copyFile(crt, button);
	
	
	//WebElement crtbtn = driver.findElement(By.xpath("(//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'])[1]"));
	//crtbtn.click();
	
	/*Thread.sleep(3000);
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("helo");*/
	/*WebElement lastname = driver.findElement(By.xpath("(//input[@name='lastname'])"));
	lastname.sendKeys("hint");
	WebElement mobile = driver.findElement(By.xpath("(//input[@aria-label='Mobile number or email address'])"));
	mobile.sendKeys("9940612345");
	Thread.sleep(1000);
	WebElement nwpass = driver.findElement(By.name("reg_passwd__"));  
	nwpass.sendKeys("123456789");
	WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	Select S = new Select(date);
	S.selectByValue("26");
	Thread.sleep(1000);
	WebElement month = driver.findElement(By.xpath("(//select[@name='birthday_month'])"));
	Select S2 = new Select(month);
	month.click();
	S2.selectByVisibleText("Oct");
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select S3 = new Select(year);
	S3.selectByValue("1995");
	WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])"));
	gender.click();
	WebElement button = driver.findElement(By.name("websubmit"));
	button.click();*/
	
	
	}

}
