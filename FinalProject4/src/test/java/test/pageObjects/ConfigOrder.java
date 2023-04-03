package test.pageObjects;

import static org.hamcrest.CoreMatchers.startsWith;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ConfigOrder {
    private final WebDriver driver;
    final String host="https://qa-scooter.praktikum-services.ru/";
    public ConfigOrder(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver.get(host);
    }
    public void acceptCookies()
    {
        driver.findElement(MainPageScooter.cookies).click();
    }

    public void getOrder() {
         driver.findElement(MainPageScooter.orderButton).click();
    }
    public void setName(String name)
    {
        driver.findElement(PageOrder.inputName).sendKeys(name);
    }

    public void setSurname(String surname)
    {
        driver.findElement(PageOrder.inputSurname).sendKeys(surname);
    }

    public void setAddress(String address)
    {
        driver.findElement(PageOrder.inputAddress).sendKeys(address);
    }

    public void setMetro()
    {
        driver.findElement(PageOrder.inputMetro).sendKeys(Keys.DOWN, Keys.ENTER);
    }

    public void setPhoneNumber(String numberPhone)
    {
        driver.findElement(PageOrder.inputPhone).sendKeys(numberPhone);
    }

    public void setNextButton()
    {
        driver.findElement(PageOrder.buttonNext).click();
    }

    public void setArrivalDate(String arrival)
    {
        driver.findElement(PageOrder.inputArrival).sendKeys(arrival+ Keys.ENTER);
    }

    public void setRentalPeriod()
    {
        driver.findElement(PageOrder.inputFieldPeriod).click();
        driver.findElement(PageOrder.inputChoosePeriod).click();
    }

    public void setScooterColor()
    {
        driver.findElement(PageOrder.inputColor).click();
    }

    public void setCommentCourier(String Comment)
    {
         driver.findElement(PageOrder.inputComment).sendKeys(Comment);
    }

    public void setFinalOrder()
    {
        driver.findElement(PageOrder.buttonFinalOrder).click();
    }

    public void clickYesButton()
    {
        driver.findElement(PageOrder.buttonYes).click();
    }
    public void orderVerification()
    {
        WebElement orderMessage = driver.findElement(PageOrder.message);
        String order = orderMessage.getText();
        String orderResult = "Заказ оформлен";
        MatcherAssert.assertThat(order,startsWith(orderResult));
    }
}
