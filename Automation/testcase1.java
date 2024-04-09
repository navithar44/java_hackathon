package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {
	static WebDriver driver;
	
	 static void loginpage() throws Exception 
	 {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(4000);
    driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("navitha@patel.com");
	Thread.sleep(4000);
	WebElement password= driver.findElement(By.id("password"));
	password.sendKeys("Salesforce@123");
	Thread.sleep(4000);
	WebElement checkbox=driver.findElement(By.id("rememberUn"));
	checkbox.click();
	Thread.sleep(2000);
	WebElement login = driver.findElement(By.id("Login"));
	login.click();
	Thread.sleep(4000);
	 }
	public static void main(String[] args) throws Exception {
		loginpage();
	
	
}
}