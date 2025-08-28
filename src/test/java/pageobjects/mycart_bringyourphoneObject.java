package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mycart_bringyourphoneObject extends basepageobject{

    public mycart_bringyourphoneObject(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Bring your own phone']")
    WebElement bringyourpgonebutton;

    @FindBy(xpath = "//h1[@class='mvne-title']") WebElement simtypepageheading;

    public void click_bringyourphone()
    {
        bringyourpgonebutton.click();
    }
    public String simtypepagevalidation()
    {
        String simtypeheading = simtypepageheading.getText();
        return simtypeheading;
    }



}
