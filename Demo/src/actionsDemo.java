import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		overOnElement(driver,ac);
		
		enterTextInCaps(driver,ac);
		
		twiceClick(driver, ac);
		
		rightClick(driver, ac);
		
		System.out.println("End of Action Methods");
		
		driver.quit();
		


	}

	private static void twiceClick(WebDriver driver, Actions ac) {
		// TODO Auto-generated method stub
		
		ac.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).doubleClick().build().perform();
		
	}

	private static void rightClick(WebDriver driver, Actions ac) {
		// TODO Auto-generated method stub
		
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]"))).contextClick().build().perform();
		
	}

	private static void enterTextInCaps(WebDriver driver, Actions ac) {
		// TODO Auto-generated method stub
		
		ac.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	}

	private static void overOnElement(WebDriver driver, Actions ac) {
		// TODO Auto-generated method stub
		
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]"))).build().perform();
		
	}

}
