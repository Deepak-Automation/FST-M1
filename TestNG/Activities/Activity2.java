package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void Setup() {
        //Installing Gecko Driver

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Initialize the firefox driver
        //opening the page
        driver.get("https://v1.training-support.net/selenium/target-practice");
        Reporter.log("Browser open");
    }

    @Test
    public void testMethod1() {
        Assert.assertEquals(driver.getTitle(), "Target Practice");
        Reporter.log(" page loaded");

    }

    @Test
    public void testmethod2() {
        //This test case will Fail

        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));

        Assert.assertTrue(blackButton.isDisplayed());

        Assert.assertEquals(blackButton.getText(), "Black");

    }
    @Test(enabled = false)

    public void testCase3() {

        //This test will be skipped and not counted

        String subHeading = driver.findElement(By.className("sub")).getText();

        Assert.assertTrue(subHeading.contains("Practice"));

    }

    @AfterClass

    public void tearDown() {

        //driver closing

        driver.quit();
    }
}
