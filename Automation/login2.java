package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class login2 extends login1{
public static void password1() throws InterruptedException 
{
	Thread.sleep(1000);
WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("Salesforce@123");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Webdriver();
		geturl();
		username();
		password1();
		login();
		System.out.println(driver.getTitle());
		System.out.println("TC-2 is passed");
	}
	
		}
	


