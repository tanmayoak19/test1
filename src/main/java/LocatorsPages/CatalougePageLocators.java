package LocatorsPages;

import UitlityFolder.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CatalougePageLocators extends BasePage {

    WebDriver driver;

    public CatalougePageLocators(){
        super();
        PageFactory.initElements(getDriver() , this);
        driver  =   this.getDriver();
    }



    @FindBy(how=How.XPATH , using="//div[contains(text() , \"Sauce Labs Backpack\")]")
    public WebElement sauceLabsName;

    @FindBy(how=How.XPATH , using="//a[@id=\"inventory_sidebar_link\"]")
    public WebElement allItems;

    @FindBy(how=How.XPATH , using="//button[@id=\"react-burger-cross-btn\"]")
    public WebElement closeMenuButton;



}


