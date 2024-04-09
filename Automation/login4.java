package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class login4 extends login1{
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Webdriver();
		geturl();
		wrong_details();
		 login();
		 tc5_validate();
	} public static void wrong_details() throws InterruptedException {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("123");
		Thread.sleep(4000);
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("22131");
		Thread.sleep(4000);
		 }
	   public static void tc5_validate() throws InterruptedException {
			String error=driver.findElement(By.xpath("//div[@id='error']")).getText();
			System.out .println("Error Message:" + error+ "is displayed");
			System.out.println("TC5 is passed");
			Thread.sleep(1000);
	}

}
