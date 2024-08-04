package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Activity5 {

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


    @AfterClass

    public void tearDown() {

        //driver closing

        driver.quit();
    }

}
