package Automationtestcases;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class account2 extends testcase1{
private static final String[] FIRST_NAMES = {"John", "Emily", "Michael", "Sophia", "Daniel", "Olivia"};
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
loginpage();
accounts_tab();
view_tab();
System.out.print("TC-12 is passed:");
}
public static void accounts_tab()
{
WebElement accounts_tab=driver.findElement(By.xpath("//a[text()='Accounts']"));
accounts_tab.click();
}
public static String random1() {
Random random = new Random();
String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
return firstName;
}
public static void view_tab() throws InterruptedException
{
WebElement create_view=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
create_view.click();
String username = random1();
WebElement view_name=driver.findElement(By.xpath("//input[@id='fname']"));
view_name.sendKeys(username);
Thread.sleep(1000);
WebElement unique_name=driver.findElement(By.xpath("//input[@id='devname']"));
unique_name.click();
Thread.sleep(1000);
WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
save.click();
}
}