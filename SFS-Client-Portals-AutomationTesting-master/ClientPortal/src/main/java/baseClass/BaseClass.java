package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    @BeforeMethod

    @Parameters("browser")

    public void setup(String browser) throws Exception {

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\SFS-Client-Portals-AutomationTesting\\ClientPortal\\driver\\geckodriver.exe");
            driver= new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\SFS-Client-Portals-AutomationTesting\\ClientPortal\\driver\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable-gpu");

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\SFS-Client-Portals-AutomationTesting\\ClientPortal\\driver\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();

        } else {

            throw new Exception("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void endTest() {
        driver.close();

    }
}