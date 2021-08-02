import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Actions ac = new Actions(driver);

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

	//	frameByElement(driver, ac);

		frameByIndex(driver, ac);
		
		driver.switchTo().defaultContent();
		
		driver.quit();

	}

	private static void frameByIndex(WebDriver driver, Actions ac) {
		// TODO Auto-generated method stub
        System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='draggable']")).click();

		ac.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),
				driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();

		System.out.println("Test Successfull");

	}

	private static void frameByElement(WebDriver driver, Actions ac) {
		// TODO Auto-generated method stub

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//div[@id='draggable']")).click();

		ac.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),
				driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();

		System.out.println("Test Successfull");

	}

}

