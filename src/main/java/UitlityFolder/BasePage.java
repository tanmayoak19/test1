package UitlityFolder;

import WebDriverSetup.DriverSetupFile;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage extends DriverSetupFile{
    WebDriver driver;
    WebDriverWait wait  =   new WebDriverWait(getDriver(), Duration.ofMillis(60));

    public BasePage(){
        driver = getDriver();
    }

    public void goToURL(String url){
        driver.manage().window().maximize();
        driver.get(url);
    }


    public WebElement waitForPresenceOfElement(By selector){
        WebElement element = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(selector));
        return element;
    }

    public WebElement waitForElementToBeVisible(WebElement element){
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void sleep(int sec){
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
