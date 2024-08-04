package project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ProjectActivity9 {
        WebDriver driver;

        @BeforeClass
        public void setUp() {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

    @Test
        public void printUsernamesAndFullNamesFromLeadsPage() {
            
            String url = "http://alchemy.hguy.co/crm";
            driver.get(url);
            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("username_password")).sendKeys("password"); 
            driver.findElement(By.id("bigbutton")).click();

            
            driver.findElement(By.id("grouptab_0")).click(); 
            driver.findElement(By.id("moduleTab_9_Leads")).click();

            
            try {
                Thread.sleep(3000);  
            } 
			catch (InterruptedException e) {
                e.printStackTrace();
            }

           
            List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr"));
            for (WebElement row : rows) {
                WebElement usernameElement = row.findElement(By.xpath(".//td[9]"));  
                WebElement fullNameElement = row.findElement(By.xpath(".//td[3]"));
                String username = usernameElement.getText();
                String fullName = fullNameElement.getText();
                System.out.println("Username: " + username + ", Full Name: " + fullName);
            }
        }

        @AfterClass
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }