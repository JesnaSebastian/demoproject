package testbase;

import Utilities.getdatafromconfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class baseclass extends getdatafromconfig {
    public WebDriver driver;
    String linkforluanchportal = getlink("link");
    //code to use while using test ng. Browser is fetched from testNG
    @BeforeClass
    @Parameters("browser")
    public void launchbowser(String browser)
    {
        switch (browser.toLowerCase()){
            case "chrome":driver=new ChromeDriver();
            break;
            case "firefox":driver=new FirefoxDriver();
            break;
            case "edge":driver=new EdgeDriver();
            break;
            default:System.out.println("Invalid browser name");
            return;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(linkforluanchportal);
        }















    //before adding parameters normal base class

   // public void launchbrowser() {
       // String browserfortest = getbrowser("browser");
       // String linkforluanchportal = getlink("link");

        //if (browserfortest.equalsIgnoreCase("chrome")) {
          //  driver = new ChromeDriver();
            //driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            //driver.get(linkforluanchportal);

      //  }

    //}

    @AfterClass
    public void tear_down() {
        driver.quit();
    }
}
