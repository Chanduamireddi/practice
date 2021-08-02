import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handlingssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Desired capabilities
		DesiredCapabilities ds = DesiredCapabilities.chrome();
		//ds.acceptInsecureCerts();
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Pass desired capabilities to chrome options
		ChromeOptions cp = new ChromeOptions();
		cp.merge(ds);
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(cp);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Clear all cookies
		driver.manage().deleteAllCookies();
		
		/*
		 * //Delete session id in coockies
		 * driver.manage().deleteCookieNamed("sessionkey");
		 */

		driver.get("https://www.google.com/");
		
		driver.quit();
	}

}
