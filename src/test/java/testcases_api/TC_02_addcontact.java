package testcases_api;
import apiPojo.addcontact_pojo;
import apiPojo.login_Pojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import apiPojo.api_constants;
import Utilities.getdatafromconfig;
import  Utilities.faker;

import static io.restassured.RestAssured.given;


public class TC_02_addcontact {
    String token=null;
    @Test(priority = 1)
    public void login()
    {
        RestAssured.baseURI=api_constants.baseUrl;
        RestAssured.basePath=api_constants.loginEndPoint;

        login_Pojo lp=new login_Pojo();
        lp.setEmail(getdatafromconfig.getapiemail());
        lp.setPassword(getdatafromconfig.getapipwd());

        Response resp= given().contentType(ContentType.JSON).log().all().body(lp).when().post();
        resp.prettyPrint();
        token=resp.then().extract().path("token");
        System.out.println("token"+token);
        int responsecode=resp.getStatusCode();
        System.out.println("response code "+responsecode);

        Assert.assertEquals(responsecode,200,"TC failed, response code is not success");
    }
    @Test(priority = 2)
    public void add_contact()
    {
        RestAssured.baseURI=api_constants.baseUrl;
        RestAssured.basePath=api_constants.addContact;

        addcontact_pojo acp=new addcontact_pojo();
        acp.setFirstName(faker.addfirstname());
        acp.setLastName(faker.addLastName());
        acp.setBirthdate(faker.generateBirthdate());
        acp.setEmail(faker.addEmail());
        acp.setPhone(faker.phonenum());
        acp.setStreet1(faker.Street1());
        acp.setStreet2(faker.Street2());
        acp.setCity(faker.city());
        acp.setPostalCode(faker.postalcode());
        acp.setCountry(faker.country());

        Response resp=given().header("Authorization","Bearer " + token).contentType(ContentType.JSON).log().all().body(acp).when().post();
        resp.prettyPrint();
        Assert.assertEquals(resp.statusCode(),201,"response code mismatch");
    }
}
