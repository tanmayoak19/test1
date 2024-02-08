package TestCasesScripts;




import ImportantMethods.BaseTest;
import Locators.LocatorsPage;
import Locators.LocatorsPageError;
import SetupPage.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class TestCaseOne extends AndroidDriverManager {

    AndroidDriver driver;
    //LocatorsPage locatorsPage  =   new LocatorsPage();
    LocatorsPageError locatorsPageError = new LocatorsPageError();

    @Test
    public void RunLoginTc(){
        driver = AndroidDriverManager.getDriver();
        driver.resetApp();
        locatorsPageError.fillLoginDetails();
        //waitForElementsToBeVisible(locatorsPage.enterNameField);

    }








}
