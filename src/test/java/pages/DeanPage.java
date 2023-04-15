package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class DeanPage {
    public DeanPage() { PageFactory.initElements(Driver.getDriver(), this); }






        //Erkan





























        //Fatma





























        //Hakan





























        //Hilal





























        //Kamil
    @FindBy(xpath="//tr[1]//td[1]")    public WebElement nameSurname;
    @FindBy(xpath="//tr[1]//td[2]")    public WebElement gender;
    @FindBy(xpath="//tr[1]//td[3]")    public WebElement phoneNumber;
    @FindBy(xpath="//tr[1]//td[4]")    public WebElement ssn;
    @FindBy(xpath="//tr[1]//td[5]")    public WebElement userName;
    @FindBy(xpath="(//button[contains(text(),'Edit')])[13]")    public WebElement editButton;
    @FindBy(xpath="//tr[1]//td[7]")    public WebElement deleteButton;
    @FindBy(xpath="//tr//td[5]")    public List<WebElement> deanUserNameList;
    @FindBy(xpath="//*[text()='›']")    public WebElement forwardButton;
    @FindBy(xpath="//*[contains(text(),'Page')]")    public WebElement pagesSum;
    @FindBy(xpath = "(//input[@placeholder='Name'])[2]")    public WebElement nameInput;
    @FindBy(xpath ="(//input[@placeholder='Surname'])[2]")    public WebElement surNameInput;
    @FindBy(xpath="(//input[@class='form-check-input'])[4]")    public WebElement genderChckBox;
    @FindBy(xpath ="(//input[@placeholder='Phone Number'])[2]")    public WebElement phoneNumberInput;
    @FindBy(xpath ="(//input[@placeholder='ssn'])[2]")    public WebElement ssnInput;
    @FindBy(xpath ="(//input[@placeholder='username'])[2]")    public WebElement userNameInput;
    @FindBy(xpath ="(//input[@placeholder='Password'])[2]")    public WebElement passwordInput;
    @FindBy(xpath="(//button[contains(text(),'Submit')])[2]")    public WebElement submitButton;
    @FindBy(xpath="//div[@role='alert']")    public WebElement messageAlert;










       //Nur Efsan





























        //Seyma





























        //Seyma Nur





























        //Zehra










































}
