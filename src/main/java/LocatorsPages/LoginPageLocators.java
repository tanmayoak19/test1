package LocatorsPages;

import UitlityFolder.BasePage;
import WebDriverSetup.DriverSetupFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators extends BasePage {

    WebDriver driver;
    public LoginPageLocators(){
        super();
        PageFactory.initElements(getDriver(),this);
        driver  =   this.getDriver();
    }

    @FindBy(how = How.XPATH, using = "//input[@id=\"user-name\"]")
    public WebElement userEmail;

    @FindBy(how  = How.XPATH, using = "//input[@id=\"password\"]")
    public WebElement password;

    @FindBy(how = How.XPATH, using ="//input[@id=\"login-button\"]")
    public WebElement submit;


    }







