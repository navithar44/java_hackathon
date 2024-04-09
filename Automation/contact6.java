package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class contact6 extends testcase1{
	public static void main(String[] args) throws Exception {
		loginpage();
		contact_tab();
		create_view();
		System.out.println("Tc-31 is passed:");
	}
		public static void contact_tab() {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		}
		public static void create_view() throws InterruptedException {
	   WebElement unique_name=driver.findElement(By.xpath("//input[@id='devname']"));
	   Thread.sleep(2000);
	   unique_name.clear();
	   unique_name.sendKeys("EFGH");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@title='Save']")).click();
	   Thread.sleep(2000);
	   WebElement error_msg=driver.findElement(By.xpath("(//div[@class='errorMsg'])[1]"));
	   System.out.println(error_msg.getText());
	}
	

}
