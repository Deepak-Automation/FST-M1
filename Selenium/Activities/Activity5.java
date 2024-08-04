package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);


        driver.get("https://v1.training-support.net/selenium/input-events");
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        //*Left click and print the value of the side in the front*//
        builder.click().build().perform();
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        //*Double click to show a random side and print the number *//
        builder.doubleClick().build().perform();
        String randomText = driver.findElement(By.className("active")).getText();
        System.out.println(randomText);
        //*Right click and print the value shown on the front of the cube//
        builder.contextClick().build().perform();
        String rightText = driver.findElement(By.className("active")).getText();
        System.out.println(rightText);


    }
}
