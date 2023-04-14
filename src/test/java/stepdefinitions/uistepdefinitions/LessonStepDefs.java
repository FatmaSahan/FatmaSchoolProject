package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LessonStepDefs {


    LessonPage lessonPage=new LessonPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker = new Faker();
    public static String lessonName;
    String actual,actualLessonName;
    public static int counterr;

    @When("clicks on the Lesson Management link")
    public void clicks_on_the_lesson_management_link() {
    lessonPage.lessonManagementLink.click();
    }

    @When("clicks on the Lesson Program tab on the page")
    public void clicks_on_the_lesson_program_tab_on_the_page() {
    lessonPage.lessonProgramTab.click();
    actions.sendKeys(Keys.TAB).perform(); }

    @When("selects a lesson from the Choose Lesson dropdown list")
    public void selects_a_lesson_from_the_choose_lesson_dropdown_list() {
        actions.sendKeys("T18BTT",Keys.ENTER).perform();
    }
    @When("selects a term from the Choose Term dropdown list")
    public void selects_a_term_from_the_choose_term_dropdown_list() {
        new Select(lessonPage.educationTermSelect).selectByVisibleText("FALL_SEMESTER");
    }
    @When("selects a day from the Choose Day dropdown list")
    public void selects_a_day_from_the_choose_day_dropdown_list() {
        new Select(lessonPage.chooseDaySelect).selectByVisibleText("MONDAY");
    }
    @When("verifies that the Start Time textbox displays the text Required")
    public void verifies_that_the_start_time_textbox_displays_the_text_required() {
         Assert.assertTrue(lessonPage.startRequired.isDisplayed());
    }
    @When("enters a valid start time in the Start Time textbox")
    public void enters_a_valid_start_time_in_the_start_time_textbox() {
        lessonPage.startTimeInput.sendKeys("0900");
        actions.sendKeys(Keys.TAB,Keys.TAB,"1200",Keys.TAB,Keys.TAB,Keys.ENTER).perform();
    }
    @When("verifies that the Stop Time textbox displays the text Required")
    public void verifies_that_the_stop_time_textbox_displays_the_text_required() {
        Assert.assertTrue(lessonPage.stopRequired.isDisplayed());
    }
    @When("enters a valid stop time in the Stop Time textbox")
    public void enters_a_valid_stop_time_in_the_stop_time_textbox() {
    Driver.wait(1);
    }
    @When("clicks on the Submit button")
    public void clicks_on_the_submit_button() {
     Driver.wait(1);
    }
    @Then("confirms that the lesson program is created successfully")
    public void confirms_that_the_lesson_program_is_created_successfully() {
    String expected="Created Lesson Program";
    Assert.assertEquals(actual,expected);
    }
    @And("waits for the message to be displayed")
    public void waitsForTheMessageToBeDisplayed() {
        actual=lessonPage.createdMessage.getText();
        System.out.println("actualData = " + actual);
    }

    @And("clicks on the Lessons tab and create lesson")
    public void clicksOnTheLessonsTabAndCreateLesson() {
        lessonPage.lessonsTab.click();
        lessonName=faker.educator().course();
        actions.sendKeys(Keys.TAB,lessonName,Keys.TAB,Keys.SPACE,
                Keys.TAB,"6",Keys.TAB,Keys.ENTER).perform();
    }

    @And("selects a lesson from the Created Lesson dropdown list")
    public void selectsALessonFromTheCreatedLessonDropdownList() {
        actions.sendKeys(lessonName,Keys.ENTER).perform();
    }

    @And("Selects the line with the lesson name")
    public void selectsTheLineWithTheLessonName() {
        WebElement findLessonName=Driver.getDriver().findElement(By.xpath("(//table[@class='table table-striped table-bordered table-hover'])[3]//tbody//tr[" + counterr + "]//td[1]"));
        actions.sendKeys(Keys.PAGE_UP).perform();
        Driver.wait(2);
        actions.doubleClick(findLessonName).perform();
        actualLessonName=findLessonName.getText();
        System.out.println("findLessonName = " + findLessonName.getText());
    }

    @And("find the lesson name from the Lesson Program List")
    public void findTheLessonNameFromTheLessonProgramList() {
        int end = 0, repeat = 0, sayac = 0;
        String[] page = lessonPage.pagesTotal.getText().split(" ");
        int pageLength = Integer.parseInt(page[(page.length) - 1]);
        System.out.println("pageLength = " + pageLength);
        int lessonNameSum = pageLength * 20;
        System.out.println("lessonNameSum = " + lessonNameSum);
        try {
            while (repeat <= lessonNameSum) {
                counterr = 0;
                for (WebElement w : lessonPage.lessonNameList) {
                    System.out.println("Sayfadaki dersler : " + w.getText());
                    repeat++;
                    counterr++;
                    sayac++;
                    if (w.getText().equals(lessonName)) {
                        System.out.println("sayac = " + sayac);
                        System.out.println("counter = " + counterr);
                        end++;
                        break;
                    }
                }
                if (end > 0) break;
                Driver.wait(2);
                Driver.clickWithJS(lessonPage.forwardLesson);
                Driver.wait(2);
            }
        } catch (Exception e) { }
        System.out.println("lessonName = " + lessonName);
        System.out.println("counterr = " + counterr);

    }

    @And("verify course name found")
    public void verifyCourseNameFound() {
        Assert.assertEquals(lessonName,actualLessonName);
    }
}

