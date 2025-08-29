package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mycartpSIMObject extends basepageobject {

    public mycartpSIMObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Show pricing details']")
    WebElement showpricingdetails;
    @FindBy(xpath = "//div[@class='mvne-price-total']//p[@class='mvne-whole'][normalize-space()='$30']")
    WebElement total_todayrate;
    @FindBy(xpath = "//div[@class='mvne-price-total']//p[@class='mvne-whole'][normalize-space()='$20']")
    WebElement total_monthlyrate;

    @FindBy(xpath = "//button[contains(@class,'mvne-button') and contains(text(),'Continue')]")
    WebElement continuebutton;
    @FindBy(xpath = "//h1[text()='Create account']")
    WebElement createaccountpageheading;

    public void verifypricingdetails() {
        showpricingdetails.click();
    }

    public String validatetotaltodayrate() {
        String totaltodayratevalidation = total_todayrate.getText();
        return totaltodayratevalidation;
    }

    public String validatetotalmonthlyrate() {
        String totalmonthlyratevalidation = total_monthlyrate.getText();
        return totalmonthlyratevalidation;
    }

    public void click_continue_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continuebutton)).click();
    }

    public String validatecreateaccountpageheader() {
        String createpageheader = createaccountpageheading.getText();
        return createpageheader;
    }
}
