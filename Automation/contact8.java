package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class contact8 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		contacts() ;
		create_contact();
		System.out.print("Tc-33 is passed:");
		}
		public static void contacts() {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		driver.findElement(By.xpath("//input[@title='New']")).click();
		}
		public static void create_contact() throws InterruptedException {
		WebElement last_name=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		last_name.clear();
		last_name.sendKeys("Indian");
		Thread.sleep(1000);
		WebElement account_name=driver.findElement(By.xpath("//input[@id='con4']"));
		account_name.clear();
		Thread.sleep(2000);
		account_name.sendKeys("Global Media");
		driver.findElement(By.xpath("//input[@title='Save & New']")).click();

	}

}
