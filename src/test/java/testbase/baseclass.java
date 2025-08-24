package testbase;

import Utilities.getdatafromconfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class baseclass extends getdatafromconfig {
    public WebDriver driver;

    @BeforeClass
    public void launchbrowser() {
        String browserfortest = getbrowser("browser");
        String linkforluanchportal = getlink("link");
        if (browserfortest.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get(linkforluanchportal);


        }

    }

    @AfterClass
    public void tear_down() {
        driver.quit();
    }
}
