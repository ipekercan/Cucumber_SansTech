package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.get().navigate().to("https://sans-technology.com/");
    }


    @When("Scroll to end of the page")
    public void scrollToEndOfThePage() {
        locators.scrollToEnd();
    }

    @Then("Verify that visibility of the address")
    public void verifyThatVisibilityOfTheAddress() {
        locators.verifyEqualsText(locators.address,"İzzet Paşa Mah. Abide-i Hürriyet Cad. Demirören Yatırım Holding No: 162/2 Şişli/ İstanbul");
    }


}
