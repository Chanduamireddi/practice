import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).getAttribute("style"));
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).getAttribute("style"));
		
		driver.quit();

	}

}
