package bimarian.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestUI {
	
	//@Test
	public void test01Firefox(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bimarian.com");
		System.out.println("Firefox browser opened and navigated to google site");
		driver.quit();
	}
	
	@Test
	public void test02Chrome(){
		System.setProperty("http.proxyHost", "10.51.233.60");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("http.proxyUser", “vishakha_thakur”);
		System.setProperty("http.proxyPassword", “ajit1712@”);
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://bimarian.com");
		System.out.println("Chrome browser opened and navigated to google site");
		driver.quit();
	}
}
