package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Activity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        Actions builder= new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/input-events");

        String PageTitle=driver.getTitle();
        System.out.println(PageTitle);
        //*Press the key of first letter of your name in caps//
        builder.sendKeys("B").build().perform();
        builder.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyDown(Keys.CONTROL).build().perform();
        driver.close();



    }
}
