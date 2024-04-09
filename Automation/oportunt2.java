package Automationtestcases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class oportunt2 extends testcase1 {
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		opp_tab(); 
        op_create();
        System.out .print("Tc-17 is passed:");
}
		public static void opp_tab() 
		{
		WebElement opportunities=driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunities.click();
		WebElement new_button=driver.findElement(By.xpath("//input[@title='New']"));
		new_button.click();
		}
		public static void op_create() 
		{
		WebElement op_name=driver.findElement(By.xpath("//input[@id='opp3']"));
		op_name.sendKeys("oppt123");
		WebElement close_date=driver.findElement(By.xpath("//span[@class='dateFormat']"));
		close_date.click();
		WebElement stage=driver.findElement(By.xpath("//Select[@id='opp11']"));
		Select stage_options=new Select(stage);
		stage_options.selectByIndex(2);
		WebElement leadsource=driver.findElement(By.xpath("//Select[@id='opp6']"));
		Select lead_options=new Select(leadsource);
		lead_options.selectByIndex(2);
		WebElement probability=driver.findElement(By.xpath("//input[@id='opp12']"));
		probability.clear();
		probability.sendKeys("100");
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		}
}
