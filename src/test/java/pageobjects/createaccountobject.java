package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class createaccountobject extends basepageobject{

    public createaccountobject(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//input[@id='form-create-account-first-name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='form-create-account-last-name']")WebElement lastName;
    @FindBy(xpath = "//input[@id='form-create-account-email']")WebElement email;
    @FindBy(xpath = "//input[@id='form-create-account-password']") WebElement passwordfield;
    @FindBy(xpath = "//input[@id='form-create-account-confirm-password']") WebElement confirm_password;
    @FindBy(xpath = "//button[contains(@class,'mvne-button') and contains(text(),'Continue')]")
    WebElement continuebutton;

    public void sendFirstName(String fn){
        firstName.sendKeys(fn);
           }
    public void sendLastName(String ln)  {
        lastName.sendKeys(ln);
    }
    public void sendemail(String em)
    {
        email.sendKeys(em);
    }
    public void sendPassword(String pw)
    {
        passwordfield.sendKeys(pw);
    }
    public void sendConfirmPwd(String cpw)
    {
        confirm_password.sendKeys(cpw);
    }
    public void click_continuebutton()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continuebutton)).click();

    }




}
