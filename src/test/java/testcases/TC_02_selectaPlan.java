package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.selectaplanobject;
import pageobjects.shopplanobject;
import testbase.baseclass;

public class TC_02_selectaPlan extends baseclass {

    @Test(priority = 2)
    public void TC_02_selectplan() throws InterruptedException {
        shopplanobject shopPage = new shopplanobject(driver);
        shopPage.click_shopplanlink();
        Thread.sleep(5000);

        String planPageHeading = shopPage.gettxt_selectaplanpage();
        Assert.assertEquals(planPageHeading, "Select a plan for You", "Failed to navigate to Select Plan page");

        selectaplanobject selectPlanPage = new selectaplanobject(driver);
        selectPlanPage.click_selectaplan();
        String pageheading=selectPlanPage.txt_mycartpage();
        Assert.assertEquals(pageheading,"My cart","Failed to navigate to Select Plan page");
    }
}
