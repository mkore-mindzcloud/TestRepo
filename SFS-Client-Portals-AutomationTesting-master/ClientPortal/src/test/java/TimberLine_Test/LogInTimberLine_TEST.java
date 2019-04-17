package TimberLine_Test;
import baseClass.BaseClass;
import logInToClientPortal.LogInMethod;
import logInToClientPortal.LogInToPortfolio;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LogInTimberLine_TEST extends BaseClass {

     LogInToPortfolio portFolio = new LogInToPortfolio();
     LogInMethod logIn = new LogInMethod();


    @Test()
    public void logInToUrl_Test() {
        portFolio.logInToPortFolio("Timberline");
        assert (driver.getPageSource().contains("Let's Resolve Your Debt"));

    }

    @Test()
    public void logOutButton(){

        portFolio.logInToPortFolio("Timberline");
        logIn.logOutButton();
        assert (driver.getPageSource().contains("Let's Resolve Your Debt"));
    }


    @Test()
    public void verifyInvalidUserName(){

        logIn.goToURL("Timberline");
        logIn.logInToURl("newcanyonuser123@yopmail.com","canyontest1222");

        String ErrorMessage =driver.findElement(By.cssSelector("#error > div")).getText();
        System.out.println(ErrorMessage);
        Assert.assertEquals(ErrorMessage,"Invalid UserName.");
    }
}
