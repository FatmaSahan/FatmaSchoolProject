package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;





public class AdminPage {
    public AdminPage() { PageFactory.initElements(Driver.getDriver(), this); }





        //Erkan
        @FindBy(linkText = "Login")
        public WebElement loginLink2222;



























        //Fatma





























        //Hakan





























        //Hilal





























        //Kamil
    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menuButton;

    @FindBy(linkText = "Dean Management")
    public WebElement deanManagementLink;
























        //Nur Efsan





























        //Seyma





























        //Seyma Nur





























        //Zehra




















































}
