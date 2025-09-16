package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.mycart_bringyourphoneObject;
import pageobjects.selectSIMobject;
import pageobjects.selectaplanobject;
import pageobjects.shopplanobject;
import testbase.baseclass;

public class TC_04_selectSIMobject extends baseclass {
    @Test(groups = {"regression"})

    public void TC_04_selet_SIM() throws InterruptedException {
        logger.info("Test case 4 started");
        shopplanobject shopPage = new shopplanobject(driver);
        shopPage.click_shopplanlink();
        logger.info("Clicked on Shop plans link");
        Thread.sleep(5000);

        selectaplanobject sap=new selectaplanobject(driver);
        sap.click_selectaplan();
        logger.info("Plan is selected");
        Thread.sleep(5000);

        mycart_bringyourphoneObject byp=new mycart_bringyourphoneObject(driver);
        byp.click_bringyourphone();
        logger.info("Clicked on Brinng your phone");
        Thread.sleep(5000);

        selectSIMobject sso=new selectSIMobject(driver);
        sso.selectPSIM();
        logger.info("pSIM selected");
        sso.select_continue_button();
        Thread.sleep(5000);

        sso.click_continuebuttonpopup();
        Thread.sleep(5000);

        String validateheadermycartwithpsim=sso.mycartwithpsimaddedheadr();
        Assert.assertEquals(validateheadermycartwithpsim,"My cart","Failed to navigate to next page");


    }






}
