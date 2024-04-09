package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class random3 extends testcase1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		home_tab();
		edit_link();
		about_tab();
		System.out.print("Tc-35 is passed:");
	}
		public static void home_tab() throws InterruptedException 
		{
		WebElement home=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		home.click();
		WebElement recent_items=driver.findElement(By.xpath("//div[@class='recentItemModule sidebarModule']"));
		Actions action=new Actions(driver);
		action.moveToElement(recent_items).click();
		Thread.sleep(2000);
		WebElement user_link=driver.findElement(By.xpath("(//a[@href='/005bm0000009fT3'])[1]"));
		user_link.click();
		}
		
		public static void edit_link()
		{
		WebElement edit_profile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
		edit_profile.click();
		}
		public static void about_tab() throws InterruptedException
		{
		Thread.sleep(1000);
		driver.switchTo().frame("contactInfoContentId");
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		lastname.sendKeys("Abcd");
		WebElement saveall=driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
	}
	}


