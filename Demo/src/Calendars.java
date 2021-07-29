import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		
		driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		
		driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']/parent::td/following-sibling::td[1]")).click();
	}

}
