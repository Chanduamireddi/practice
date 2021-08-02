import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	   //String link = driver.findElement(By.xpath("//a[text()='SoapUI']")).getAttribute("href");
		
	   List<WebElement> link = driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul/li/a"));
	   
	   SoftAssert a = new SoftAssert();
	  
	   for(WebElement li : link)
	   {
		   String links = li.getAttribute("href");
		   
		   HttpURLConnection connect = (HttpURLConnection) new URL(links).openConnection();
		   
		   connect.setRequestMethod("HEAD");
		   
		   connect.connect();
		   
		   int code = connect.getResponseCode();
		   
		   a.assertTrue(code<400, li.getText()+" link is broken with response code "+code);
		   
	   }
	   
	   a.assertAll();
	   
	   driver.quit();
	   


	}

}
