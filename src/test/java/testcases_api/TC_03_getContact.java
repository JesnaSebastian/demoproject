package testcases_api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import apiPojo.api_constants;

import static io.restassured.RestAssured.given;

public class TC_03_getContact extends TC_01_login{
    @Test(priority = 2)
    public void getContact()
    {
        RestAssured.baseURI=api_constants .baseUrl;
        RestAssured.basePath=api_constants.addContact;

        Response resp=given().header("Authorization","Bearer " + token).contentType(ContentType.JSON).log().all().when().get();
        resp.prettyPrint();

        Assert.assertEquals(resp.statusCode(),200,"response code mismatched");
    }
}
