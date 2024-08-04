package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity21 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tab-opener");
        String PageTitle= driver.getTitle();
        System.out.println(PageTitle);

        System.out.println(driver.getWindowHandle());
        Thread.sleep(3000);
        driver.findElement(By.id("launcher")).click();

       // driver.getWindowHandle()
        //driver.switchTo().window()
        driver.findElement(By.id("actionButton")).click();



    }
}
