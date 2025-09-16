package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;
import testbase.baseclass;
import Utilities.getdatafromconfig;

import javax.swing.text.Utilities;

public class TC_06_createAccountPage extends baseclass {
    @Test(groups = {"regression"})
    public void TC_06_createAccount() throws InterruptedException {
        shopplanobject shopPage = new shopplanobject(driver);
        shopPage.click_shopplanlink();
        Thread.sleep(5000);

        selectaplanobject sap=new selectaplanobject(driver);
        sap.click_selectaplan();
        Thread.sleep(5000);

        mycart_bringyourphoneObject byp=new mycart_bringyourphoneObject(driver);
        byp.click_bringyourphone();
        Thread.sleep(5000);

        selectSIMobject sso=new selectSIMobject(driver);
        sso.selectPSIM();
        sso.select_continue_button();
        Thread.sleep(5000);

        sso.click_continuebuttonpopup();
        Thread.sleep(5000);

        mycartpSIMObject mcartpSIM= new mycartpSIMObject(driver);
        mcartpSIM.click_continue_button();

        createaccountobject cap=new createaccountobject(driver);
        cap.sendFirstName(getdatafromconfig.get_firstname());
        cap.sendLastName(getdatafromconfig.get_firstname());
        cap.sendemail(getdatafromconfig.get_email());
        cap.sendPassword(getdatafromconfig.get_pwd());
        Thread.sleep(5000);
        cap.sendConfirmPwd(getdatafromconfig.get_pwd());
        Thread.sleep(5000);
        cap.click_continuebutton();
        Thread.sleep(5000);



    }
}
