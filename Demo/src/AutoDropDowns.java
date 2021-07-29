import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='autosuggest']")).sendKeys("ind");
		
		List<WebElement> dropoptions = driver.findElements(By.xpath("//*[@class='ui-menu-item']/a"));
		
		Thread.sleep(3000);
		
		System.out.println("End of Script");
		driver.quit();

	}

}
