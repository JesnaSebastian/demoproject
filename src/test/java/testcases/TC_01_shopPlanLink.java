package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.shopplanobject;
import testbase.baseclass;

public class TC_01_shopPlanLink extends baseclass {

    @Test(groups = {"regression"})
    public void TC_01_selectplnbutton() throws InterruptedException {
        logger.info("Starting TC_01 and Website opened");
        shopplanobject spb = new shopplanobject(driver);
        spb.click_shopplanlink();
        logger.info("Clicked on Shop plans link");
        String nxtpage_validation=spb.gettxt_selectaplanpage();
        Assert.assertEquals(nxtpage_validation,"Select a plan for You","invalid page");

    }
}


