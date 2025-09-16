package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class static_webtable {
    public WebDriver driver;

    @Test(groups = {"sanity"})
    public void staticwebable() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        try {
            WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            for (WebElement row : rows) {
                List<WebElement> headers = row.findElements(By.tagName("th"));
                List<WebElement> cells = row.findElements(By.tagName("td"));



                if (!headers.isEmpty()) {
                    // Print header row horizontally
                    for (WebElement header : headers) {
                        System.out.print(header.getText() + "\t");
                    }
                } else {
                    // Print regular row horizontally
                    for (WebElement cell : cells) {
                        System.out.print(cell.getText() + "\t");
                    }
                }
                System.out.println();  // Move to next row

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        finally {
            driver.quit();
        }
    }
}