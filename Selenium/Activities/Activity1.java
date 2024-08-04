package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net");
        String titlePage = driver.getTitle();
        System.out.println(titlePage);
        driver.findElement(By.id("about-link")).click();
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);

        driver.quit();

    }

}

