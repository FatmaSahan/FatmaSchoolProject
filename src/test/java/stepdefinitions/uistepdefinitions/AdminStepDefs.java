package stepdefinitions.uistepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AdminPage;

public class AdminStepDefs {

     AdminPage adminPage = new AdminPage();

    @Given("user clicks on the Menu button")
    public void user_clicks_on_the_menu_button() {
        adminPage.menuButton.click();
    }

    @When("clicks on the Dean Management link")
    public void clicks_on_the_dean_management_link() {

        adminPage.deanManagementLink.click();
    }


}

