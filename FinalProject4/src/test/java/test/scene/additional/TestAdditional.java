package test.scene.additional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.pageObjects.ConfigAdditional;


public class TestAdditional {
    private WebDriver driver;
    private ConfigAdditional configAdditional;

    @BeforeEach
    public void Driver()
    {
        driver = new ChromeDriver();
        configAdditional = new ConfigAdditional(driver);
    }

    @Test
    public void checkLogoScooterGetMainPage()
    {
        configAdditional.getLogoScooter();
        configAdditional.getTrueUrl(ConfigAdditional.urlScooter);
    }

    @Test
    public void checkLogoYandexGetMainPageYandex()
    {
        configAdditional.getLogoYandex();
        configAdditional.getTrueUrl(ConfigAdditional.urlYandex);
    }

    @Test
    public void checkErrorGetMessageError() { configAdditional.getMessageError();}

    @Test
    public void checkStatusOrderGetNoOrder()
    {
        configAdditional.clickOrderStatus();
        configAdditional.setNumberOrder();
        configAdditional.clickGo();
        configAdditional.getNoOrder();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
