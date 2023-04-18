package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//*[@ class='header_link me-2']")
        public WebElement TopRegisterButton;

        @FindBy(xpath =" //*[@ id='name']")
        public WebElement NameTextBox;

        @FindBy(xpath ="//*[@ id='surname']")
        public WebElement SurNameTextBox;

        @FindBy(xpath ="//*[@ id='birthPlace']")
        public WebElement BirthPlaceTextBox;

        @FindBy(xpath ="//*[@ id='phoneNumber']")
        public WebElement PhoneBox;

       // @FindBy(xpath ="//*[@ value='FEMALE']")
     //   public WebElement Female;

     //   @FindBy(xpath ="//*[@ value='MALE']")
    //    public WebElement Male;

        @FindBy(id = "birthDay")
        public WebElement DateOfBirthBox ;

        @FindBy(xpath =" //*[@ id='ssn']")
        public WebElement SsnBox ;

        @FindBy(xpath ="//*[@ id='username'] ")
        public WebElement UserNameBox ;

        @FindBy(xpath =" //*[@ id='password']")
        public WebElement PasswordBox ;

        @FindBy(xpath ="(//button[@type='button'])[3]")
        public WebElement BottomRegisterButton ;

    @FindBy(xpath ="//*[@value='FEMALE']")
    public WebElement female;


    @FindBy(xpath ="//*[@ value='MALE']")
    public WebElement male;

    @FindBy(xpath ="//*[@ class='page justify-content-center align-items-center']")
    public WebElement page;




    @FindBy(xpath ="(//*[text()='Required'])[1]")
    public WebElement RequiredText;

  //  @FindBy(xpath ="(//*[text()='Required'])[2]")
 //  public WebElement SurnameRequiredText;

 //  @FindBy(xpath ="(//*[text()='Required'])[3]")
 //  public WebElement BirtPlaceRequiredText;

 //  @FindBy(xpath ="(//*[text()='Required'])[4]")
 //  public WebElement PhoneRequiredText;

 //  @FindBy(xpath ="//*[text()='Required'])[5]")
 //  public WebElement DateOfBirthRequiredText;

 //  @FindBy(xpath ="(//*[text()='Required'])[6]")
 //  public WebElement SsnRequiredText;

 //  @FindBy(xpath ="(//*[text()='Required'])[7]")
 //  public WebElement UserNameRequiredText;

 //  @FindBy(xpath ="(//*[text()='Required'])[8]")
 //  public WebElement PasswordRequiredText;

        @FindBy(xpath ="//*[@ class='nav-link'][5]")
        public WebElement ContactButon ;

        @FindBy(xpath ="//input[@ id='name']")
        public WebElement NameBox ;

        @FindBy(xpath ="//input[@ id='email']")
        public WebElement EmailBox ;

        @FindBy(xpath ="//input[@ id='subject']")
        public WebElement SubjectBox ;

        @FindBy(xpath ="//*[@ id='message']")
        public WebElement MessageBox;

        @FindBy(xpath ="//*[text()='Send Message']")
        public WebElement SendMessageButton ;

       @FindBy(xpath ="//div[contains(text(),'Contact Message Created Successfully')]") //*[text()='Contact Message Created Successfully']
       public WebElement ConfirmMessage;

    @FindBy(xpath ="//div[contains(text(),'Please enter valid email')]")  //div[text()='Please enter valid email']
    public WebElement InvalidEmailMessage;

    @FindBy(xpath ="//*[text()='Guest User registered.']")
    public WebElement GuestUserRegisteredText;

    @FindBy(xpath ="//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement SsnWarningText;

    @FindBy(xpath ="//div[text()='Minimum 8 character']")
    public WebElement PasswordWarningText;





    }







