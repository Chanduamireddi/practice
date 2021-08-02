import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		//Scenario1: Print no of rows in table
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='block large-row-spacer']/div/fieldset/table/tbody/tr"));
		
		System.out.println(rows.size());
		
		//Scenario2 : Print no of Columns in table
		 
		List<WebElement> colomns = driver.findElements(By.xpath("//*[@class='block large-row-spacer']/div/fieldset/table/tbody/tr[3]/td"));
		
		System.out.println(colomns.size());
		
		//Scenario3: print second row in table
		
		for(int j=0;j<colomns.size();j++)
		{
			
				//	System.out.println(colomns.get(j).getText());
			
			System.out.println(rows.get(2).findElements(By.xpath("//*[@class='block large-row-spacer']/div/fieldset/table/tbody/tr[3]/td")).get(j).getText());
		}


		
		driver.quit();
		
		

	}

}
