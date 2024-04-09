package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class random1 extends testcase1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement home=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		home.click();
		WebElement recent_items=driver.findElement(By.xpath("//div[@class='recentItemModule sidebarModule']"));
		Actions action=new Actions(driver);
		action.moveToElement(recent_items).click();
		Thread.sleep(2000);
		WebElement user_link=driver.findElement(By.xpath("(//a[@href='/005bm0000009fT3'])[1]"));
		Thread.sleep(2000);
		user_link.click();
        System.out.print("Tc-34 is passed:");
	}

}
