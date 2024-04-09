package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class leads5 extends testcase1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		leads_tab();
		create_lead();
		System.out.print("Tc-25 is passed:");
	}
		public static void leads_tab() {
		WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		WebElement new_button=driver.findElement(By.xpath("//input[@title='New']"));
		new_button.click();}
		public static void create_lead() throws InterruptedException {
		WebElement lastname=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		lastname.sendKeys("ABCD");
		Thread.sleep(2000);
		WebElement company_name=driver.findElement(By.xpath("//input[@id='lea3']"));
		company_name.sendKeys("ABCD");
		WebElement lead_status_dropdown=driver.findElement(By.xpath("//Select[@id='lea13']"));
		Select lead=new Select(lead_status_dropdown);
		lead.selectByVisibleText("Working - Contacted");
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		}
	}


