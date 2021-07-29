import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demodynamiclocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		//parent child traversing
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("ParentChild");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
