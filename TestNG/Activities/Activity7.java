/*Data Driven */

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {

    WebDriver driver;

    @BeforeClass
    public void Setup() {
        //Installing Gecko Driver

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Initialize the firefox driver
        //opening the page
        driver.get("https://v1.training-support.net/selenium/login-form");

    }
    @DataProvider(name = "Creds")
    public Object[][] credentials() {

        return new Object[][]{
                {"admin", "password", "Welcome Back, admin"},
                {"123", "XTY", "Invalid Credentials"}

        };
    }
    @Test(dataProvider = "Creds")
    public void loginTest(String username, String password, String Message) {
        WebElement UsernameField = driver.findElement(By.id("username"));

        WebElement PasswordField = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.xpath("//button[text()='Log in']"));

        UsernameField.clear();
        PasswordField.clear();

        UsernameField.sendKeys(username);
        PasswordField.sendKeys(password);
        submit.click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();

        Assert.assertEquals(Message, loginMessage);


    }
    @AfterClass
    public void Cleanup() {

        driver.quit();
    }
}
