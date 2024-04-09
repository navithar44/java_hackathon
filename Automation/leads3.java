package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class leads3 extends testcase1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		lead_tab();
		user_menu();
		loginpage();
		new_leadinfo();
		
		System.out.print("Tc-23 is passed:");
	}
		public static void lead_tab() throws InterruptedException
		{
		WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		WebElement lead_dropdown=driver.findElement(By.xpath("//Select[@id='fcf']"));
		Select lead=new Select(lead_dropdown);
		lead.selectByVisibleText("My Unread Leads");
		}
		public static void user_menu() throws InterruptedException {
		WebElement usermenus = driver.findElement(By.id("userNavLabel"));
		usermenus.click();
		Thread.sleep(8000);
		WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		}
		public static void new_leadinfo() throws InterruptedException {
		WebElement leads1=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads1.click();
		Thread.sleep(2000);
		WebElement go=driver.findElement(By.xpath("//input[@title='Go!']"));
		go.click();
		}
		
	}


