package Automationtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class random4 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		All_tab();
		remove_tab();
		user_menu();
		loginpage();
		System.out.print("Tc-36 is passed:");
	}
		public static void All_tab() {
		WebElement all_tab=driver.findElement(By.xpath("//li[@id='AllTab_Tab']"));
		all_tab.click();
		WebElement customize_tab=driver.findElement(By.xpath("//input[@class='btnImportant']"));
		customize_tab.click();
		}
		public static void remove_tab() {
		WebElement selected_tab=driver.findElement(By.xpath("//Select[@id='duel_select_1']"));
		Select tab_to_remove= new Select(selected_tab);
		tab_to_remove.selectByVisibleText("Leads");
		WebElement arrow_remove=driver.findElement(By.xpath("//img[@title='Remove']"));
		arrow_remove.click();
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		}
		public static void user_menu() {
		WebElement usermenus = driver.findElement(By.id("userNavLabel"));
		usermenus.click();
		WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		}
	}


