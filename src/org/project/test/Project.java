package org.project.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Project {

	

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\123\\OneDrive\\Desktop\\nuthu_office\\WS\\SeleniumProject\\Driver\\chromedriver.exe");
	Thread.sleep(1000);
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	WebElement signin = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']"));
	signin.click();
	/*WebElement emailadd = driver.findElement(By.xpath("//input[@id='email_create']"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	emailadd.sendKeys("nuthanareddy1026@gmail.com");
	WebElement button = driver.findElement(By.xpath("//i[@class='icon-user left']"));
	button.click();
	
	WebElement title = driver.findElement(By.id("id_gender2"));
	title.click();
	WebElement firstnm = driver.findElement(By.name("customer_firstname"));
	firstnm.sendKeys("nuthanareddy");
	WebElement lastnm = driver.findElement(By.name("customer_lastname"));
	lastnm.sendKeys("kota");
	WebElement em = driver.findElement(By.name("passwd"));
	em.sendKeys("devanuthu2628");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement date = driver.findElement(By.name("days"));
	Select s = new Select(date);
	s.selectByValue("26");
	
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement mnth = driver.findElement(By.name("months"));
	Select s2 = new Select(mnth);
	s2.selectByVisibleText("October ");
	
	
	WebElement year = driver.findElement(By.name("years"));
	Select s3 = new Select(year);
	s3.selectByValue("1995");
	WebElement cnm = driver.findElement(By.id("company"));
	cnm.sendKeys("tvs");
	WebElement add = driver.findElement(By.name("address1"));
	add.sendKeys("appartment,103-2,2nd floor,D.no-403");
	WebElement add2 = driver.findElement(By.name("address2"));
	add2.sendKeys("appartment2,104-2,3rd floor,d.no-302");
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("chennai");
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
	Select s4 = new Select(state);
s4.selectByVisibleText("Indiana");
	
	WebElement postc = driver.findElement(By.name("postcode"));
	postc.sendKeys("12345");
	WebElement country = driver.findElement(By.id("id_country"));
	Select s6 = new Select(country);
	s6.selectByVisibleText("United States");
	WebElement mobile = driver.findElement(By.name("phone_mobile"));
	mobile.sendKeys("9940627986");
	WebElement address = driver.findElement(By.name("alias"));
	address.sendKeys("deva,23,45-6");
	WebElement buton = driver.findElement(By.xpath("//button[@name='submitAccount']"));
	buton.click();*/
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("nuthanareddy1026@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
	pass.sendKeys("devanuthu2628");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement siin = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	siin.click();
	
	WebElement womenbtn = driver.findElement(By.xpath("//a[@title='Women']"));
	womenbtn.click();
	WebElement addcart = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
	addcart.click();
	WebElement pro = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	pro.click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement btn = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	btn.click();
	WebElement adreebtn = driver.findElement(By.xpath("//button[@name='processAddress']"));
	adreebtn.click();
	WebElement box = driver.findElement(By.name("cgv"));
	box.click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement buttn = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	buttn.click();
	
	WebElement bank = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	bank.click();
	WebElement order = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	order.click();
	
	}
	

}
