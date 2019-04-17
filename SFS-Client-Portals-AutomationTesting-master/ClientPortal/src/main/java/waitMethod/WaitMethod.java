package waitMethod;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WaitMethod extends BaseClass {


    public  void sleep(int milliseconds) {

        try {
            Thread.sleep(milliseconds);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void waitForPageContent( final String Content) {

        new WebDriverWait(driver, 20).until((WebDriver d) -> d.getPageSource().contains(Content));
    }


    public void waitForCssSelector(final String Content) {
        new WebDriverWait(driver, 20).until((WebDriver d) -> d.findElement(By.cssSelector(Content)));

    }

    public void waitForID(final String Content) {
        new WebDriverWait(driver, 20).until((WebDriver d) -> d.findElement(By.id(Content)));

    }

    public void waitSleepForPageToLoad() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void windowHandle(WebDriver driver) {

        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
            driver.switchTo().window(subWindowHandler);

        }
    }


}
