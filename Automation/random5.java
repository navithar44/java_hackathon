package Automationtestcases;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class random5 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
loginpage();
home_tab();
time_8();
event_edit();
System.out.print("Tc-37 is passed");
}
public static void home_tab() {

WebElement home=driver.findElement(By.xpath("//a[@title='Home Tab']"));
home.click();
driver.findElement(By.xpath("//span[@class='pageDescription']/a")).click();
}
public static void time_8() 
{
WebElement time_frame=driver.findElement(By.xpath("//div[@id='p:f:j_id25']"));
WebElement time_8=driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:28:j_id64']"));
time_8.click();
}
public static void event_edit() throws InterruptedException {
String parent_handle=driver.getWindowHandle();
System.out.println(parent_handle);
driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
Thread.sleep(4000);
Set<String>handle_of_2windows=driver.getWindowHandles();
for(String handle:handle_of_2windows) {
	System.out.println(handle);
	if(!handle.equals(parent_handle)) 
	{
		driver.switchTo().window(handle);
		Thread.sleep(5000);
		System.out.println(handle);
	
driver.findElement(By.xpath("/html"));
driver.switchTo().window(handle);
Thread.sleep(5000);
driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']")).click();
Thread.sleep(3000);
	}
}
driver.switchTo().window(parent_handle);
WebElement time=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
time.clear();
time.sendKeys("9PM");
driver.findElement(By.xpath("(//input[@title='Save'])[1]")).click();
}
}






