package canyon_Test;

import baseClass.BaseClass;
import logInToClientPortal.LogInMethod;
import logInToClientPortal.LogInToPortfolio;
import org.testng.annotations.Test;

public class LoginCayon_Test extends BaseClass {

    LogInToPortfolio log = new LogInToPortfolio();
    LogInMethod elements = new LogInMethod();


    @Test(enabled = false)
    public void logInToUrl_Test() {
        log.logInToPortFolio("Canyon");
        assert (driver.getPageSource().contains("Let's Resolve Your Debt"));
    }

    @Test()
    public void logOutButton(){
        log.logInToPortFolio("Canyon");
        elements.logOutButton();
        assert (driver.getPageSource().contains("Let's Resolve Your Debt"));
    }

    @Test
    public void verifyInvalidUserName(){


    }
}
