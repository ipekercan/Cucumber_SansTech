package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.get().navigate().to("https://kariyer.global-bilgi.com.tr/app/main/home");
    }


    @When("Click login button")
    public void clickLoginButton() { locators.click(locators.login_1);
    }

    @And("Enter credentials and click login button")
    public void enterCredentialsAndClickLoginButton() {
        locators.sendKeys(locators.emailBox,"ipekctn488@gmail.com");
        locators.sendKeys(locators.passwordBox,"Abcd.1234");
        locators.click(locators.login_2);
    }

    @Then("Verify login successfully")
    public void verifyLoginSuccessfully() {
        locators.click(locators.accountName);
        locators.verifyContainsText(locators.account,"Profilim");
    }

}
