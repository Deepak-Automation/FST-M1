package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        WebElement checkbox= driver.findElement(By.name("toggled"));
        checkbox.click();
        System.out.println("checkbox is selected :"+ checkbox.isSelected());
        checkbox.isSelected();
        checkbox.click();
        System.out.println("checkbox is selected :"+ checkbox.isSelected());
        driver.quit();


    }

}
