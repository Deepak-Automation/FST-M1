package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
    }

    @Test(priority = 2)
    public void simpleAlertTestCase() {
        WebElement Element = driver.findElement(By.id("simple"));
        Element.click();
        Alert alert1 = driver.switchTo().alert();
        String alertMessage = alert1.getText();
        Assert.assertEquals(alertMessage, "This is a JavaScript Alert!");
        alert1.accept();
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {

        WebElement ConfirmAlert = driver.findElement(By.id("confirm"));
        ConfirmAlert.click();
        Alert alert2 = driver.switchTo().alert();
        String pageAlert = alert2.getText();
        Assert.assertEquals(pageAlert, "This is a JavaScript Confirmation!");
        alert2.accept();

    }

    @Test(priority = 0)
    public void promptAlertTestCase() {
        driver.findElement(By.id("prompt")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("NICE");
        String PromptMessage = prompt.getText();
        Assert.assertEquals(PromptMessage, "This is a JavaScript Prompt!");
        prompt.accept();
    }

    @BeforeMethod
    public void defaultContent() {

        driver.switchTo().defaultContent();

    }

    @AfterClass
    public void cleanup() {
        driver.quit();
    }
}
