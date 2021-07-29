import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		
		WebElement dropcurrency = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		
		
		//dropdown
	//	Select sel = new Select(droppass);
		
//		sel.selectByIndex(0);
//		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")).getText());
//	    sel.selectByIndex(1);
//		Thread.sleep(2000);
//		sel.selectByValue("INR");
//		Thread.sleep(2000);
//		sel.selectByVisibleText("USD");
//		System.out.println(sel.getFirstSelectedOption().getText());
//		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText());
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
	
		driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		
		for(int i=1; i<4; i++)
		{
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		}
		
		for(int i=1; i<4; i++)
		{
			driver.findElement(By.xpath("//*[@id='hrefIncChd']")).click();
		}
		
		for(int i=1; i<3; i++)
		{
			driver.findElement(By.xpath("//*[@id='hrefIncInf']")).click();
		}
		
		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText());
		
		System.out.println("End of script1");
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //*[@value='BLR']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='MAA']")).click();
		
	//	driver.findElement(By.xpath("(//*[@value='BLR'])[1]")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//*[@value='MAA']")).click();
  
		driver.quit();

	}
	


}
