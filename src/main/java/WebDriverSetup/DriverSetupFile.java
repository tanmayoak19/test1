package WebDriverSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverSetupFile {
    public WebDriver driver;

    public DriverSetupFile(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void closeDriver(){
        driver.close();
    }


}


