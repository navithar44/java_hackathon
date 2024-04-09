package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class contact3 extends testcase1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		check_contact();
		System.out.print("Tc-28 is passed:");
	}
		public static void check_contact() {
		WebElement recent_created=driver.findElement(By.xpath("//Select[@id='hotlist_mode']"));
		Select Recent_contact=new Select(recent_created);
		Recent_contact.selectByVisibleText("Recently Created");
	}

}
