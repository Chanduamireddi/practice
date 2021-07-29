import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //*[@value='DEL']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='MAA']")).click();
	
//		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		
		driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		for(int i=1; i<3; i++)
		{
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		}
		
		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home'] //*[@value='Search']")).click();
		
		System.out.println("End of Script");
		
		driver.quit();

	}

}
