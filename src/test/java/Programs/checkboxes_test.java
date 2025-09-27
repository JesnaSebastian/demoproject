package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class checkboxes_test {
    public WebDriver driver;
    @Test(groups = {"sanity"})
            public void chkbox() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

       // driver.findElement(By.xpath("//input[@id='sunday']")).click();
        List<WebElement> all_chkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        //for(WebElement allcheckbox: all_chkbox){
          //  allcheckbox.click();
            //allcheckbox.click();
        //}

        for(int i=0;i<3;i++)
        {
            all_chkbox.get(i).click();
        }


        Thread.sleep(5000);

        driver.quit();
    }


}
