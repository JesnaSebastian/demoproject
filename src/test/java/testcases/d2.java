package testcases;

import Utilities.getdatafromconfig;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import testbase.baseclass;

import java.time.Duration;

public class d2 extends getdatafromconfig {
    WebDriver driver;
    @Test(groups = {"sanity"})
    public  void m1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(getlink("link"));
        driver.findElement(By.xpath("//a[text()='Shop plans']")).click();
        Thread.sleep(5000);
        WebElement selectaplanbutton=driver.findElement(By.xpath("//button[@data-testid='box-plan-card-button'][1]"));
        System.out.println(selectaplanbutton.getText());
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(selectaplanbutton));

            // Scroll to the plan button
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectaplanbutton);

            // Optional zoom out (keep if absolutely needed)
            ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='50%';");

            // Wait for button to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(selectaplanbutton));

            // Try clicking
            try {
                selectaplanbutton.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("Click intercepted, using JavaScript executor.");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectaplanbutton);
                Thread.sleep(5000);
            }

            // Wait until you're navigated to "My cart"
            wait.until(ExpectedConditions.urlContains("plan"));

        } catch (Exception e) {
            System.out.println("Error in clicking select plan button: " + e.getMessage());
        }
        WebElement page_heading=driver.findElement(By.xpath("//h1[text()='My cart']"));
        System.out.println(page_heading);
        driver.quit();
    }


    }



