package test.pageObjects;

import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;


public class MainPageScooter {
    //button "yes, everyone is used to it"-accepting cookies
    public static By cookies = By.id("rcc-confirm-button");
    //button "Order"
    public static By orderButton = By.className("Button_Button__ra12g");
    //logo "Scooter"
    public static By logoScooter = By.xpath("/html/body/div/div/div/div[1]/div[1]/a[2]");
    //logo "Yandex"
    public static By logoYandex = By.xpath("/html/body/div/div/div/div[1]/div[1]/a[1]");
    //button "Order status"
    public static By orderStatus= By.xpath("/html/body/div/div/div/div[1]/div[2]/button[2]");
    //text field for entering the order number
    public static By numberOrder = By.xpath("/html/body/div/div/div/div[1]/div[3]/div/input");
    //button "Go!"
    public static By buttonGo = By.xpath("/html/body/div/div/div/div[1]/div[3]/button");
    //buttons arrows
    public static List<By> arrows = new ArrayList<>();
    //the text that appears after clicking the arrows
    public static List<By> arrowsText = new ArrayList<>();

    public static void findArrows()
    {
        for(int i = 0;i<8;i++)
        {
            arrows.add(By.xpath("//div[@id=\"accordion__heading-"+i+"\"]"));
        }
    }

    public static void findTextArrows()
    {
        for(int i = 0;i<8;i++)
        {
            arrowsText.add(By.xpath("//div[@id=\"accordion__panel-"+i+"\"]"));
        }

    }


}
