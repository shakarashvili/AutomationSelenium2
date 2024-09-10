package Tests;

import Data.Data1;
import JavaDriver.SetUpDriver1;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    static WebDriver driver;

    static WebDriverWait wait;

    static Data1 database;

    @BeforeClass
    public void SetUpdriver(){
        driver = SetUpDriver1.method1();
        database = new Data1(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions Actions = new Actions(driver);

    }

    @AfterClass
    public void Closedriver(){
        driver.quit();
    }


    @Test
    @Description("check out main icon ")
    public void CheckoutMainIcon() throws InterruptedException {
    database.RunMainPage();
    database.CheckMainIcon();

    }
@Test
    @Description("count dodge cars results , what can get website from serach system")
    public void CountDodgegrandCaravanCars() throws InterruptedException {
        database.RunMainPage();
        database.countcarsdodge();



}

}
