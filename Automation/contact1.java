package Automationtestcases;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class contact1 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		contact_tab();
		create_contact();
		System.out.print("Tc-26 is passed:");
	}
	    public static void contact_tab() {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		driver.findElement(By.xpath("//input[@title='New']")).click();
		}
		public static void create_contact() throws InterruptedException {
		WebElement last_name=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		last_name.clear();
		last_name.sendKeys("contact11");
		Thread.sleep(2000);
		String parent_handle=driver.getWindowHandle();
		System.out.println(parent_handle);
		driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
		Thread.sleep(2000);
		Set<String>handle_of_2windows=driver.getWindowHandles();
		for(String handle:handle_of_2windows) {
			System.out.println(handle);
			if(!handle.equals(parent_handle)) 
			{
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				System.out.println(handle);
				WebElement frame=driver.findElement(By.xpath("//frame[@title='Search']"));
				driver.switchTo().frame(frame);
				WebElement text_box=driver.findElement(By.xpath("//input[@id='lksrch']"));
				Thread.sleep(5000);
				text_box.sendKeys("n");
			
				driver.findElement(By.xpath("//input[@title='Go!']")).click();
				driver.switchTo().defaultContent();
				Thread.sleep(4000);

				WebElement frame1=driver.findElement(By.xpath("//frame[@id='resultsFrame']"));
				driver.switchTo().frame(frame1);
				Thread.sleep(2000);
				
		        driver.findElement(By.xpath("//a[@class=' dataCell ']"));
		        driver.findElement(By.xpath("//a[contains(text(),'n')]")).click();
		        Thread.sleep(2000);
		        }
			}
		driver.switchTo().window(parent_handle);
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@title='Save']")).click();
	}

}
