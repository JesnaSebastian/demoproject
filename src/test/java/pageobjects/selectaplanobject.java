package pageobjects;

import Utilities.scroll;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selectaplanobject extends basepageobject {
    public selectaplanobject(WebDriver driver) {
        super(driver);
        // No need to reassign this.driver = driver; already done in basepageobject
    }

    @FindBy(xpath = "//button[@data-testid='box-plan-card-button'][1]")
    WebElement selectaplanbutton;

    @FindBy(xpath = "//h1[text()='My cart']")
    WebElement mycartpage;

    public void click_selectaplan() {

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
            }

            // Wait until you're navigated to "My cart"
            wait.until(ExpectedConditions.urlContains("plan"));

        } catch (Exception e) {
            System.out.println("Error in clicking select plan button: " + e.getMessage());
        }
    }

    public String txt_mycartpage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(mycartpage));
        return mycartpage.getText();
    }
}
