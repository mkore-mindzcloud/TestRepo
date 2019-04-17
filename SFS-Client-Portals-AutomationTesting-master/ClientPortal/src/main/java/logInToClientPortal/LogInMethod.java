package logInToClientPortal;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import waitMethod.WaitMethod;


public class LogInMethod extends BaseClass {

    WaitMethod wait = new WaitMethod();

    String QaENV= "https://qa-pioneerdev.cs27.force.com/s/login/?portfolio=";

    String UATENV= "https://uat-pioneerdev.cs27.force.com/s/login/?portfolio=";


    public void goToURL(String Portfolio){
        driver.get(UATENV + Portfolio);

    }

    public void logInToURl(String UserId, String PassWord) {
        userName(UserId);
        passWord(PassWord);
        submitButton();

    }

    public void userName(String userName) {
        WebElement Username = driver.findElement(By.id("56:34;a"));
        Username.clear();
        Username.sendKeys(userName);
    }

    public void passWord(String passWord) {
        WebElement Password = driver.findElement(By.id("66:34;a"));
        Password.clear();
        Password.sendKeys(passWord);
    }

    public void submitButton() {
        WebElement SubmitButton = driver.findElement(By.cssSelector("body > div.cCustomCommunityTemplate > div.mainContentArea > div > div.slds-col--padded.contentRegion.comm-layout-column > div > div > div > div > div.device-content.body-content.slds-size_12-of-12 > div > div:nth-child(5) > button"));
        SubmitButton.click();

    }

    public void logOutButton(){
        wait.waitForPageContent("Let's Resolve Your Debt");
        WebElement SubmitButton = driver.findElement(By.cssSelector("#\\33 \\3a 30\\3b a > div > div > a > span.triggerDownArrow.down-arrow"));
        SubmitButton.click();
        driver.findElement(By.linkText("Logout")).click();
        wait.waitForPageContent("Let's Resolve Your Debt");

    }


}