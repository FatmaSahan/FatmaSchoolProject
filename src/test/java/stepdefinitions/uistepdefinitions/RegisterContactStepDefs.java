package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;

public class RegisterContactStepDefs {
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();


    @Given("User goes to home page")
    public void user_goes_to_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsurl"));
    }

    @When("Clicks the top ContactButon")
    public void clicks_the_top_contact_buton() {
        registerPage.ContactButon.click();

    }

    @And("Enters at least one character {string} in the NameBox")
    public void entersAtLeastOneCharacterInTheNameBox(String arg0) {

        registerPage.NameBox.sendKeys(arg0);
    }

    @And("Enter {string} in the NameBox")
    public void enterInTheNameBox(String arg0) {
        registerPage.NameBox.sendKeys(arg0);
    }

    @And("Enter name in the NameBox")
    public void enterNameInTheNameBox() {

        registerPage.NameBox.sendKeys(faker.name().firstName());
    }

    @And("Enters email in the EmailBox")
    public void entersEmailInTheEmailBox() {

        registerPage.EmailBox.sendKeys(faker.internet().emailAddress());
    }

    @And("Enters {string} in the EmailBox")
    public void entersInTheEmailBox(String arg0) {

        registerPage.EmailBox.sendKeys(faker.name().name() + "@" + faker.name().name());
    }

    @When("Enters {string} in the SubjectBox")
    public void enters_in_the_subject_box(String string) {

        registerPage.SubjectBox.sendKeys(string);
    }

    @When("Enters {string} in the MessageBox")
    public void enters_in_the_message_box(String string) {
        registerPage.MessageBox.sendKeys(string);
        ReusableMethods.waitFor(1);


    }

    @When("Clicks the Send SendMessageButton")
    public void clicks_the_send_send_message_button() {

        registerPage.SendMessageButton.submit();
        ReusableMethods.waitFor(1);
    }

    @Then("Verifies the visibility of the ConfirmMessage")
    public void verifiesTheVisibilityOfTheConfirmMessage() {
        Assert.assertTrue(registerPage.ConfirmMessage.isDisplayed());

        // String expectedMessage="Contact Message Created Successfully";}
    }

    @Then("Verifies the invisibility of the InvalidNameMessage")
    public void verifiesTheVisibilityOfTheInvalidNameMessage() {
        ReusableMethods.waitForVisibility(registerPage.ConfirmMessage, 4);
        ReusableMethods.hover(registerPage.ConfirmMessage);
        Assert.assertEquals("Please enter valid name", registerPage.ConfirmMessage.getText());

       // Assert.assertTrue(!registerPage.ConfirmMessage.isDisplayed());
    }

    @Then("Verifies the visibility of the  InvalidEmailMessage")
    public void verifiesTheVisibilityOfTheInvalidEmailMessage() {
        Assert.assertTrue(registerPage.InvalidEmailMessage.isDisplayed());
        }


////////////////////////Register Part/////////////////////////
@When("Clicks the TopRegisterButon")
public void clicksTheTopRegisterButon() {

    registerPage.TopRegisterButton.click();
}

    @And("Clics name")
    public void clicsName() {
        registerPage.NameTextBox.click();
    }

    @And("Clics page")
    public void clicsPage() {
        registerPage.page.click();
        ReusableMethods.waitFor(2);
    }

    @Then("If NameRequiredText visibilities enters name in NameTextBox")
    public void ifNameRequiredTextVisibilitiesEntersNameInNameTextBox() {
        Assert.assertEquals("Required", registerPage.RequiredText.getText());
        registerPage.NameTextBox.sendKeys(faker.name().firstName());
    }

    @Then("If SurnameRequiredText visibilities enters surname in SurNameTextBox")
    public void ifSurnameRequiredTextVisibilitiesEntersSurnameInSurNameTextBox() {
        Assert.assertEquals("Required", registerPage.RequiredText.getText());
        registerPage.SurNameTextBox.sendKeys(faker.name().lastName());
    }

    @Then("If BirtPlaceRequiredText visibilities enters birthplace in BirtPlaceRequiredText")
    public void ifBirtPlaceRequiredTextVisibilitiesEntersBirthplaceInBirtPlaceRequiredText() {
        Assert.assertEquals("Required", registerPage.RequiredText.getText());
        registerPage.BirthPlaceTextBox.sendKeys(faker.address().city());
    }

    @Then("If PhoneRequiredText visibilities enters phonenumber in PhoneBox")
    public void ifPhoneRequiredTextVisibilitiesEntersPhonenumberInPhoneBox() {
        Assert.assertEquals("Required", registerPage.RequiredText.getText());
        registerPage.PhoneBox.sendKeys(faker.number().numberBetween(100, 999) + "-"
                + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999));
    }

    @And("Chooses  gender")
    public void choosesGender() {
        actions.sendKeys(Keys.TAB, Keys.SPACE).perform();
    }

    @Then("If DateOfBirthRequiredText visibilities enters dateofbirth in DateOfBirthBox")
    public void ifDateOfBirthRequiredTextVisibilitiesEntersDateofbirthInDateOfBirthBox() {

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        registerPage.DateOfBirthBox.sendKeys(sdf.format(faker.date().birthday()));

        ReusableMethods.waitFor(2);

    }

    @Then("If SsnRequiredText visibilities enters ssn in SsnBox")
    public void ifSsnRequiredTextVisibilitiesEntersSsnInSsnBox() {

        // registerPage.SsnBox.sendKeys(faker.idNumber().ssnValid());
        Assert.assertEquals("Required", registerPage.RequiredText.getText());

        registerPage.SsnBox.sendKeys(faker.number().numberBetween(100, 999) + "-"
                + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999));

    }

    @Then("If UserNameRequiredText visibilities enters username in UserNameText")
    public void ifUserNameRequiredTextVisibilitiesEntersUsernameInUserNameText() {

        Assert.assertEquals("Required", registerPage.RequiredText.getText());
        registerPage.UserNameBox.sendKeys(faker.name().username());
        ReusableMethods.waitFor(2);
    }

    @Then("If PasswordRequiredText visibilities enters {int} character password in PasswordBox")
    public void ifPasswordRequiredTextVisibilitiesEntersCharacterPasswordInPasswordBox(int arg0) {

        Assert.assertEquals("Required", registerPage.RequiredText.getText());
        registerPage.PasswordBox.sendKeys(faker.internet().password((arg0), arg0 + 2));
        ReusableMethods.waitFor(2);

        // SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        // registerPage.DateOfBirthBox.sendKeys(sdf.format(faker.date().birthday()));
    }

    @And("Clicks the BottomRegisterButton")
    public void clicksTheBottomRegisterButton() {
        registerPage.BottomRegisterButton.submit();
    }


    @Then("Verifies the visibility of the GuestUserRegisteredText")
    public void verifiesTheVisibilityOfTheGuestUserRegisteredText() {
        // String expectedData="Guest User registered";
        // String actualData=registerPage.GuestUserRegisteredText.getText();
        // Assert.assertEquals(expectedData,actualData);
        ReusableMethods.waitForVisibility(registerPage.GuestUserRegisteredText, 4);
        ReusableMethods.hover(registerPage.GuestUserRegisteredText);
        Assert.assertEquals("Guest User registered.", registerPage.GuestUserRegisteredText.getText());
    }

    @Then("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }


    @And("Enter ssn without - character in SSN field")
    public void enterSsnWithoutCharacterInSSNField() {
        registerPage.SsnBox.sendKeys(ConfigReader.getProperty("SsnNumber"));
    }

    @Then("Verify visibility of  SsnWarningText")
    public void verifyVisibilityOfSsnWarningText() {

        Assert.assertEquals("Minimum 11 character (XXX-XX-XXXX)", registerPage.SsnWarningText.getText());
    }

    @And("Enters {int} characters in PasswordBox")
    public void entersCharactersInPasswordBox(int arg0) {
        registerPage.PasswordBox.sendKeys(ConfigReader.getProperty("MyPassword"));
    }


    @Then("Verifies visibility of  PasswordWarningText")
    public void verifiesVisibilityOfPasswordWarningText() {
        Assert.assertEquals("Minimum 8 character", registerPage.PasswordWarningText.getText());
    }


}








