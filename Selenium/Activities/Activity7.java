package practice_activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        Actions builder= new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/drag-drop");

        String PageTitle=driver.getTitle();
        System.out.println("page Title is "+ PageTitle);

        WebElement Dropzone1= driver.findElement(By.id("droppable"));
        WebElement Football= driver.findElement(By.id("draggable"));
        WebElement DropZone2= driver.findElement(By.id("dropzone2"));
       builder.dragAndDrop(Football,Dropzone1).build().perform();
       Thread.sleep(2000);
      String DropMessage= Dropzone1.getText();

        System.out.println(DropMessage);
        //driver.navigate().refresh();
        builder.dragAndDrop(Football,DropZone2).build().perform();
        String DropMessage2= DropZone2.getText();
        System.out.println(DropMessage2);
        driver.navigate().refresh();

        driver.quit();



    }
}
