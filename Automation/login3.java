package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class login3 extends testcase1{

public static void main(String[] args) throws Exception {
		loginpage();
		usermenus();
		logout();
		tc3_validation();
}
		public static void tc3_validation() throws InterruptedException 
		{
			Thread.sleep(3000);
	    WebElement username=driver.findElement(By.xpath("//span[@id='idcard-identity']"));
	    Thread.sleep(6000);
	    System.out.println("email validation:"+ username.getText());
		System.out.println("TC-3 is passed");
	}
		public static void usermenus() throws InterruptedException
		{
		WebElement usermenus = driver.findElement(By.id("userNavLabel"));
		usermenus.click();
		Thread.sleep(2000);
		}
		public static void logout() throws InterruptedException {
			
		WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		
	}
	
		
}
