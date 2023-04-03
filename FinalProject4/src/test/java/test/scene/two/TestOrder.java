package test.scene.two;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.pageObjects.ConfigOrder;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestOrder {
    public final String name;
    public final String surname;
    public final String address;
    public final String numberPhone;
    public final String arrival;
    public final String comment;
    private WebDriver driver;
    private ConfigOrder configOrder;


    public TestOrder(String name, String surname, String address, String numberPhone, String arrival, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.numberPhone = numberPhone;
        this.arrival = arrival;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {"Виолетта","Вашина","Кабяка", "+375295873656","21.07.2024","Хорошего дня"},
                {"Иван","Иванов","Иваныч", "+375292222222","23.07.2025","Хорошего вечера"}
        };
        return Arrays.asList(data);
    }

    @Before
    public void getDriver()
    {
        driver = new ChromeDriver();
        configOrder = new ConfigOrder(driver);
    }
    @Test
    public void createOrderShoError() {

        configOrder.acceptCookies();
        configOrder.getOrder();
        configOrder.setName(name);
        configOrder.setSurname(surname);
        configOrder.setAddress(address);
        configOrder.setMetro();
        configOrder.setPhoneNumber(numberPhone);
        configOrder.setNextButton();
        configOrder.setArrivalDate(arrival);
        configOrder.setRentalPeriod();
        configOrder.setScooterColor();
        configOrder.setCommentCourier(comment);
        configOrder.setFinalOrder();
        configOrder.clickYesButton();
        configOrder.orderVerification();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}