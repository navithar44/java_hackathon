package Automationtestcases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class random2 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
loginpage();
home_tab();
time_4();
event_edit();
end_time();
recurrence_frame();
System.out.print("Tc-38 is passed");
}
public static void home_tab() {

WebElement home=driver.findElement(By.xpath("//a[@title='Home Tab']"));
home.click();
driver.findElement(By.xpath("//a[@href='/00U/c?md3=89&md0=2024']")).click();
}
public static void time_4() 
{
WebElement time_frame=driver.findElement(By.xpath("//div[@id='p:f:j_id25']"));
WebElement time_4=driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:20:j_id64']"));
time_4.click();
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
}
public static void end_time() 
{
WebElement time=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
time.clear();
time.sendKeys("7PM");
}
public static void recurrence_frame() 
{
driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();
WebElement date=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
LocalDate currentDate = LocalDate.now();
LocalDate twoWeeksLater = currentDate.plusWeeks(2);
// Format the date to match the date picker format (if needed)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String dateString = twoWeeksLater.format(formatter);
date.sendKeys(dateString);
driver.findElement(By.xpath("(//input[@title='Save'])[1]")).click();
driver.findElement(By.xpath("//img[@class='monthViewIcon']")).click();
}
}		

	


