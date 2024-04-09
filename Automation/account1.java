package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class account1 extends testcase1 {
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		account1 account=new account1();
		loginpage();
		account.accounts();
		account.newaccount();
		account.account_create();
		account.new_acct_tab();
		System.out .print("Tc-11 is passed:");
		
		}
		public void accounts() 
		{
		WebElement accounts_tab=driver.findElement(By.xpath("//a[text()='Accounts']"));
		accounts_tab.click();
		}
		public void newaccount()
		{
		WebElement new_button=driver.findElement(By.xpath("//input[@name='new']"));
		new_button.click();
		}
		public void account_create() 
		{
		WebElement account_name=driver.findElement(By.xpath("//input[@id='acc2']"));
		account_name.click();
		account_name.clear();
		account_name.sendKeys("newaccount11");
		
		WebElement type_dropdown=driver.findElement(By.xpath("//select[@id='acc6']"));
		Select type=new Select(type_dropdown);
		type.selectByVisibleText("Technology Partner");
		
		WebElement customer_priority_dropdown=driver.findElement(By.xpath("//select[@id='00Nbm0000005B9K']"));
		Select customer_priority=new Select(customer_priority_dropdown);
		customer_priority.selectByVisibleText("High");
		
		WebElement save_button=driver.findElement(By.xpath("//input[@title='Save & New']"));
		save_button.click();
		}
		public void new_acct_tab() 
		{
		WebElement new_account=driver.findElement(By.xpath("//span[contains(text(),'newaccount11')]"));
		new_account.click();
		}
		}


