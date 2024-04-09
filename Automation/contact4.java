package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class contact4 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		choose_from_list_tab();
		System.out.print("Tc-29 is passed:");
	}

		
		public static void choose_from_list_tab() {
		WebElement my_contact=driver.findElement(By.xpath("//Select[@id='fcf']"));
		Select my_contacts= new Select(my_contact);
		my_contacts.selectByVisibleText("My Contacts");

	}

}
