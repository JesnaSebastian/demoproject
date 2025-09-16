package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.mycart_bringyourphoneObject;
import pageobjects.selectaplanobject;
import pageobjects.shopplanobject;
import testbase.baseclass;

public class TC_03_bringYourPhone extends baseclass {
    @Test(groups = {"regression"})
    public void TC_03_bringurphone() throws InterruptedException {
        logger.info("TC 3 started");
        shopplanobject shopPage = new shopplanobject(driver);
        shopPage.click_shopplanlink();
        logger.info("Clicked on Shop plans link");
        Thread.sleep(5000);

        selectaplanobject sap=new selectaplanobject(driver);
        sap.click_selectaplan();
        logger.info("Plan is selected ");
        Thread.sleep(5000);

        mycart_bringyourphoneObject byp=new mycart_bringyourphoneObject(driver);
        byp.click_bringyourphone();
        logger.info("Clicked on by your phone");
        Thread.sleep(5000);

        String simtypepagevalidation = byp.simtypepagevalidation();
        Assert.assertEquals(simtypepagevalidation,"Select SIM type","failed to navigate navigate to SIM type page");


    }
}
