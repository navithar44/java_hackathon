package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class leads4 extends testcase1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		WebElement lead_dropdown=driver.findElement(By.xpath("//Select[@id='fcf']"));
		Select lead=new Select(lead_dropdown);
		lead.selectByVisibleText("Today's Leads");
		WebElement go=driver.findElement(By.xpath("//input[@title='Go!']"));
		Thread.sleep(1000);
		go.click();
		System.out.print("Tc-24 is passed:");

	}
	

}
