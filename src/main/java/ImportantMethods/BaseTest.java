package ImportantMethods;

import SetupPage.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseTest extends AndroidDriverManager {

    WebDriverWait wait  =   new WebDriverWait(driver, 20);

    public List<WebElement> waitForElementsToBeVisible(By selector){
        List<WebElement> element   =wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selector));
        return  element;
    }

    public WebElement waitForElementToBeVisible(WebElement element){
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitForElementToBeVisible(By element){
        WebElement webElement= wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(element));
        return webElement;
    }

    public WebElement waitForElementsToBeVisible(WebElement elements){
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElements(elements));
        return elements;
    }
}
