package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;


public class HomeStepDefs {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        homePage.loginLink.click();
    }

    @Given("user is on {string} page")
    public void userIsOnPage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @And("user wait {int} sn")
    public void userWaitSn(int sn) {
        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("close page")
    public void closePage() {
        Driver.closeDriver();
    }

    @And("user press page dowm key")
    public void userPressPageDowmKey() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }


}

