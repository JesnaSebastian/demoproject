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
    @FindBy(xpath = "//h1[@class='mvne-title']")WebElement selectaplanforyoupage;

    public void click_shopplanlink() {
        shoplanlink.click();

    }
    public String gettxt_selectaplanpage(){
       String nxt_page= selectaplanforyoupage.getText();
       return nxt_page;
    }

}
