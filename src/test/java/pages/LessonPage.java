package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class LessonPage {
    public LessonPage() { PageFactory.initElements(Driver.getDriver(), this); }





        //Erkan





























        //Fatma





























        //Hakan





























        //Hilal





























        //Kamil





























        //Nur Efsan





























        //Seyma





























        //Seyma Nur





























        //Zehra







































//kamil

    @FindBy(linkText = "Lesson Management")
    public WebElement lessonManagementLink;

    @FindBy(id="controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramTab;

    @FindBy(xpath="//div[@class=' css-19bb58m']")
    public WebElement chooseLessonInput;

    @FindBy(id="educationTermId")
    public WebElement educationTermSelect;

    @FindBy(id="day")
    public WebElement chooseDaySelect;

    @FindBy(xpath="(//*[text()='Required'])[1]")
    public WebElement startRequired;

    @FindBy(xpath="(//*[text()='Required'])[2]")
    public WebElement stopRequired;

    @FindBy(id="startTime")
    public WebElement startTimeInput;

    @FindBy(xpath="//div[text()='Created Lesson Program']")
    public WebElement createdMessage;

    @FindBy(id="controlled-tab-example-tab-lessonsList")
    public WebElement lessonsTab;

    @FindBy(xpath="(//div[contains(text(),'Page ')])[3]")
    public WebElement pagesTotal;

    @FindBy(xpath="(//table[@class='table table-striped table-bordered table-hover'])[3]//tbody//tr//td[1]")
    public List<WebElement> lessonNameList;

    @FindBy(xpath="(//*[text()='›'])[3]")
    public WebElement forwardLesson;












}
