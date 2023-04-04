package test.scene.additional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.pageObjects.ConfigLogoErrorNoOrder;
import test.pageObjects.ConfigOrder;


public class TestLogoErrorNoOrder {
    private WebDriver driver;
    private ConfigLogoErrorNoOrder configLogoErrorNoOrder;
    private ConfigOrder configOrder;

    @Before
    public void Driver()
    {
        driver = new ChromeDriver();
        configLogoErrorNoOrder = new ConfigLogoErrorNoOrder(driver);
        configOrder = new ConfigOrder(driver);
    }

    @Test
    public void checkLogoScooterGetMainPage()
    {
        configLogoErrorNoOrder.getLogoScooter();
        configLogoErrorNoOrder.getTrueUrl(ConfigLogoErrorNoOrder.urlScooter);
    }

    @Test
    public void checkLogoYandexGetMainPageYandex()
    {
        configLogoErrorNoOrder.getLogoYandex();
        configLogoErrorNoOrder.getTrueUrl(ConfigLogoErrorNoOrder.urlYandex);
    }

    @Test
    public void checkFormOneErrorGetMessageError() { configLogoErrorNoOrder.getMessageErrorFormOne();}

    @Test
    public void checkFormTwoErrorGetMessageError()
    {
        configOrder.acceptCookies();
        configOrder.getOrder();
        configOrder.setName("Виолетта");
        configOrder.setSurname("Вашина");
        configOrder.setAddress("Кабяка");
        configOrder.setMetro();
        configOrder.setPhoneNumber("+375295873656");
        configOrder.setNextButton();
        configLogoErrorNoOrder.getMessageErrorFormTwo();
    }

    @Test
    public void checkStatusOrderGetNoOrder()
    {
        configOrder.acceptCookies();
        configLogoErrorNoOrder.clickOrderStatus();
        configLogoErrorNoOrder.setNumberOrder();
        configLogoErrorNoOrder.clickGo();
        configLogoErrorNoOrder.getNoOrder();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
