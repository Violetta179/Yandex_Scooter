package test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConfigAdditional
{
    private final WebDriver driver;

    public static final String urlScooter = "https://qa-scooter.praktikum-services.ru/";
    public static final String urlYandex = "https://dzen.ru/?yredirect=true";
    public static final String host="https://qa-scooter.praktikum-services.ru/";
    public ConfigAdditional(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        driver.get(host);
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
    }


   public void getLogoScooter()
   {
       driver.findElement(MainPageScooter.logoScooter).click();
   }
   public void getTrueUrl(String url)
   {
       String currentWindowHandle = driver.getWindowHandle();
       for (String windowHandle : driver.getWindowHandles()) {
           if (!windowHandle.equals(currentWindowHandle)) {
               driver.switchTo().window(windowHandle);
               break;
           }
       }

       String getUrlScooter = driver.getCurrentUrl();
       assertEquals(url, getUrlScooter);
   }

    public void getLogoYandex()
    {
        driver.findElement(MainPageScooter.logoYandex).click();
    }

    public void getMessageError()
    {
        driver.findElement(MainPageScooter.orderButton).click();
        driver.findElement(PageOrder.buttonNext).click();
        assertTrue(driver.findElement(PageOrder.errorName).isDisplayed());
        assertTrue(driver.findElement(PageOrder.errorSurname).isDisplayed());
        assertTrue(driver.findElement(PageOrder.errorAddress).isDisplayed());
        assertTrue(driver.findElement(PageOrder.errorMetro).isDisplayed());
        assertTrue(driver.findElement(PageOrder.errorPhone).isDisplayed());
    }

   public void clickOrderStatus()
   {
       WebElement Status = driver.findElement(MainPageScooter.orderStatus);
       Status.click();
   }

   public void setNumberOrder()
   {
       new  WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MainPageScooter.numberOrder)).sendKeys("1111");
   }

   public void clickGo()
   {
       new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MainPageScooter.buttonGo)).click();
   }

   public void getNoOrder()
   {
       WebElement img = driver.findElement(PageTrack.noOrder);
       assertTrue(img.isEnabled());

   }
}
