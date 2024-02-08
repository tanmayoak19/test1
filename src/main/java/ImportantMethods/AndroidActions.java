//package ImportantMethods;
//
//import com.google.common.collect.ImmutableMap;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
//
//public class AndroidActions {
//
//    AndroidDriver driver;
//
//
//
//    public void longPressAction(WebElement element){
//        ((JavascriptExecutor) driver).executeScript("mobile :longClickGesture",
//                ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"duration",2000));
//
//    }
//    public void doubleClickAction(WebElement element){
//        ((JavascriptExecutor) driver).executeScript("mobile :longClickGesture",
//                ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
//
//    }
//
//    public void clickAction(WebElement element){
//        ((JavascriptExecutor) driver).executeScript("mobile :longClickGesture",
//                ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
//
//    }
//}
