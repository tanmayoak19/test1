package Scripts;
import UitlityFolder.BasePage;
import Pages.LoginMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginCheck extends BasePage {

    LoginMethods loginMethods;
    //CatalougePage catalougePage;


    @BeforeMethod
    public void setup(){
        loginMethods = new LoginMethods();
      //  catalougePage   =   new CatalougePage();

    }

    @Test
    public void loginFunction(){
        loginMethods.goToUrl();
        loginMethods.loginMethod();
        sleep(5);
       // catalougePage.clickCatalougePageMenuOptions();

       // loginMethods.rememberMe();

    }

    @AfterMethod
    public void tearDown(){
        closeDriver();
    }


}
