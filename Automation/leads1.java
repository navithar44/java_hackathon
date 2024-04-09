package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class leads1 extends testcase1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		System.out.print("Tc-21 is passed:");

		
	}

}
