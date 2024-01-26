package com.edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BaseValidation {

    String browser = "chrome";
    String url = "https://www.fb.com";

    public static WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterClass
    public void afterTest(){
       driver.quit();
    }

    @Test
    public void urlValidation(){
        String expectedResult = "https://www.facebook.com/";
        String actualResult = driver.getCurrentUrl();

        Reporter.log("Expected Result = " +expectedResult);
        Reporter.log("Actual Result = " +actualResult);

        assertEquals( actualResult, expectedResult);
    }
}
