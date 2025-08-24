package testcases;

import org.testng.annotations.Test;
import pageobjects.shopplanobject;
import testbase.baseclass;

public class TC_01_shopPlanLink extends baseclass {

    @Test
    public void TC_01_selectplnbutton() throws InterruptedException {
        shopplanobject spb = new shopplanobject(driver);
        spb.click_shopplanlink();

    }
}


