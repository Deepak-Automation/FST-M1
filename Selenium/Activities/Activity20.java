package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity20 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        driver.findElement(By.id("prompt")).click();
        //*Switch to Prompt//

        Alert Confirmation = driver.switchTo().alert();
        System.out.println(" prompt confirmations" + Confirmation.getText());
        //Confirmation.accept();
        //Confirmation.dismiss();
        Confirmation.sendKeys("test1");
        Confirmation.accept();

        driver.quit();


    }
}
