package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String PageTitle= driver.getTitle();
        System.out.println(PageTitle);
        driver.findElement(By.id("confirm")).click();
        //*Switch to alert//


         Alert Confirmation= driver.switchTo().alert();
        System.out.println(" alert confirmations"+ Confirmation.getText());
        //Confirmation.accept();
        Confirmation.dismiss();
        driver.quit();


    }
}
