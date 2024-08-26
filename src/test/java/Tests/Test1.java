package Tests;

import Data.Data1;
import JavaDriver.SetUpDriver1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    static WebDriver driver;

    @Test
    public void Test1() throws InterruptedException {
        driver = SetUpDriver1.setUpdriver();
        driver.get("https://www.myauto.ge/ka");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
