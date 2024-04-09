package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class contact7 extends contact6{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		contact_tab();
		view_tab();
		System.out.print("Tc-32 is passed:");
		}
		public static void view_tab() throws InterruptedException {
	    WebElement view_name=driver.findElement(By.xpath("//input[@id='fname']"));
	    view_name.sendKeys("ABCD");
	    
	   WebElement unique_name=driver.findElement(By.xpath("//input[@id='devname']"));
	   Thread.sleep(2000);
	   unique_name.clear();
	   unique_name.sendKeys("EFGH");
	   Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@title='Cancel']")).click();

	}

}
