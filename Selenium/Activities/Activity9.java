package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();

        WebDriverWait Wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/ajax");
        driver.findElement(By.xpath("//button[text()='Change Content']")).click();
        // driver.findElement(By.className("violet")).click();
        String Heading1= Wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();

        Wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));

        String Heading3=driver.findElement(By.tagName("h3")).getText();
        System.out.println(Heading3);




        driver.quit();


    }

    public static class Activity2 {

        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get(" https://v1.training-support.net/selenium/login-form");

            String PageTitle=driver.getTitle();
            System.out.println(PageTitle);

                    //driver.findElement(By.id("username")).sendKeys("admin");
                    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");


           // driver.findElement(By.name("Password")).sendKeys("password");

            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
           // driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();
            driver.findElement(By.xpath("//button[text()=\\\"Log in\\\"]")).click();


           // driver.quit();

    //button[text()=\"Log in\"]

        }
    }
}
