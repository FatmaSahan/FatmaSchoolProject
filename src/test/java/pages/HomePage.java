package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;




public class HomePage {
    public HomePage() { PageFactory.initElements(Driver.getDriver(), this); }






        //Erkan
        @FindBy(id = "username") public WebElement userNameInput;
        @FindBy(id = "password") public WebElement passwordInput;
        @FindBy(xpath = "//button[text()='Login']") public WebElement loginButton;
        @FindBy(xpath = "//*[text()='Menu']") public WebElement menuButton;
        @FindBy(linkText = "Student Management") public WebElement studentManagementLink;
























        //Fatma





























        //Hakan





























        //Hilal





























        //Kamil
        @FindBy(linkText = "Login")
        public WebElement loginLink;



























        //Nur Efsan





























        //Seyma





























        //Seyma Nur





























        //Zehra




















































}
