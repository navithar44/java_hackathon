package Automationtestcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class oportuny1 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		opportunities_tab();
		System.out.print("Tc-16 is passed:");
	}
		public static void opportunities_tab() {
		WebElement opportunities=driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunities.click();
		WebElement opportunities_list=driver.findElement(By.xpath("//select[@id='fcf']"));
		opportunities_list.click();
		Select opportunity =new Select(opportunities_list);
		 List<WebElement> options = opportunity.getOptions();
         // Print the values of the dropdown options
	        for (WebElement option : options) {
	            System.out.println("Dropdown options: " + option.getText());
	        }
		
		}
		
}
	        
