package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.StudManaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;

public class US15_Vice_Dean_Add_Student_Erkan {

    HomePage homePage = new HomePage();
    StudManaPage studManaPage = new StudManaPage();
    Faker faker = new Faker();
    String studentUsername = faker.name().username();

    @Given("user goes to website")
    public void user_goes_to_website() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsurl"));

    }

    @Then("user clicks login button on the homepage")
    public void user_clicks_login_button_on_the_homepage() {
        ReusableMethods.waitFor(2);
        homePage.loginLink.click();
    }

    @Then("user enters vice dean username and password")
    public void user_enters_vice_dean_username_and_password() {
        ReusableMethods.waitFor(2);
        homePage.userNameInput.sendKeys(ConfigReader.getProperty("viceDeanUser"));
        homePage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(1);

    }

    @Then("user clicks login button")
    public void user_clicks_login_button() {
        homePage.loginButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user clicks menu button")
    public void user_clicks_menu_button() {
        homePage.menuButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user clicks Student Management button")
    public void user_clicks_student_management_button() {
        homePage.studentManagementLink.click();
        ReusableMethods.waitFor(2);
    }

    @Given("user choose an advisor teacher")
    public void user_choose_an_advisor_teacher() {
        ReusableMethods.selectAnItemFromDropdown(studManaPage.studentChooseAdvisorTeacherDropDown, ConfigReader.getProperty("advisorTeacher"));
        ReusableMethods.waitFor(2);
    }

    @Then("user checks all required errors out")
    public void user_checks_all_required_errors_out() {
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.nameRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.surnameRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.birthPlaceRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.emailRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.phoneRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.dateOfBirthRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.ssnRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.userNameRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.fatherNameRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.motherNameRequired.getText());
        Assert.assertEquals(ConfigReader.getProperty("requiredText"), studManaPage.passwordRequired.getText());
        ReusableMethods.waitFor(1);
    }

    @Then("user enters an invalid number in the SSN section")
    public void user_Enters_An_Invalid_Number_InThe_SSN_Section() {
        studManaPage.studentSSN.sendKeys(faker.numerify("##########"));
        ReusableMethods.waitFor(2);
    }

    @Then("ssn error message should be displayed")
    public void ssn_Error_Message_Should_Be_Displayed() {

        Assert.assertEquals("Minimum 11 character (XXX-XX-XXXX)", studManaPage.ssnRequired.getText());
        ReusableMethods.waitFor(1);
    }

    @Then("less than eight characters are entered in the password field")
    public void less_than_characters_are_entered_in_the_password_field() {
        studManaPage.studentPassword.sendKeys(faker.numerify("#######"));
        ReusableMethods.waitFor(2);
    }

    @Then("password error message should be displayed")
    public void password_error_message_should_be_displayed() {

        Assert.assertEquals("Minimum 8 character", studManaPage.passwordRequired.getText());
        ReusableMethods.waitFor(1);
    }

    @Then("user enters a name")
    public void user_enters_a_name() {

        studManaPage.studentName.sendKeys(faker.name().firstName());
    }

    @Then("user enters a surname")
    public void user_enters_a_surname() {

        studManaPage.studentSurname.sendKeys(faker.name().lastName());
    }

    @Then("user enters a birth place")
    public void user_enters_a_birth_place() {
        studManaPage.studentBirthPlace.sendKeys(faker.address().city());
    }

    @Then("user enters an email address")
    public void user_enters_an_email_address() {
        studManaPage.studentEmail.sendKeys(faker.internet().emailAddress());
    }

    @Then("user enters a phone number")
    public void user_enters_a_phone_number() {
        studManaPage.studentPhoneNumber.sendKeys(faker.numerify("###-###-####"));
    }

    @Then("user chooses gender")
    public void user_chooses_gender() {
        studManaPage.studentMaleRadioButton.click();
    }

    @Then("user enters date of birth")
    public void user_enters_date_of_birth() {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        studManaPage.studentDateOfBirth.sendKeys(sdf.format(faker.date().birthday()));
    }

    @Then("user enters a valid SSN number")
    public void user_enters_a_valid_ssn_number() {
        studManaPage.studentSSN.sendKeys(faker.idNumber().ssnValid());
    }

    @Then("user enters an username")
    public void user_enters_an_username() {
        studManaPage.studentUsername.sendKeys(studentUsername);
        System.out.println(studentUsername);
    }

    @Then("user enters a father name")
    public void user_enters_a_father_name() {
        studManaPage.studentFatherName.sendKeys(faker.name().fullName());
    }

    @Then("user enters a mother name")
    public void user_enters_a_mother_name() {
        studManaPage.studentMotherName.sendKeys(faker.name().fullName());
    }

    @Then("user enters a valid password")
    public void user_enters_a_valid_password() {
        studManaPage.studentPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        ReusableMethods.clickByJS(studManaPage.studentSubmitButton);
        ReusableMethods.waitFor(4);
    }

    @Then("user confirms that the student has been saved")
    public void user_confirms_that_the_student_has_been_saved() {
        ReusableMethods.clickByJS(studManaPage.lastPageLink);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(studManaPage.lastTD.getText().contains(studentUsername));
        ReusableMethods.waitFor(2);

    }

    @Then("close the browser")
    public void close_the_browser() {
        ReusableMethods.waitFor(4);
        Driver.closeDriver();
    }


//    @Then("Dean Vice Dean Listin altinda olusturdugu kullanicinin User Namesinin varligini dogrular")
//    public void deanViceDeanListinAltindaOlusturduguKullanicininUserNamesininVarliginiDogrular() {
//        ReusableMethod.scrollWithJS(Driver.getDriver().findElement(By.xpath("//table/tbody/tr[10]")));
//        ReusableMethod.clickWithJS(deanAddViceDeanPage.viceDeanListSonSayfa);
//        ReusableMethod.wait(1);
//        ReusableMethod.scrollWithJS(deanAddViceDeanPage.viceDeanListText);
//        ReusableMethod.wait(2);
//        Assert.assertTrue( deanAddViceDeanPage.viceDeanList.getText().contains(userName) );
//    }
    /*

    @FindBy(xpath = "//span[.='»']") public WebElement viceDeanListSonSayfa;

@FindBy(xpath = "//h5[.='Vice Dean List']") public WebElement viceDeanListText;

@FindBy(xpath = "//table//tr[last()]//td[5]") public WebElement viceDeanList;

     */
}
