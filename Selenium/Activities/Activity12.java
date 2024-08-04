package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);

        WebElement textbox = driver.findElement(By.id("input-text"));
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        driver.quit();
    }
}