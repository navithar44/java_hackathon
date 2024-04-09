package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class usermenu3 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		usermenus_tab();
		personal_tab();
		display_tab();
		Email_tab();
		calendar_tab();
		System.out .print("Tc-8 is passed");
		
	}

		public static void usermenus_tab() throws InterruptedException
		{
	    WebElement usermenus = driver.findElement(By.id("userNavLabel"));
		usermenus.click();
		Thread.sleep(3000);
		WebElement mysettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		mysettings.click();
		}
		public static void personal_tab() throws InterruptedException 
		{
		WebElement personal_link=driver.findElement(By.id("PersonalInfo_font"));
		personal_link.click();
		Thread.sleep(3000);
		WebElement login_history=driver.findElement(By.id("LoginHistory_font"));
		login_history.click();
		Thread.sleep(3000);
		WebElement downloads=driver.findElement(By.xpath(("//a[contains(text(),'Download')]")));
		downloads.click();
		}
		public static void display_tab() throws InterruptedException {
			Thread.sleep(2000);
		WebElement display_layout=driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
		display_layout.click();
		WebElement customize_my_tabs=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		customize_my_tabs.click();
		WebElement content_dropdown=driver.findElement(By.xpath("//select[@id='p4']"));
		Select content=new Select(content_dropdown);
		content.selectByVisibleText("Salesforce Chatter");
		WebElement report=driver.findElement(By.xpath("//option[@value='report']"));
		Thread.sleep(3000);
		report.click();
		Thread.sleep(2000);
		WebElement add_button=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		add_button.click();
		WebElement save_button=driver.findElement(By.xpath("//input[@name='save']"));
		save_button.click();
		}
		public static void Email_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.id("EmailSetup_font"));
		Email.click();
		Thread.sleep(2000);
		WebElement my_email_settings= driver.findElement(By.id("EmailSettings_font"));
		my_email_settings.click();
		Thread.sleep(2000);
		WebElement email_name=driver.findElement(By.id("sender_name"));
		email_name.clear();
		email_name.sendKeys("Navitha abcd");
		Thread.sleep(2000);
		WebElement email_address=driver.findElement(By.id("sender_email"));
		email_address.clear();
		email_address.sendKeys("navithar44@gmail.com");
		Thread.sleep(2000);
		WebElement automatic=driver.findElement(By.id("auto_bcc1"));
		automatic.click();
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		}
		public static void calendar_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement calendar_reminders=driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		calendar_reminders.click();
		WebElement activity_reminders=driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		activity_reminders.click();
		WebElement open_a_testreminder=driver.findElement(By.xpath("//input[@id='testbtn']"));
		open_a_testreminder.click();
		Thread.sleep(2000);
		}
		}


