import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("a")).size());

		// limiting WebDriver scope

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// limiting WebDriver scope 2

		WebElement subfooterdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		int linksCount = subfooterdriver.findElements(By.tagName("a")).size();
		
		System.out.println(linksCount);
		
		// Check sub footer links are working fine
		
		for(int i=1;i<linksCount;i++)
		{
			String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			subfooterdriver.findElements(By.tagName("a")).get(i).sendKeys(keys);

		}
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		// it.next();  
		
		while(it.hasNext())
		{
			String win = it.next();
			String wintittle = driver.switchTo().window(win).getTitle();
			System.out.println(wintittle);
		}
		
		driver.quit();

	}

}
