import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		Set<String> openedWindows = driver.getWindowHandles();

		Iterator<String> it = openedWindows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		String mail = driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]/strong/a")).getText();
		System.out.println(mail);

		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("User Name");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password");

		for (String windows : openedWindows) {
			System.out.println(windows);
		}

		driver.quit();

	}

}
