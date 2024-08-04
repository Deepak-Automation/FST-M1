package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17
{
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
       String title= driver.getTitle();
        System.out.println(title);
       Select dropdown =new Select(driver.findElement(By.id("single-select")));
       dropdown.selectByVisibleText("Option 2");
       dropdown.selectByIndex(2);
       dropdown.selectByValue("4");
       for(WebElement x :dropdown.getOptions())
        {
            System.out.println(x.getText());
        }


        driver.quit();






    }

}
