package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.shopplanobject;
import testbase.baseclass;

public class TC_01_shopPlanLink extends baseclass {

    @Test(priority = 1)
    public void TC_01_selectplnbutton() throws InterruptedException {
        shopplanobject spb = new shopplanobject(driver);
        spb.click_shopplanlink();
        String nxtpage_validation=spb.gettxt_selectaplanpage();
        Assert.assertEquals(nxtpage_validation,"Select a plan for You","invalid page");

    }
}


