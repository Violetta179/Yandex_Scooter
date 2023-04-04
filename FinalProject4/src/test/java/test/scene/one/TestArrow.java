package test.scene.one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.pageObjects.ConfigArrow;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArrow {
    private WebDriver driver;
    private ConfigArrow configArrow;

    @Before
    public void  setUp()
    {
        driver = new ChromeDriver();
        configArrow = new ConfigArrow(driver);

    }

    @Test
    public void testClickArrowGetText() {
        configArrow.acceptCookies();
        for (int i =0; i<8;i++)
        {
            configArrow.getArrow(i);
            configArrow.getTextElement(i);
            assertTrue(configArrow.getTextElement(i).isEnabled());
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
