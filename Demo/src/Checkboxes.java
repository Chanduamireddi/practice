import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());

		Boolean b = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();

		if (!b) {

			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();

		}

		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());

		List<WebElement> element = driver.findElements(By.xpath("//*[@type='checkbox']"));

		int count = element.size();

		for (WebElement el : element) {
			System.out.println(el.getText());
		}

		System.out.println(count);

		Assert.assertEquals(6, count);

		System.out.println("End of Script");

		driver.quit();

	}

}
