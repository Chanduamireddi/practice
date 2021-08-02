import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusemethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		String prodList[] = { "Brocolli", "Cucumber", "Beetroot", "Tomato", "Brinjal" };

		addItemsToCart(driver, prodList);

		ProceedToCheckOut(driver);

		//Thread.sleep(2000);

		applyPromoCode(driver, w);
		
		placeOrder(driver);
		
		System.out.println("End of Script");
		
		driver.quit();

	}

	private static void placeOrder(WebDriver driver) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
		
	}

	private static void applyPromoCode(WebDriver driver, WebDriverWait w) throws InterruptedException {
		// TODO Auto-generated method stub
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoWrapper']/input")));

		driver.findElement(By.xpath("//*[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//*[@class='promoBtn']")).click();

		//Thread.sleep(5000);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo']")));

		String promoStatus = driver.findElement(By.xpath("//*[@class='promoInfo']")).getText();

		System.out.println(promoStatus);

	}

	private static void ProceedToCheckOut(WebDriver driver) {
		// TODO Auto-generated method stub

		driver.findElement(By.xpath("//*[@class='cart-icon']/img")).click();

		driver.findElement(By.xpath("//*[@class='action-block'] //button[text()='PROCEED TO CHECKOUT']")).click();

	}

	private static void addItemsToCart(WebDriver driver, String prodList[]) {
		// TODO Auto-generated method stub

		int count = 0;

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {
			// System.out.println(products.get(i).getText());

			String[] splitName = products.get(i).getText().split("-");

			String fName = splitName[0].trim();

			List<String> prodListNeed = Arrays.asList(prodList);

			if (prodListNeed.contains(fName)) {
				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();

				if (count == prodListNeed.size()) {
					break;
				}
			}
		}

	}

}
