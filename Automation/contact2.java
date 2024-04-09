package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class contact2 extends contact1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		contact_tab();
		create_view();
		System.out.print("Tc-27 is passed:");
	}
		public static void contact_tab() {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		}
		public static void create_view() throws InterruptedException {
        WebElement name=driver.findElement(By.xpath("//input[@id='fname']"));
        name.clear();
        name.sendKeys("contactview11");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='devname']")).click();
        driver.findElement(By.xpath("//input[@title='Save']")).click();
		}
	}


