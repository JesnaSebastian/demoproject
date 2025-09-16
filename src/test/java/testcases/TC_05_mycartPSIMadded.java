package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;
import testbase.baseclass;

public class TC_05_mycartPSIMadded extends baseclass {
    @Test(groups = {"regression"})
    public void TC_05_mycartPSIMaddedex() throws InterruptedException {
        logger.info("TC 5 started ");
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
        logger.info("Clicked on Bring your phone");
        Thread.sleep(5000);

        selectSIMobject sso=new selectSIMobject(driver);
        sso.selectPSIM();
        sso.select_continue_button();
        logger.info("pSIM is selected");
        Thread.sleep(5000);

        sso.click_continuebuttonpopup();
        Thread.sleep(5000);

        mycartpSIMObject mcartpSIM= new mycartpSIMObject(driver);
        mcartpSIM.verifypricingdetails();
        Thread.sleep(5000);
        String rate_today_total=mcartpSIM.validatetotaltodayrate();
        System.out.println(rate_today_total);
        String rate_monthly_total=mcartpSIM.validatetotalmonthlyrate();
        System.out.println(rate_monthly_total);

        Assert.assertEquals(rate_today_total,"$30","Incorrect total today rate");
        Assert.assertEquals(rate_monthly_total,"$20","Incorrect total monthly rate ");

        mcartpSIM.click_continue_button();
        Thread.sleep(5000);
        String verifyheader=mcartpSIM.validatecreateaccountpageheader();
        System.out.println(verifyheader);
        Assert.assertEquals(verifyheader,"Create account","Failed to navigate to next page ");
    }
}
