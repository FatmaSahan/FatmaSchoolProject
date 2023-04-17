package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ViceDeanStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    LessonManagementPage lessonManagementPage = new LessonManagementPage();


    @Given("User goes to the home page")
    public void userGoesToTheHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsurl"));
    }

    @Then("User clicks the login button")
    public void userClicksTheLoginButton() {
        homePage.loginLink.click();
        ReusableMethods.waitFor(1);
    }

    @Then("User enters user name")
    public void userEntersUserName() {
        loginPage.userNameInput.sendKeys(ConfigReader.getProperty("viceDeanUser"));
        ReusableMethods.waitFor(1);
    }

    @Then("User enters user password")
    public void userEntersUserPassword() {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(1);
    }

    @Then("User clicks the login button2")
    public void userClicksTheLoginButton2() {
        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("User clicks on the lessons button")
    public void userClicksOnTheLessonsButton() {
        viceDeanPage.lessonsButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("User enters a valid value in the lesson name text box")
    public void userEntersAValidValueInTheLessonNameTextBox() {
        lessonManagementPage.lessonNameTextBox.sendKeys("mesnevi");
        ReusableMethods.waitFor(1);
    }

    @Then("User enters a valid value in the credit score text box")
    public void userEntersAValidValueInTheCreditScoreTextBox() {
        lessonManagementPage.creditScoreTextBox.sendKeys("7");
        ReusableMethods.waitFor(1);
    }

    @Then("User clicks the submit button")
    public void userClicksTheSubmitButton() {
        lessonManagementPage.submitButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("User sees the message lesson created")
    public void userSeesTheMessageLessonCreated() {
        lessonManagementPage.lessonCreatedMessage.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @And("User enters an invalid value in the lessons name textbox")
    public void userEntersAnInvalidValueInTheLessonsNameTextbox() {
        lessonManagementPage.lessonNameTextBox.sendKeys("  ");
        ReusableMethods.waitFor(1);
    }

    @Then("User sees the error message")
    public void userSeesTheErrorMessage() {
        lessonManagementPage.errorMessage.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @And("User clicks on the compulsory button")
    public void userClicksOnTheCompulsoryButton() {
        lessonManagementPage.compulsoryButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("User enters an invalid value in the credit score text box")
    public void userEntersAnInvalidValueInTheCreditScoreTextBox() {
        lessonManagementPage.creditScoreTextBox.sendKeys("-7");
        ReusableMethods.waitFor(1);
    }

}
