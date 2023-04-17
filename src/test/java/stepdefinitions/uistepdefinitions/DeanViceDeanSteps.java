package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DeanPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DeanViceDeanSteps {
    Faker faker=new Faker();
    LoginPage loginPage=new LoginPage();
    DeanPage deanPage=new DeanPage();
    @Given("the user goes to the given URL")
    public void theUserGoesToTheGivenURL() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsurl"));
    }

    @When("the user clicks on the Login button")
    public void theUserClicksOnTheLoginButton() {
    loginPage.login.click();


    }

    @And("enters a valid value in the User Name field")
    public void entersAValidValueInTheUserNameField() {
        loginPage.userNameInput.sendKeys(ConfigReader.getProperty("deanid"));
    }

    @And("enters a valid value in the Password field")
    public void entersAValidValueInThePasswordField() {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("deanpassword"));
    }

    @And("enters a valid value in the surname field")
    public void entersAValidValueInTheSurnameField() {
        deanPage.surnameTextbox.sendKeys(faker.name().lastName());
    }

    @And("enters a valid value in the birthplace field")
    public void entersAValidValueInTheBirthplaceField() {
        deanPage.birtplaceTextBox.sendKeys(faker.address().city());
    }

    @And("selects a gender option")
    public void selectsAGenderOption() {
        deanPage.femaleGenderbutton.click();
        deanPage.maleGenderbutton.click();

    }

    @And("enters a valid value in the Date Of Birth field")
    public void entersAValidValueInTheDateOfBirthField() {
        deanPage.dateofBirth.sendKeys(ConfigReader.getProperty("dateofbirth"));

    }

    @And("enters a valid value in the Phone field")
    public void entersAValidValueInThePhoneField() {
        deanPage.phoneNumberdean.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        String phoneNumber = String.valueOf(faker.number().randomNumber(10, true));
        phoneNumber=phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);
        Driver.wait(2);
        deanPage.phoneNumberdean.sendKeys(phoneNumber);
        System.out.println(phoneNumber);
    }

    @And("enters a valid value in the SSN field")
    public void entersAValidValueInTheSSNField() {
        deanPage.ssninputdean.sendKeys(faker.idNumber().ssnValid());
    }

    @And("enters a valid value in the username field")
    public void entersAValidValueInTheUsernameField() {
        deanPage.usernameInputdean.sendKeys(faker.name().username());
    }

    @And("confirms the error message in the name fields")
    public void confirmsTheErrorMessageInTheNameFields() {
        Assert.assertEquals(deanPage.requiredname.getText(),(ConfigReader.getProperty("requiredText")));
    }

    @And("confirms the error message in the surname fields")
    public void confirmsTheErrorMessageInTheSurnameFields() {
        Assert.assertEquals(deanPage.requiredsurname.getText(),ConfigReader.getProperty("requiredText"));

    }

    @And("enters a valid value in the name field")
    public void entersAValidValueInTheNameField() {
        deanPage.nametextbox.sendKeys(faker.name().name());
    }

    @And("confirms the error message in the birthplace fields")
    public void confirmsTheErrorMessageInTheBirthplaceFields() {
        Assert.assertEquals(deanPage.requiredbirtplace.getText(),ConfigReader.getProperty("requiredText"));
    }


    @And("confirms the error message in the gender fields")
    public void confirmsTheErrorMessageInTheGenderFields() {
        assert deanPage.maleGenderbutton.isSelected();


    }

    @And("confirms the error message in the date of birth fields")
    public void confirmsTheErrorMessageInTheDateOfBirthFields() {
        Assert.assertEquals(deanPage.requiredbirtplace.getText(),ConfigReader.getProperty("requiredText"));

    }

    @And("confirms the error message in the phone fields")
    public void confirmsTheErrorMessageInThePhoneFields() {
        Assert.assertEquals(deanPage.requiredbirtplace.getText(),ConfigReader.getProperty("requiredText"));
    }


    @And("confirms the error message in the SSN fields")
    public void confirmsTheErrorMessageInTheSSNFields() {
        Assert.assertEquals(deanPage.requiredbirtplace.getText(),ConfigReader.getProperty("requiredText"));
    }

    @And("confirms the error message in the username fields")
    public void confirmsTheErrorMessageInTheUsernameFields() {
        Assert.assertEquals(deanPage.required.getText(),ConfigReader.getProperty("requiredText"));
    }


    @And("confirms the error message in the password fields")
    public void confirmsTheErrorMessageInThePasswordFields() {
        Assert.assertEquals(deanPage.requiredbirtplace.getText(),ConfigReader.getProperty("requiredText"));
    }

    @And("User clicks Submit button")
    public void userClicksSubmitButton() {
        deanPage.submitButtondean.click();
    }
}
