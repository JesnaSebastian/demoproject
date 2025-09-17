package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class captureScreenshot {

    public static String captureScreen(WebDriver driver,String tname) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcfile=ts.getScreenshotAs(OutputType.FILE);
        String targetFilePath=System.getProperty("user.home")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";

        File targetfile=new File(targetFilePath);
        FileUtils.copyFile(srcfile,targetfile);
        return targetFilePath;
    }
}
