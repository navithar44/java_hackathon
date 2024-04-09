package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class login5 extends login1{
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Webdriver();
		geturl();
		tc4_validate();
	}
		public static void tc4_validate() {
	    driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		WebElement err=driver.findElement(By.xpath("//p[@class='username']"));
		System.out.println("password reset message:"+ err.getText());
		System.out.println("Tc_4 is passed");

	}

}
