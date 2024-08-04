package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.findElement(By.xpath("//h3[text()='Third header']")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getText());
        System.out.println(driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Grey')]")).getText());
        driver.quit();

    }
}
