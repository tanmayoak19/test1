package Pages;

import LocatorsPages.LoginPageLocators;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginMethods extends LoginPageLocators {
    public LoginMethods(){
        super();
    }


    WebDriverWait wait  =   new WebDriverWait(getDriver(), Duration.ofMillis(60));

    public void goToUrl(){

        goToURL("https://www.saucedemo.com/");
    }

    public void loginMethod(){

        waitForElementToBeVisible(userEmail).sendKeys("standard_user");
        waitForElementToBeVisible(password).sendKeys("secret_sauce");
        waitForElementToBeVisible(submit).click();

    }






}
