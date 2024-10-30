/*package rest_assured.put;

import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import junit.framework.Assert;
import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.junit.Test;


public class Put {

    @Test
    public void UpdateRecordsWinthPut(){
        int empid = 15410;
        RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "TestDate");
        requestParams.put("age", 23);
        requestParams.put("salary", 12000);
        request.body(requestParams.toJSONString());
        Response response = request.put("/update/"+ empid);
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);
    }
}*/
