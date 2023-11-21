package PageObjectModels;

import Utilities.DriverManager;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleLocators extends Methods {
    public ExampleLocators() {
        PageFactory.initElements(DriverManager.get(), this);
    }

    @FindBy(xpath = "//a[text()='Giriş']")
    public WebElement login_1;
    @FindBy(xpath = "//input[@name='userNameOrEmailAddress']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[text()='Giriş']")
    public WebElement login_2;
    @FindBy(xpath = "//a[@class='toogle-link']")
    public WebElement accountName;
    @FindBy(xpath = "//a[text()='Profilim']")
    public WebElement account;

}
