package test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ConfigArrow {
    private final WebDriver driver;
    final String host="https://qa-scooter.praktikum-services.ru/";
    public ConfigArrow(WebDriver driver) {
        this.driver = driver;
        driver.get(host);
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
    }
    public void acceptCookies()
    {
         driver.findElement(MainPageScooter.cookies).click();
    }
    public void getArrow(int i) {
        MainPageScooter.findArrows();
        driver.findElement(MainPageScooter.arrows.get(i)).click();
    }
    public WebElement getTextElement(int i)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        MainPageScooter.findTextArrows();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(MainPageScooter.arrowsText.get(i)));
    }
}
