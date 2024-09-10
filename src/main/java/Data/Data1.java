package Data;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;

public class Data1 {

private WebDriver driver;

private WebDriverWait wait;

    private static class Strings{
        private static final String CarModel = "Dodge";

    }
    public Data1(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='d-flex icon-h-32px icon-h-sm-40px']")
    public WebElement Icon;

    @FindBy(xpath = "/html/body/div[2]/div[1]/header/div/div/div/div[1]/div/input")
    public WebElement Serachfield;

    @FindBy(xpath = "//span[contains(@class,'flex md:items-center')]")
    public WebElement AmountNUmber;

    @FindBy(xpath = "//button[contains(@class,'sticky bottom-[88px] md:static md:bottom-auto flex items-center justify-center w-full h-[40px] md:h-[48px] rounded-8 bg-orange-100 text-white-100 text-12 xl:text-14 font-medium px-12 icon-white text-nowrap border-0')]")
    public WebElement SearchButton;

    @FindBy(xpath = "//a[contains(text(), 'Dodge')]")
    public WebElement AlgorytmDodge;

    public void RunMainPage(){
        driver.get("https://www.myauto.ge/ka");

    }

    public void CheckMainIcon(){
        wait.until(ExpectedConditions.visibilityOf(Icon));
        Icon.isDisplayed();
        System.out.println(Icon.getLocation());
        System.out.println(Icon.getSize());
        System.out.println(Icon.getText());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("Main Icon is Visible ");
    }


public void countcarsdodge() throws InterruptedException {
    Actions actions = new Actions(driver);
    wait.until(ExpectedConditions.visibilityOf(Serachfield)).sendKeys(Strings.CarModel);
    SearchButton.click();
    wait.until(ExpectedConditions.visibilityOf(AlgorytmDodge));
    List<WebElement> WebElementLIst = driver.findElements(By.xpath("//a[contains(text(), 'Dodge')]"));
   /* for (WebElement elements : WebElementLIst) {

        System.out.println(elements.getText());
        System.out.println(elements.getSize());
        //System.out.println(elements.); */
        int productcount = WebElementLIst.size();  // დავითვალეთ გვერდზე პროდუქტების რაოდენობა რომელიც შეიცავს სიტყვა Dodge_ს

        System.out.println(productcount);
        Assert.assertEquals(productcount,19,"it is right");
    }
}









