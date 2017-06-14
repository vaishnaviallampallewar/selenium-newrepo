package bimarian.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestUI {
	
	//@Test
	public void test01Firefox(){
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setCapability("platform", Platform.ANY);
		capability.setCapability("binary", "/ms/dist/fsf/PROJ/firefox/16.0.0/bin/firefox"); //for linux
		WebDriver currentDriver = new RemoteWebDriver(new URL("http://10.51.233.60:4444/wd/hub"), capability);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bimarian.com");
		System.out.println("Firefox browser opened and navigated to google site");
		driver.quit();
	}
	
	@Test
	public void test02Chrome(){
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://bimarian.com");
		System.out.println("Chrome browser opened and navigated to google site");
		driver.quit();
	}
}
