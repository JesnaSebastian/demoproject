package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class shopplanobject extends basepageobject {
    public shopplanobject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Shop plans']")
    WebElement shoplanlink;

    public void click_shopplanlink() {
        shoplanlink.click();

    }

}
