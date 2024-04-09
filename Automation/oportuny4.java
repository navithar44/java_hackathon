package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class oportuny4 extends testcase1{
	 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement opportunities=driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunities.click();
		WebElement stuck_opp=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		stuck_opp.click();
		System.out.print("Tc-19 is passed:");

	}

}
