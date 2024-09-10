package JavaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetUpDriver1 {

    public static void main(String[] args) {
        method1();
    }
public static WebDriver method1(){

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    return driver;
}
}
