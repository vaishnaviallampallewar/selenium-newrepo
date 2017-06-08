package com.memorynotfound.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSeleniumTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();
    }

    @Test
    public void testFireFoxSelenium() {
        driver.get("http://www.memorynotfound.com/");
    }

    @AfterClass
    public static void cleanUp(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
