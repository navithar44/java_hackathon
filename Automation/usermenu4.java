6LKKR555R5F5TFRTFRFRFDFRFDSSSSDDDFZZZCXZDDDDDDDDAZCCZZXZXZ6package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import io.github.bonigarcia.wdm.WebDriverManager;
public class usermenu4 extends testcase1
{
public static void main(String[] args) throws Exception 
{
		// TODO Auto-generated method stub
		loginpage();
		usermenu_tab();
		System.out .print("Tc-9 is passed");
}
		public static void usermenu_tab() 
		{
		WebElement usermenu=driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement developer_console=driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		developer_console.click();
		}
}



