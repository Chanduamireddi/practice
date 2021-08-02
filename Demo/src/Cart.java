import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); 

		String prodList[] = { "Brocolli", "Cucumber", "Beetroot","Tomato","Brinjal"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		int count = 0;

		for (int i = 0; i < products.size(); i++) {

			String items[] = products.get(i).getText().split("-");

			String formattedName = items[0].trim();

//			String productName = products.get(i).getText();

			List prodListNeed = Arrays.asList(prodList);

			if (prodListNeed.contains(formattedName)) {

				count++;

				// driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();

				// Thread.sleep(5000); //*[@type='button']
				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();

				if (count == prodList.length) {
					break;
				}

			}
		}
		
		driver.findElement(By.xpath("//*[@class='cart-icon']")).click();
		
		Thread.sleep(5000);

		System.out.println("End of Script");

		driver.quit();

	}

}
