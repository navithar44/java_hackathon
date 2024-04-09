package Automationtestcases;
import org.openqa.selenium.By;
public class contact5 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		driver.switchTo().defaultContent();
		display_contact();
		System.out.print("Tc-30 is passed:");
	}
		public static void display_contact() throws InterruptedException {
			Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='hotListElement']"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='list']"));
		Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href='/001bm0000013ZFC']")).click();
	Thread.sleep(2000);
	}
}

