package Automationtestcases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class account4 extends testcase1
{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  loginpage();
	    acounts_tab();
	    present_date();
	    create_report();
	    System.out.println("Tc-15 is passed:");
	    
	}
	     public static void acounts_tab() {
		WebElement accounts_tab=driver.findElement(By.xpath("//a[text()='Accounts']"));
		accounts_tab.click();
		WebElement accounts_report=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		accounts_report.click();
	    }
		public static void present_date() throws InterruptedException {
			Thread.sleep(3000);
		WebElement to_date=driver.findElement(By.xpath("//input[@id='ext-comp-1042']"));
		to_date.clear();
		Thread.sleep(5000);
		LocalDate currentDate = LocalDate.now();
        // Convert LocalDate to String with desired format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        String date = currentDate.format(formatter);
	        to_date.sendKeys(date);
		Thread.sleep(3000);
		WebElement save=driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		save.click();
		}
		public static void create_report() throws InterruptedException 
		{
		
		WebElement report_name=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		report_name.sendKeys("report03");
		Thread.sleep(2000);
		
		WebElement report_uniqname=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		Thread.sleep(2000);
		
		report_uniqname.click();
		
	    WebElement save_run=driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));
		Thread.sleep(2000);
		save_run.click();
		}
		
		}


