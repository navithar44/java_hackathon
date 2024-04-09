package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class oportuny3 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement opportunities=driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunities.click();
		WebElement opportunity_pipeline=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		opportunity_pipeline.click();
		System.out.print("Tc-18 is passed:");

	}

}
