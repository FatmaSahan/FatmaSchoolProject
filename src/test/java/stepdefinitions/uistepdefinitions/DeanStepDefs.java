package stepdefinitions.uistepdefinitions;
import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DeanPage;
import utilities.ReusableMethods;


public class DeanStepDefs {

    public static String actualData;
    public static int counter;
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surName = faker.name().lastName();
    String username = faker.name().username();
    DeanPage deanPage = new DeanPage();


    @Then("checks the Name Surname field")
    public void checks_the_name_surname_field() {
        Assert.assertNotEquals(null, deanPage.nameSurname.getText());
    }

    @Then("checks the Gender field")
    public void checks_the_gender_field() {
        Assert.assertNotEquals(null, deanPage.gender.getText());
    }

    @Then("checks the Phone Number field")
    public void checks_the_phone_number_field() {
        Assert.assertNotEquals(null, deanPage.phoneNumber.getText());
    }

    @Then("checks the Ssn field")
    public void checks_the_ssn_field() {
        Assert.assertNotEquals(null, deanPage.ssn.getText());
    }

    @Then("checks the User Name field")
    public void checks_the_user_name_field() {
        Assert.assertNotEquals(null, deanPage.userName.getText());
    }

    @And("verifies dean deleted")
    public void verifiesDeanDeleted() {

        String expected = "Dean Deleted succesfully";
        Assert.assertEquals(expected, actualData);
    }

    @And("Selects the line with the name {string}")
    public void selectsTheLineWithTheName(String string) {
        int end = 0, repeat = 0, sayac = 0;
        String[] page = deanPage.pagesSum.getText().split(" ");
        int pageLength = Integer.parseInt(page[(page.length) - 1]);
        int userNameSum = pageLength * 20;
        try {
            while (repeat <= userNameSum) {
                counter = 0;
                for (WebElement w : deanPage.deanUserNameList) {
                    System.out.println("Sayfadaki isimler : " + w.getText());
                    repeat++;
                    counter++;
                    sayac++;
                    if (w.getText().equals(string)) {
                        System.out.println("sayac = " + sayac);
                        System.out.println("counter = " + counter);
                        end++;
                        break;
                    }
                }
                if (end > 0) break;
                ReusableMethods.waitFor(2);
                ReusableMethods.cl(deanPage.forwardButton);
                Driver.wait(2);
            }
        } catch (Exception e) {

        }
    }

    @And("user clicks the Edit button")
    public void userClicksTheEditButton() {

        Driver.clickWithJS(Driver.getDriver().findElement(By.xpath("(//button[contains(text(),'Edit')])[" + counter + "]")));
    }

    @And("user clicks the Delete button")
    public void userClicksTheDeleteButton() {
        Driver.clickWithJS(Driver.getDriver().findElement(By.xpath("(//button[contains(text(),'Delete')])[" + counter + "]")));
    }

    @And("updates the Name field")
    public void updatesTheNameField() {
    deanPage.nameInput.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
    deanPage.nameInput.sendKeys(name);
    }

    @When("updates the Surname field")
    public void updates_the_surname_field() {
        deanPage.surNameInput.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        deanPage.surNameInput.sendKeys(surName);
    }

    @When("updates the Gender field")
    public void updates_the_gender_field() {
        Driver.clickWithJS(deanPage.genderChckBox);
    }

    @When("updates the Phone Number field")
    public void updates_the_phone_number_field() {
        deanPage.phoneNumberInput.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        String phoneNumber = String.valueOf(faker.number().randomNumber(10, true));
        phoneNumber=phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);
        Driver.wait(2);
        deanPage.phoneNumberInput.sendKeys(phoneNumber);
        System.out.println(phoneNumber); // 656123
    }

    @When("updates the Ssn field")
    public void updates_the_ssn_field() {
        deanPage.ssnInput.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        String ssn = faker.idNumber().ssnValid();
        deanPage.ssnInput.sendKeys(ssn);
        System.out.println("ssn = " + ssn);
      }

    @When("updates the User Name field")
    public void updates_the_user_name_field() {
        deanPage.userNameInput.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        deanPage.userNameInput.sendKeys(username);
    }

    @When("user clicks the submit button")
    public void user_clicks_the_submit_button() {
        Driver.clickWithJS(deanPage.submitButton);
    }

    @When("verifies dean updated")
    public void verifies_dean_updated() {

        String expected = "Dean updated Successful";
        Assert.assertEquals(expected, actualData);

    }

    @And("updates the password fied")
    public void updatesThePasswordFied() {
        deanPage.passwordInput.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        deanPage.passwordInput.sendKeys("122345678");
    }
    @And("user waits for the message to be displayed")
    public void userWaitsForTheMessageToBeDisplayed() {

    actualData=Driver.waitAndGetText(deanPage.messageAlert,15);
        System.out.println("actualData = " + actualData);
    }
}
