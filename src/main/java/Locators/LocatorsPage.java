package Locators;

import SetupPage.AndroidDriverManager;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LocatorsPage extends AndroidDriverManager {
    //AndroidDriver driver;

    public LocatorsPage(){
        driver =   AndroidDriverManager.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id ="com.androidsample.generalstore:id/nameField")
    public WebElement enterNameField;

    static String enterName    =   System.getProperty("userName");

    public void fillLoginDetails(){
        enterNameField.sendKeys(enterName);
        System.out.println("success");
    }


}
