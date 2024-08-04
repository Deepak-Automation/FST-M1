package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=  new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        String PageTitle=driver.getTitle();
        System.out.println(PageTitle);
        WebElement StaticTable= driver.findElement(By.className("striped"));
        System.out.println(StaticTable.getSize());


    }
}
