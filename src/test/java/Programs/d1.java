package Programs;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class d1 {
    WebDriver driver;

    @Test(groups = {"sanity"})
    public void dummy1() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mvne:eef8b5c6ee227eb435f875508e8c5df6@waas.t-mobile.com");

        try {
            // Explicit wait for button to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@data-testid='section-hero-area-button-primary']")));

            // Scroll into view (if needed)
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
            ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='50%';");


            // Small wait after scroll
            Thread.sleep(5000);

            // Use JavaScript click if normal click fails
            try {
                button.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("Click intercepted, using JavaScript executor.");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
            }

            // Wait for navigation (modify this based on what happens next)
            wait.until(ExpectedConditions.urlContains("plan"));  // Update with expected URL part if known

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
