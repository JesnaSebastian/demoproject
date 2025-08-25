package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scroll {
    public WebDriver driver;
    // Constructor to receive WebDriver
    public scroll(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollbypixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
    public  void scrolltoanelement()
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement ele= driver.findElement(By.xpath("//li[@aria-label='1 / 4']//button[@type='button'][normalize-space()='Select plan']"));
        js.executeScript("arguments[0].scrollIntoview(true);",ele);
    }
}
