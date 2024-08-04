package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {


    WebDriver driver;

    @BeforeClass
    public void Setup() {
        //Installing Gecko Driver

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Initialize the firefox driver
        //opening the page
        driver.get("https://v1.training-support.net");
        Reporter.log("Browser open");
    }

    @Test(priority = 1,enabled = false)
    public void testMethod() {
        Assert.assertEquals(driver.getTitle(), "Training Support");
        Reporter.log("Home page loaded");

        driver.findElement(By.id("about-link")).click();
        Assert.assertEquals(driver.getTitle(), "About Training Support");
        Reporter.log("About us page loaded");
    }


    @AfterClass

    public void tearDown() {

        //driver closing

        driver.quit();
    }


}



