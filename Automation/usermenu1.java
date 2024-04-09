package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class usermenu1 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement usermenus = driver.findElement(By.id("userNavLabel"));
		usermenus.click();
		Thread.sleep(2000);
		System.out.println("user menus drop down list:");
		System.out.println(driver.findElement(By.xpath("//a[@title='My Profile']")).getText()); 
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//a[@title='My Settings']")).getText());
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).getText()); 
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience'] ")).getText()); 
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//a[@title='Logout']")).getText());
		Thread.sleep(4000);
	    WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		driver.close();
		System.out.print("Tc-6 is passed");
	}

}
