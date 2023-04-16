package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class LessonManagementPage {
    public LessonManagementPage() { PageFactory.initElements(Driver.getDriver(), this); }




        //Erkan





























        //Fatma





























        //Hakan





























        //Hilal
        @FindBy(id = "lessonName")
        public WebElement lessonNameTextBox;
        @FindBy(id = "creditScore")
        public WebElement creditScoreTextBox;
        @FindBy(id = "compulsory")
        public WebElement compulsoryButton;
        @FindBy(className = "fw-semibold btn btn-primary btn-lg")
        public WebElement submitButton;
        @FindBy(xpath = "//*[text()='Lesson Created']")
        public WebElement lessonCreatedMessage;
        @FindBy(xpath = "//*[text()='Toastify__toast-container Toastify__toast-container--top-center']")
        public WebElement errorMessage;

















        //Kamil





























       //Nur Efsan





























        //Seyma





























        //Seyma Nur





























        //Zehra






























}
