import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//*[@class='table table-bordered']/thead/tr/th[1]")).click();
		
		
		/*
		 * List<WebElement> list = driver.findElements(By.
		 * xpath("//*[@class='table table-bordered']/tbody/tr/td[1]"));
		 * 
		 * ArrayList<String> originalList = new ArrayList<String>();
		 * 
		 * for(int i =0;i<=list.size();i++) {
		 * 
		 * originalList.add(list.get(i).getText()); }
		 */
		
		//Check the list is sorted or not in table
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]"));
		
		List<String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList)); 	
		
		driver.quit();
		

	}

}
