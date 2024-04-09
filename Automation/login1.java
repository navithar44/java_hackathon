package Automationtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class login1 
{
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Webdriver();
		geturl();
		username();
		password();
		login();
		validate_error();
	}
	
       public static void Webdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		public static void geturl() throws InterruptedException {
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
	    driver.manage().window().maximize();
		}
		public static void username() throws InterruptedException {
	    WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("navitha@patel.com");
		Thread.sleep(4000);
		}
		public static void password() {
		
		WebElement password= driver.findElement(By.id("password"));
		password.clear();
		}
		public static void login() throws InterruptedException {
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(3000);}
		public static void validate_error() throws InterruptedException {
		String error=driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out .println("Error Message:" + error+ "is displayed");
		System.out.println("TC1 is passed");
		Thread.sleep(1000);
		
	}

}
