package test.pageObjects;

import org.openqa.selenium.By;

public class PageOrder {
    //text field "Name"- enter for name
    public static By inputName = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");

    //checking for getting the correct name
    public static By errorName = By.xpath("//div[text()='Введите корректное имя']");
    //text field "Surname"-enter for surname
    public static By inputSurname = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
    //checking for getting the correct name
    public static By errorSurname = By.xpath("//div[text()='Введите корректную фамилию']");
    //text field "Address"-enter for address
    public static By inputAddress = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
    //checking for getting the correct address
    public static By errorAddress = By.xpath("//div[text()='Введите корректный адрес']");
    //select "Metro Station"
    public static By inputMetro = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
    //checking for getting the correct station metro
    public static By errorMetro = By.xpath("//div[text()='Выберите станцию']");
    //text field "Number Phone"
    public static By inputPhone = By.xpath("//html/body/div/div/div[2]/div[2]/div[5]/input");
    //checking for getting the correct number phone
    public static By errorPhone = By.xpath("//div[text()='Введите корректный номер']");
    //button "Next"
    public static By buttonNext = By.xpath("/html/body/div/div/div[2]/div[3]/button");
    //text field "Arrival Date"
    public static By inputArrival = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
    //checking for getting the correct arrival date
    public static By errorArrival = By.xpath("//div[text()='Введите корректную дату']");
    //select "Rental period"
    public static By inputFieldPeriod = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    //choose "Rental period"
    public static By inputChoosePeriod = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    //checking for getting the correct period
    public static By errorPeriod = By.xpath("//div[text()='Введите корректный срок']");
    //label color scooter "black pearl"
    public static By inputColor = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]/input");
    //message about choose color
    public static By errorColor = By.xpath("//div[text()='Выберите цвет']");
    //text field "comment courier"
    public static By inputComment = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");

    //button for the final order: "Order"
    public static By buttonFinalOrder = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    //button "Yes"
    public static By buttonYes = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    //message "the order has been placed"
    public static By message = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");
}
