import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		List<WebElement> value = driver.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr/td[4]"));
		
		int sum = 0;
		
		for(int i= 0; i<value.size(); i++)
		{
			sum = sum + Integer.parseInt(value.get(i).getText());
		}
		
		System.out.println("Sum is "+sum);
		
		String[] total = driver.findElement(By.xpath("//*[@class='totalAmount']")).getText().split(":");
		
		int ttotal = Integer.parseInt(total[1].trim());
		
		if(sum==ttotal)
		{
			System.out.println("Both the totals are equal");
		}
		
		Assert.assertEquals(sum, ttotal);
		
		// table 2
		
		List<WebElement> value1 = driver.findElements(By.xpath("//*[@class='block large-row-spacer']/div/fieldset/table/tbody/tr/td[3]"));
		
		int sum1=0;
		
		for(int i =0 ; i<value1.size();i++)
		{
			int num = Integer.parseInt(value1.get(i).getText());
			
			sum1=sum1+num;
			
		}
		
		System.out.println(sum1);
		
		driver.quit();
		
		


	}

}
