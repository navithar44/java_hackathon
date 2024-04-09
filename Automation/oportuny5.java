package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class oportuny5 extends testcase1 {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loginpage();
		WebElement opportunities=driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunities.click();
		WebElement qtrly_interval=driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select interval=new Select(qtrly_interval);
		interval.selectByVisibleText("Previous FQ");
		WebElement qtrly_include=driver.findElement(By.xpath("//select[@id='open']"));
		Select include=new Select(qtrly_include);
		include.selectByVisibleText("Closed/Won Opportunities");
		WebElement run_report=driver.findElement(By.xpath("//input[@title='Run Report']"));
		run_report.click();
		System.out.print("Tc-20 is passed:");
		
	}

}

