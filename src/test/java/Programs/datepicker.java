package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class datepicker {
    public WebDriver driver;
    public static  void selectFuturedate(WebDriver driver,String year, String month, String date){
        while(true){
            String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(current_year.equals(year)&& current_month.equals(month)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        List<WebElement>all_dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
        for(WebElement dt:all_dates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }
    @Test(groups = {"sanity"})
    public void datepicker()
    {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        String year="2027";
        String month="May";
        String date="10";
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        selectFuturedate(driver,year,month,date);
        driver.quit();
    }
}
