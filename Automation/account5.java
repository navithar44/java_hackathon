package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class account5 extends testcase1{
public static void main(String[] args) throws Exception {
	
	loginpage();
	WebElement accounts_tab=driver.findElement(By.xpath("//a[text()='Accounts']"));
	accounts_tab.click();
	merge_accounts();
	WebElement merge=driver.findElement(By.xpath("//input[@title='Merge']"));
	merge.click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	System.out .print("Tc-14 is passed:");
	
}
	public static void merge_accounts() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='toolsContentRight']"));
	driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
	WebElement search_box=driver.findElement(By.xpath("//input[@id='srch']"));
	search_box.click();
	search_box.sendKeys("new");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='srchbutton']")).click();
	driver.findElement(By.xpath("//input[@title='Next']")).click();
	}	

}


