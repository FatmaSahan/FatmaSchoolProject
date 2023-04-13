package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import pages.DeanPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

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

