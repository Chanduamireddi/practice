import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());

		if (driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected()) {
			driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		}

		Thread.sleep(3000);

		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());

		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());

		System.out.println("End of Script");

		driver.quit();

	}

}
