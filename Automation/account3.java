package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class account3 extends account2{
	//account2 acct3;
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//account2 acct3=new account2();
loginpage();
accounts();
viewlist();

edit_view();
System.out.print("Tc-13 is passed:");
}
public static void accounts()
{
WebElement accounts_tab=driver.findElement(By.xpath("//a[text()='Accounts']"));
accounts_tab.click();
}
public static void viewlist() 
{
WebElement list_view=driver.findElement(By.xpath("//select[@title='View:']"));
Select view=new Select(list_view);
view.selectByIndex(3);
WebElement edit=driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
edit.click();
}
public static void edit_view() {
WebElement edit_view_name=driver.findElement(By.xpath("//input[@id='fname']"));
edit_view_name.clear();
edit_view_name.click();
edit_view_name.sendKeys("newviewname33");

WebElement filters=driver.findElement(By.xpath("//select[@id='fcol1']"));
Select account_name=new Select(filters);
account_name.selectByVisibleText("Account Name");

WebElement operators=driver.findElement(By.xpath("//select[@id='fop1']"));
Select operator_contains=new Select(operators);
operator_contains.selectByVisibleText("contains");

WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
value.clear();
value.sendKeys("a");

WebElement select_fields_list=driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
Select select_fields=new Select(select_fields_list);
select_fields.selectByVisibleText("Last Activity");

WebElement add=driver.findElement(By.xpath("//a[@id='colselector_select_0_right']"));
add.click();

WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
save.click();

	}

}
