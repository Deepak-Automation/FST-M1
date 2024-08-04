package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        String PageTitle= driver.getTitle();
        System.out.println(PageTitle);

       WebElement multiSelect= driver.findElement(By.id("multi-select"));

        Select dropdown = new Select(multiSelect);

        dropdown.selectByVisibleText("Javascript");
        dropdown.selectByIndex(4);
        dropdown.selectByIndex(5);
        dropdown.selectByIndex(6);
        dropdown.selectByValue("node");
        Thread.sleep(300);
        dropdown.deselectByIndex(5);

        driver.quit();

    }
}
