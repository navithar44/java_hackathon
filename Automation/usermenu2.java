package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class usermenu2 extends testcase1 {
	public static void post_screen() throws Exception 
	{
	WebElement post=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
	Thread.sleep(2000);
	post.click();
	Thread.sleep(1000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
	driver.findElement(By.xpath("//body")).sendKeys("Hello!");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//input[@title='Share']")).click();
	 }
	public static void file_link() throws InterruptedException {
		user_menus_tab();
		WebElement file=driver.findElement(By.xpath("//a[@title='File']"));
		Thread.sleep(1000);
		file.click();
		Thread.sleep(2000);
		file.click();
		driver.findElement(By.xpath("//td[@id='chatterUploadFileActionPanel']")).click();
		WebElement choose_file=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		Thread.sleep(2000);
		choose_file.sendKeys("/Users/apple/Desktop/M-tc7.png");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@title='Share']")).click();
	}
	public static void add_photo() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='photoSection']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		WebElement browse=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));;
		Thread.sleep(2000);
		browse.sendKeys("/Users/apple/Desktop/dwn.jpeg");
		Thread.sleep(2000);
		WebElement move=driver.findElement(By.xpath("//div[@class='uploadButtonPanel']"));
		Thread.sleep(3000);
		WebElement save=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        loginpage();
        //user_menus_tab();
       // post_screen();
        file_link();
        //add_photo(); 
        //about_tab();
        System.out.println("Tc-7 is passed");
	}  public static void user_menus_tab() throws InterruptedException 
        {
        WebElement usermenus = driver.findElement(By.id("userNavLabel"));
		usermenus.click();
		Thread.sleep(1000);
		WebElement myprofile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		myprofile.click();
		}
		public static void about_tab() throws InterruptedException 
		{
			user_menus_tab();
		WebElement edit_profile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
		edit_profile.click();
		Thread.sleep(1000);
		driver.switchTo().frame("contactInfoContentId");
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		lastname.sendKeys("rdy");
		WebElement saveall=driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
	}

}

	
		
