package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectSIMobject extends basepageobject{

    public selectSIMobject(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//p[text()='Physical SIM']")
    WebElement pSIM_select;
    @FindBy(xpath = "//button[normalize-space()='Continue']")WebElement continuebutton;
    @FindBy(css = "button[data-testid='modal-terms-button']") WebElement continuebuttononpopup;
    @FindBy(xpath="//h1[text()='My cart']")WebElement mycartwithpsimadded;
    public void selectPSIM()
    {
        pSIM_select.click();
    }
    public void select_continue_button()
    {
        continuebutton.click();
    }
    public void click_continuebuttonpopup()
    {
        continuebuttononpopup.click();
    }
    public String mycartwithpsimaddedheadr()
    {
        String validatemycartwithpsimadded=mycartwithpsimadded.getText();
        return validatemycartwithpsimadded;
    }


}
