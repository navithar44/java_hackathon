package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class usermenu5 extends testcase1{
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
loginpage();
driver.findElement(By.id("userNavLabel")).click();;
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title='Logout']")).click();
System.out .print("Tc-10 is passed");
}
}
