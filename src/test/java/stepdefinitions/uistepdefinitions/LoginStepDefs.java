package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Then("enters the user name as {string}")
    public void enters_the_user_name_as(String string) {
        loginPage.userNameInput.sendKeys(ConfigReader.getProperty(string));
    }

    @Then("enters the password as {string}")
    public void enters_the_password_as(String string) {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty(string));
    }

    @And("clicks on the Login button")
    public void clicksOnTheLoginButton() {
        loginPage.loginButton.click();
    }




}

