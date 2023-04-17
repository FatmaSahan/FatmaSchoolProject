package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class StudManaPage {
    public StudManaPage() { PageFactory.initElements(Driver.getDriver(), this); }








    //Erkan
    @FindBy(id = "advisorTeacherId") public WebElement studentChooseAdvisorTeacherDropDown;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")  public WebElement nameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")  public WebElement surnameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")  public WebElement birthPlaceRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")  public WebElement emailRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")  public WebElement phoneRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")  public WebElement dateOfBirthRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")  public WebElement ssnRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")  public WebElement userNameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[9]")  public WebElement fatherNameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[10]")  public WebElement motherNameRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[11]")  public WebElement passwordRequired;
    @FindBy(id = "ssn") public WebElement studentSSN;
    @FindBy(id = "password") public WebElement studentPassword;
    @FindBy(id = "name") public WebElement studentName;
    @FindBy(id = "surname") public WebElement studentSurname;
    @FindBy(id = "birthPlace") public WebElement studentBirthPlace;
    @FindBy(id = "email") public WebElement studentEmail;
    @FindBy(id = "phoneNumber") public WebElement studentPhoneNumber;
    @FindBy(xpath = "//*[@value='FEMALE']") public WebElement studentFemaleRadioButton;
    @FindBy(xpath = "//*[@value='MALE']") public WebElement studentMaleRadioButton;
    @FindBy(id = "birthDay") public WebElement studentDateOfBirth;
    @FindBy(id = "username") public WebElement studentUsername;
    @FindBy(id = "fatherName") public WebElement studentFatherName;
    @FindBy(id = "motherName") public WebElement studentMotherName;
    @FindBy(xpath = "//button[contains(text(),'Submit')]") public WebElement studentSubmitButton;
    @FindBy(xpath = "//table//tr[last()]//td[5]") public WebElement lastTD;
    @FindBy(xpath = "//span[.='»']") public WebElement lastPageLink;

    //Fatma





























    //Hakan





























    //Hilal





























    //Kamil





























    //Nur Efsan





























    //Seyma





























    //Seyma Nur





























    //Zehra




















































}
