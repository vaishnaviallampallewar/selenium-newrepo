package bimarian.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestUI {
	
	//@Test
	public void test01Firefox(){
		System.setProperty("webdriver.firefox.driver", "/usr/bin/firefox");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bimarian.com");
		System.out.println("Firefox browser opened and navigated to bimarian site");
		driver.quit();
	}
	
	@Test
	public void test02Chrome(){
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Lets see what happens !!! what is goingn on");
		driver.quit();
	}
}
