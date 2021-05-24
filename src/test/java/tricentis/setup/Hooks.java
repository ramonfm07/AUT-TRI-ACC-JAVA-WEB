package tricentis.setup;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    public static WebDriver driver;
    public static ResourceBundle bundle = ResourceBundle.getBundle("project");



    @Before
    public void startTest(Scenario scenario) throws IOException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(bundle.getString("env.url"));
        
        driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
        
        
    }

    @After
    public void tearDown(Scenario scenario) {
        driver.close();
    }


    public static WebDriver getDriver() {
        return driver;
    }

}