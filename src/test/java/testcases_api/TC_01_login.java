package testcases_api;

import Utilities.getdatafromconfig;
import apiPojo.login_Pojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import apiPojo.api_constants;
import Utilities.getdatafromconfig;
import testbase.baseclass;

import static io.restassured.RestAssured.given;


public class TC_01_login {
    String token=null;
    @Test(priority = 1)
    public void login()
    {
        RestAssured.baseURI=api_constants.baseUrl;
        RestAssured.basePath=api_constants.loginEndPoint;

        login_Pojo lp=new login_Pojo();

        lp.setEmail(getdatafromconfig.getapiemail());
        lp.setPassword(getdatafromconfig.getapipwd());

        Response resp=given().contentType(ContentType.JSON).log().all().body(lp).when().post();
        resp.prettyPrint();
        token=resp.then().extract().path("token");
        System.out.println("Token: " + token);

    }
}
