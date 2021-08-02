import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		// driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		//driver.findElement(By.name("pw")).sendKeys("Password");
//		driver.findElement(By.cssSelector("#password")).sendKeys("password");
//		String s= driver.findElement(By.linkText("Forgot Your Password?")).getText();
//		System.out.println(s);
//		driver.findElement(By.xpath("//input[@id='Login']")).click();
//	   // driver.findElement(By.linkText("Forgot Your Password?")).click();	
//		String error = driver.findElement(By.xpath("//*[@id='error']")).getText();
//		System.out.println(error);
		driver.findElement(By.cssSelector("input#username")).sendKeys("username");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("css value");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		System.out.println("Script End");
		Thread.sleep(2000);
		driver.quit();

	}

}
