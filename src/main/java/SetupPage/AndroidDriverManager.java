package SetupPage;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;



import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AndroidDriverManager {



    public static  AndroidDriver driver;



    File app   =   new File("D:\\Study Stuff\\Inellij code\\Automation Code\\AppiumAutomationProject\\src\\main\\java\\resources\\base.apk");

    @BeforeSuite
    public void testAppiumMain() throws MalformedURLException {
        Properties prop =   new Properties();
        InputStream input   =   null;
        System.out.println("1");

        try {
            input   =   new FileInputStream("src/capabilities.properties");
            System.out.println("0");
           prop.load(input);

            DesiredCapabilities capabilities =   new DesiredCapabilities();
            capabilities.setCapability("appPath",app.getAbsolutePath());
            //capabilities.setCapability("appPath",prop.getProperty("app"));
            capabilities.setCapability("DevicePlatformName",prop.getProperty("platformName"));
            capabilities.setCapability("deviceName",prop.getProperty("device"));
            capabilities.setCapability("platformVersion",prop.getProperty("OSVersion"));
            capabilities.setCapability("deviceOrientation","Orientation");
            capabilities.setCapability("appPackage", prop.getProperty("pkgName"));
            capabilities.setCapability("appiumVersion",prop.getProperty("appiumVersion"));
            capabilities.setCapability("appActivity", prop.getProperty("appActivity"));
           // capabilities.setCapability("adbExecTime",prop.getProperty("adbExecTimeout"));
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            System.out.println("Initialised Setup");


            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

        public static AndroidDriver getDriver(){
        System.out.println("return driver manager");
            return driver;
        }

    }





