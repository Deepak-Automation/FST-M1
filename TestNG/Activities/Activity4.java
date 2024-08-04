package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {

    public class DemoTwo {
        @Test
        public void TestCase() {
            System.out.println("I'm in the test case from DemoTwo Class");
        }
    }

}
