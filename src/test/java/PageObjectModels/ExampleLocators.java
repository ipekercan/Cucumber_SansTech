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

    @FindBy(xpath = "(//a[@aria-label='Sans Tech. Homepage'])[1]")
    public WebElement sansTech;
    @FindBy(xpath = "//*[@id=\"footer\"]/div[2]/div[1]/div[1]/address")
    public WebElement address;

}
