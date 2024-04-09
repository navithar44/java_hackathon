package Automationtestcases;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class leads2 extends testcase1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		WebElement lead_dropdown=driver.findElement(By.xpath("//Select[@id='fcf']"));
		lead_dropdown.click();
		Select lead =new Select(lead_dropdown);
		 List<WebElement> options = lead.getOptions();
         // Print the values of the dropdown options
	        for (WebElement option : options) {
	            System.out.println("Dropdown options: " + option.getText());
	        }
           System.out.print("Tc-22 is passed:");
           
	}       
}
